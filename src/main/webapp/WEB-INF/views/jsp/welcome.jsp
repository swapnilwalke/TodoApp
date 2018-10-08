<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<p>
		<font color="green">${success} </font>
	</p>
	welcome!! ${username}
	<br><br> Now , you can manage your <a href="/list-todos">todos</a>
	

	<%-- your password is ${password} --%>
</body>
</html>