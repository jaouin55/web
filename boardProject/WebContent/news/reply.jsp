<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import = "board.model.CommentsDAO" %>
<%@ include file = "/inc/lib.jsp" %>
<%	
	//여기서 쿼리를 수행할 것은 아니지만 계획을 세우기 위해...
	request.setCharacterEncoding("utf-8");

	//String news_id = request.getParameter("news_id");
	//String author = request.getParameter("author");
	//String msg = request.getParameter("msg");
	//String sql = "insert into comments(news_id , author , msg) values("+news_id+",'"+author+"','"+msg+"')";
	
%>
<jsp:useBean id="comments" class="board.model.Comments"/>
<jsp:setProperty property="*" name="comments"/>
<%
	if(new CommentsDAO().insert(comments)==0){
		out.print(getMsgBack("댓글 등록실패"));
	}else{
		out.print(getMsgURL("댓글이 등록되었습니다","detail.jsp?news_id="+comments.getNews_id()));
	}
%>
