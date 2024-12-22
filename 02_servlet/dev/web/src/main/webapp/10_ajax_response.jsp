<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax Response</title>
</head>
<body>
<% 
	String city = request.getParameter("city");
	String zipcd = request.getParameter("zipcd");
	System.out.println("city:" + city + " zipcd:" + zipcd);
	
	try {
		Thread.sleep(3000);
	}
	catch(Exception e){ e.printStackTrace(); }
	
	out.println("자네가 전달한 위대한 도시는 바로 " + city + "일세....");
	out.println("<br>");
	out.println("보물은 우편번호 " + zipcd + "에 묻혀있네");
%>
</body>
</html>