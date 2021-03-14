<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<!DOCTYPE html> 
<html>
<head>
<title>게시판 목록</title>
</head>
<body>
<form action = "regist" method = "get">
<table border="1">
        <tr>
        <td width="77">
            <p align="center">글번호</p>
        </td>

        <td width="327">
            <p align="center">제목</p>
        </td>
        <td width="197">
            <p align="center">작성자</p>
        </td>

        <td width="155">
            <p align="center">작성일</p>
        </td>
        <td width="90">
            <p align="center">조회수</p>
        </td>
        </tr>

        <c:forEach items="${list}" var="boardVO">
	<tr>
        <td>${boardVO.b_no}</td>
        <td><a href='/read?bno=${boardVO.b_no}'>${boardVO.b_title}</a></td>
        <td>${boardVO.b_writer}</td>
        <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
				value="${boardVO.b_date}" /></td>
        <td><span class="badge bg-red">${boardVO.b_count}</span></td>
	</tr>
		</c:forEach>
    </table>
     <button type ="submit">글쓰기</button>
    </form>
   </body>

</html>