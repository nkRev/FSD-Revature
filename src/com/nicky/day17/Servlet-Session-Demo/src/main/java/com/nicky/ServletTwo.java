package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletTwo extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		try (PrintWriter out = res.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<head>");
			out.println("<title>ServletTwo</title>");
			out.println("</head>");
			out.println("<body>");
			
			//retrieve cookies
			Cookie[] cookies = req.getCookies();
			boolean flag = false;
			String name = "";
			//if cookies are null, user needs to submit their name @ homepage
			if(cookies == null) {
				out.println("<h1>You are a new user</h1>");
				out.println("<h1>Please go back to the homepage and submit your name</h1>");
			}else {
				//otherwise grab user name from cookies
				for(Cookie c: cookies) {
					String tempName = c.getName();
					if(tempName.equals("user_name")) {
						flag = true;
						name = c.getValue();
					}
				}
			}
			
			if(flag) {
				out.println("<h1>Hello "+ name+ ", welcome back to the website!</h1>");
			}
			
			out.println("</body>");
			out.println("</html>");
		}
	}

}
