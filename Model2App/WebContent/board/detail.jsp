<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    function registform(){
    document.controoler
    }
    "/comment/regist.do":com.comment.controller.Regist.jsp
    
    function registComment(){
    $.ajax{{
    url : "/comment/regist.do",
    type:"post",
    data:{
    	msg:$("input[name='msg']").val(),
    	author:$("input[name='authlor]").val();
    	board_id:<%=board.getBoard_id() %>
    	
    //vo에 담기
    Comment comment = new Comment();
    comment.setMsg(msg);
    comment.setauthor(author);