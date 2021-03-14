package com.sample.service;

import java.util.List;

import javax.inject.Inject;

import com.sample.domain.BoardDAO;
import com.sample.domain.BoardVO;

public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO dao;

	@Override
	public void regist(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		dao.create(board);
	}

	@Override
	public BoardVO read(Integer b_no) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(b_no);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		dao.update(board);
	}

	@Override
	public void remove(Integer b_no) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(b_no);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}
	
	
}
