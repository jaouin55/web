<%@page import="board.model.MybatisBoardDAO"%>
<%@page import="common.file.FileManager"%>
<%@page import="board.model.Board"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="board.model.BoardDAO"%>
<%@ page contentType="text/html;charset=utf-8"%>
<%@ include file="/inc/lib.jsp"%>
<%request.setCharacterEncoding("utf-8"); %>
<%
	MybatisBoardDAO dao=new MybatisBoardDAO();
		
	//파일업로드인 경우, 파라미터 처리는 파일업로드 컴포넌트를 통해서 한다!!
	//왜? multipart/form-data에 의한 전송 파라미터 파싱한 주체 업로드 컴포넌트라서..
	String saveDir=application.getRealPath("/data");
	
	DiskFileItemFactory factory=new DiskFileItemFactory();
	factory.setRepository(new File(saveDir));//파일의 임시디렉토리 경로 
	factory.setSizeThreshold(2*1024*1024);//파일업로드 사이즈 
	
	
	ServletFileUpload upload=new ServletFileUpload(factory);
	
	List<FileItem> items=upload.parseRequest(request);//요청분석
	Board board = new Board(); //create empty board vo
	
	for(FileItem item : items){
		if(item.isFormField()){
			if(item.getFieldName().equals("board_id")){
				board.setBoard_id(Integer.parseInt(item.getString()));
			}else if(item.getFieldName().equals("filename")){
				board.setFilename(item.getString());
			}else if(item.getFieldName().equals("title")){
				board.setTitle(item.getString());
			}else if(item.getFieldName().equals("writer")){
				board.setWriter(item.getString());
			}else if(item.getFieldName().equals("content")){
				board.setContent(item.getString());
			}
		}else{ //파일 수정을 위해, 업로드된 파일이 발견된다면..
			if(item.getName().length() >0){//파일명이 잇다면..즉 업로드 한다면..
				//기존파일은 삭제하자 
				System.out.println("삭제할 파일 : " + saveDir+"/"+board.getFilename());		
				FileManager.deleteFile(saveDir+"/"+board.getFilename());//기존 파일 지우기
				
				//새로운 파일 처리 
				String newName = System.currentTimeMillis()+"."+FileManager.getExtend(item.getName());
				item.write(new File(saveDir+"/"+newName));
				board.setFilename(newName);//새로 만들어진 이름을 vo에 넣어줘야 db에도 업데이트 된다 
			}
		}	
	}
	
	int result = dao.update(board);
	if(result==0){
		out.print(getMsgBack("수정실패"));
	}else{
		out.print(getMsgURL("수정성공", "/board/detail.jsp?board_id="+board.getBoard_id()));
	}
%>

