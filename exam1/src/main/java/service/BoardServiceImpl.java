package service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import dao.BoardDAO;
import domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDAO dao;

	@Override
	public void create(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.create(vo);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}

	@Override
	public BoardVO read(Integer b_no) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(b_no);
	}

	@Override
	public void delete(Integer b_no) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(b_no);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.update(vo);
	}
}