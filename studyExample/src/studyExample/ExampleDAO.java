package studyExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import pool.PoolManager;

public class ExampleDAO {
	
	PoolManager poolManager = PoolManager.getinstance();
	
	public int insert(Example example) {
		PreparedStatement pstmt = null;
		Connection con = null;
		int result = 0;
		String sql ="insert into example(No,title,content,employer,regdate,hit) values(seq_No.nextval,?,?,?,?,?)";
		
		con = poolManager.getConnection();		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,example.getNo());
			pstmt.setString(2,example.getTitle());
			pstmt.setString(3,example.getContent());
			pstmt.setString(4,example.getEmployer());
			pstmt.setString(5,example.getRegdate());
			pstmt.setInt(6,example.getHit());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			poolManager.release(con,pstmt);
		}
		return result;
	}
	
	//모든정보
	public List SelectAll() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList list = new ArrayList();
		String sql = "select * from example order by No desc";
		
		con = poolManager.getConnection();
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Example example = new Example();
				example.setNo(rs.getInt("no"));
				example.setTitle(rs.getString("title"));
				example.setContent(rs.getString("content"));
				example.setEmployer(rs.getString("employer"));
				example.setRegdate(rs.getString("regdate"));
				example.setHit(rs.getInt("hit"));
			
				list.add(example);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			poolManager.release(con,pstmt);
		}
		return list;
	}
}
