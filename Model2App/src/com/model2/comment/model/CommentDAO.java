package com.model2.comment.model;

import java.util.List;

import com.model2.mybatis.config.MybatisConfigManager;

public class CommentDAO {
	MybatisConfigManager manager = MybatisConfigManager.getInstance();
	
	public List selectAll(int board_id) {
		List list = null;
		SqlSession sqlSession = manager.getSqlSession();
		list = sqlSession.selectList("Comment.selectAll",board_id);
		manager.close(sqlSession);
		
		return list;
	}
	
	public int delete(int comment_id) {
		int result = 0;
		SqlSession sqlSession = manager.getSqlSession();
		result = sqlSession.delete("Comment.delete",comment_id);
		sqlSession.commit();
		manager.close(sqlSession);
		return result;
	}
	
	//댓글의 등록은 비동기요청으로 들어오기 떄문에 , 응답정보는 페이지를 보여주는 것이 아니라
	//데이터를 전송해야한다!
	//댓글 목록은 클라이언트에게 페이지 재접속을 유도하면 안된다.
	
}
