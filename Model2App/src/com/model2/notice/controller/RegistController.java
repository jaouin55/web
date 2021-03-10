package com.model2.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.controller.Controller;
import com.model2.domain.Notice;
import com.model2.notice.model.NoticeDAO;

public class RegistController implements Controller{
	NoticeDAO noticeDAO=new NoticeDAO();
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Notice notice = new Notice();//create empty vo
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		String msg = request.getParameter("msg");
		String author = request.getParameter("author");
		String board_id = request.getParameter("board_id");
		notice.setTitle(title);
		notice.setWriter(writer);
		notice.setContent(content);
		
		
		int result = noticeDAO.insert(notice);
		
	}
	public String getResultView() {
		return null;
	}
	@Override
	public boolean isForward() {
		return false;
	}
}




