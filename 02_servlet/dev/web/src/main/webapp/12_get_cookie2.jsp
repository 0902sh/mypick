<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Cookie</title>
</head>
<%
	String id = "temp";
	String cookie_check = request.getHeader("Cookie");
	System.out.println("Cookie Check Result : " + cookie_check);
	
	if(cookie_check != null){
		System.out.println("[GetCookie] Found Cookie(s)");
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies){
			System.out.println("[GetCookie] " + cookie.getName());
			if(cookie.getName().equals("id")){
				id = cookie.getValue();
				break;
			}
		}
	}
%>
<body>
	<h1>Get Cookie</h1>
	<hr>
	<h1>User ID : <%=id%></h1>
	<a href="12_delete_cookie.jsp">Delete Cookie</a>

</body>
</html>