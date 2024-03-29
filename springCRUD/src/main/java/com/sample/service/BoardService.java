package com.sample.service;

import java.util.List;

import com.sample.domain.BoardVO;

public interface BoardService {

	public void regist(BoardVO board) throws Exception;
	
	public BoardVO read(Integer b_no) throws Exception;
	
	public void modify(BoardVO board) throws Exception;
	
	public void remove(Integer b_no) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
}
