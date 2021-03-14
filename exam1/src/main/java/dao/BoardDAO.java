package dao;

import java.util.List;

import domain.BoardVO;

public interface BoardDAO {

	public List<BoardVO> listAll() throws Exception;
	
	public void create(BoardVO vo) throws Exception;
	
	public BoardVO read(Integer b_no) throws Exception;
	
	public BoardVO delete(Integer b_no) throws Exception;
	
	public BoardVO update(BoardVO vo) throws Exception;
}
