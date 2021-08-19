package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {

	// get request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// set content type
		res.setContentType("text/html");
		// initialize print writer and get it.
		PrintWriter out = res.getWriter();
		
		// request the navbar and include servlet request and response
		req.getRequestDispatcher("navbar.html").include(req, res);

		// get cookies
		Cookie[] cookie = req.getCookies();
		// check if there's cookies
		if (cookie != null) {
			// get username
			String username = cookie[0].getValue();
			// username is not null or username does not equal empty string
			if (username != null || !username.equals("")) {
				out.println("<h1>Welcome to your Profile!</h1>");
				out.println("<h1>Welcome " + username + "</h1>");
			}
		} else {
			out.println("<h1>Please return back to Login!</h1>");
			req.getRequestDispatcher("/login.html").include(req, res);
		}
		out.close();
	}

}
