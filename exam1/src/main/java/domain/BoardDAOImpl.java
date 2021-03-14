package domain;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import dao.BoardDAO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Inject
	private SqlSession sqlSession;
	private static String namespace = "mapper.BoardMapper";
	
	//게시판 추가하기
	@Override
	public void create(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".insertBoard",vo);
	}
	
	//게시판 보기
	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		sqlSession.selectList(namespace+".listBoard");
		return null;
	}

	//게시판 상세
	@Override
	public BoardVO read(Integer b_no) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.selectOne(namespace+".detailBoard",b_no);
		return null;
	}
	
	//게시판 삭제
	@Override
	public BoardVO delete(Integer b_no) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+".deleteBoard",b_no);
		return null;
	}
	
	//게시판 수정
	@Override
	public BoardVO update(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(namespace+".updateBoard",vo);
		return null;
	}
}
