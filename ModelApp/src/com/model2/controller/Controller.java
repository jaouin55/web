//모든 하위 컨트롤러가 반드시 구현해야 할 메서드를 정의
package com.model2.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

public interface Controller {
	//알맞는 비즈니스 객체에 일 시키기
	public void execute(HttpServletRequest request, HttpServletResponse response) throws SerialException , IOException;
	

}
