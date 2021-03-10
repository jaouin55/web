package jspDBexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NoticeBoard_ver3 {

		String Driver = "org.mariadb.jdbc.driver";
		String url = "jdbc:mariadb://localhost:3306/db1202";
		String user = "root";
		String password = "mysql1234";
		
		public Connection getConnection() {
			Connection conn = null;
			try {
				Class.forName(Driver);
				System.out.println("Driver session success !!");
				conn = DriverManager.getConnection(url,user,password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Driver fail !!");
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
		public void release(Connection conn) {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public void release(Connection conn, PreparedStatement pstmt) {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public void release(Connection conn , PreparedStatement pstmt , ResultSet rs) {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}
