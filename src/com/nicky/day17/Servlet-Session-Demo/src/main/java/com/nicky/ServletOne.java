package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletOne extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		try (PrintWriter out = res.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<head>");
			out.println("<title>ServletOne</title>");
			out.println("</head>");
			out.println("<body>");
			
			String name = req.getParameter("name");
			out.println("<h1>Hello "+ name+ ", welcome to ServletOne</h1>");
			out.println("<h2><a href='servlet2'> Go to ServletTwo</a>");
			
			
			//create a servlet cookie
			Cookie c = new Cookie("user_name", name);
			res.addCookie(c);
			
			
			out.println("</body>");
			out.println("</html>");
			

		}
	}
}
