package jspDBexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NoticeBoard_ver2 {

	String Driver = "org.mariadb.jdbc.Driver";
	String url = "jdbc:mariadb://localhost:3306/db1202";
	String user = "root";
	String password = "mysql1234";
	
	public Connection getConnectoin() {
		Connection con = null;
		try {
			Class.forName(Driver);
			System.out.println("드라이버 로드 성공");
			con = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}







