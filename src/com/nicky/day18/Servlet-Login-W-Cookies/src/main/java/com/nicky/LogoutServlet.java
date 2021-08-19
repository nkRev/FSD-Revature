package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LogoutServlet {
	
	//get request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//set content type
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		//Make cookie; will remember username and what it is inputted as
		Cookie cookie = new Cookie("username", "");
		//add cookie
		res.addCookie(cookie);
		
		
		out.println("<h1>Logging you out.</h1>");
		
		
		
		
	}
	
}
