<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name ="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Bootstrap Example</title>
<!-- bootstrap.css add -->
	<link rel="stylesheet" href="./css/bootstrap.min.css">
<!-- custom.css add -->
	<link rel="stylesheet" href="./css/custom.css">
</head>

<body>
	<form action="./userjoinAction.jsp" method="post">
		JavaGood
		<input type="text" name="userID">
		<input type="password" name="userPassword">
		<input type="submit" value="회원가입">
	</form>
<!-- JQuery.js add -->
	<script src="./js/jquery.min.js"></script>
<!-- popper.js add -->
	<script src="./js/popper.js"></script>
<!-- bootstrap.js add -->
	<script src="./js/bootstrap.min.js"></script>



</body>
</html>