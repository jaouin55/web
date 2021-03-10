package com.model2.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.controller.Controller;

public class ListController implements Controller{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getResultView() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isForward() {
		// TODO Auto-generated method stub
		return false;
	}
}
