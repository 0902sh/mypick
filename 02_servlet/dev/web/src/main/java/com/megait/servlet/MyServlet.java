package com.megait.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	
	private final String GREEN = "\033[92m";
	private final String RED = "\033[92m";
	private final String END = "\033[0m";
	
	public MyServlet() {
		super();
		System.out.println(GREEN + "MyServlet Created" + END);
	}
	
	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response)
	throws ServletException, IOException {
		System.out.println("[MyServlet] Get Called");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		out.println("</body><body>");
		out.println("<h1>This page was made using Servlet(GET)</h1>");
		out.println("</body></html>");
	}
}
