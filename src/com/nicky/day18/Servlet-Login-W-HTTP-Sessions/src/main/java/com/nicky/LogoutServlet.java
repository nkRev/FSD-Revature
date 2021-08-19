package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {
	
	//get request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//set content type
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		
		out.println("<h1>Logging you out.</h1>");
		
		
		
		
	}
	
}
