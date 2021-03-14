package com.sample.domain;

import java.util.List;

public interface BoardDAO {

	public void create(BoardVO vo) throws Exception;
	
	public BoardVO read(Integer b_no) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(Integer b_no) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
}
