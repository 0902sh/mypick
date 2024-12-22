package com.megait.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet{
	
	private final String GREEN = "\033[92m";
	private final String RED = "\033[92m";
	private final String END = "\033[0m";
	
	protected void doGet(HttpServletRequest request,
			 HttpServletResponse response)
					 throws ServletException, IOException {
		System.out.println(RED + "[OrderServlet] Get Called" + END);

		response.setContentType("text/html; charset=UTF-8");
		
		// ramen, price, location을 입력으로 받는다고 가정
		String food = request.getParameter("ramen");
		int price = Integer.parseInt(request.getParameter("price"));
		String loc = request.getParameter("location");
		
		System.out.println(food + ":" + price + ":" + loc);
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("</body><body>");
		out.println("<h1>This page was made using Servlet(GET)</h1>");
		out.println("</body></html>");
}
}
