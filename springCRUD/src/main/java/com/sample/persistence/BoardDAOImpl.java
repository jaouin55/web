package com.sample.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sample.domain.BoardDAO;
import com.sample.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Inject
	private SqlSession session;
	private static String namespace = "com.myp.mapper.BoardMapper";
	
	@Override
	public void create(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".create",vo);
	}
	@Override
	public BoardVO read(Integer b_no) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".read",b_no);
	}
	@Override
	public void update(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace+".update",vo);
	}
	@Override
	public void delete(Integer b_no) throws Exception {
		// TODO Auto-generated method stub
		session.delete(namespace+".delete",b_no);
	}
	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".listAll");
	}
}
