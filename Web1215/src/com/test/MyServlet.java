/*
 * 오직 javaEE기반의 웹서버에서만 실행 될 수 있는 클래스를 가리켜 서블릿이라 한다.
 * 
 * 
 * */

package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	@Override
	//클라이언트가 get방식으로 요청할 떄 , 그 요청을 처리하는 메서드
	//HttpServlet 의 메서드로부터 상속받았다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트에 문자열 전송
		PrintWriter out = response.getWriter();
		out.print("hi");
	}
}
