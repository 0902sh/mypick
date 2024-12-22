<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Cookie</title>
</head>
<%
	Cookie cookie = new Cookie("id", "Apple");
	response.addCookie(cookie);
	Cookie cookie2 = new Cookie("id2", "Melon");
	response.addCookie(cookie);
%>
<body>
	<h1>Cookie Creation</h1>
	<hr>
	<a href="12_get_cookie2.jsp">Send Cookie</a>
</body>
</html>