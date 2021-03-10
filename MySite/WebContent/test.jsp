<html>
<head>
<%@ page 
import="java.sql.*,
javax.sql.*,
java.io.*,
javax.naming.InitialContext,
javax.naming.Context" %>
</head>
<body>
<h1>JDBC JNDI Resource Test</h1>

<%
/*
JNDI(Java Naming Directory Interface)란?
: 어떤 정보를 프로그래밍 언어인 자바코드에 넣지말고 , 외부 xml과 같은
  자원으로 관리하는 방법(즉 , 자바코드안에 넣지말고 , 밖으로빼서 유지)
*/
InitialContext initCtx = new InitialContext(); //검색 객체
DataSource ds = (DataSource) initCtx.lookup("java:comp/env/jdbc/myoracle");//정해진 프로토콜이라 암기해야함 (java:comp/env/까지 고정!)
Connection conn = ds.getConnection(); //커넥션풀로부터 하나의 커넥션을 얻는 작업 (새로운 접속이 아니라 기존 풀에 존재하는 접속객체를 대여하는 것)
Statement stmt = conn.createStatement();
ResultSet rset = stmt.executeQuery("select * from board;");
while (rset.next()) {
out.println("title=="+rset.getString("title")+"<br>");
}
rset.close();
stmt.close();
conn.close();// 여기서 풀로 돌려보낸다.
initCtx.close();
%>
</body>
</html>