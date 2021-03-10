package com.model2.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.controller.Controller;
import com.model2.domain.Notice;
import com.model2.notice.model.NoticeDAO;

public class DetailController implements Controller{
	NoticeDAO noticeDAO = new NoticeDAO();
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3�ܰ�: �˸´� ���� ��ü�� �� ��Ų��
		Notice notice = noticeDAO.select(Integer.parseInt(request.getParameter("notice_id")));
		
		//4�ܰ�: �����Ұ��� �ִٸ� �����ϱ� (������ �ߴٸ� �翬�� �� request ��ü�� jsp���� ��Ƽ� �����ϹǷ�
		//�������ؾ� �Ѵ�..)
		request.setAttribute("notice", notice);
	}
	public String getResultView() {
		return "/view/notice/detail";
	}
	public boolean isForward() {
		return true;
	}
	
}
