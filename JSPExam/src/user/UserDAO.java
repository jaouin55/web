package user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DatabaseUtil;

public class UserDAO {
	
	public int join(String userID ,String userPassword) {
		String SQL = "INSERT INTO USER VALUES(?,?)";
		
		try {
			Connection conn = DatabaseUtil.getConnetion();
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setNString(1, userID);
			pstmt.setNString(2, userPassword);
			return pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	
}
