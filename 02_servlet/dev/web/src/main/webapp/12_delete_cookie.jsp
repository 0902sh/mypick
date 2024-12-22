<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Cookie</title>
</head>
<%
	String cookie_check = request.getHeader("Cookie");
	if(cookie_check != null){
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies){
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
	}
%>
<body>
	<h1>Delete ALL Cookies OK</h1>
</body>
</html>