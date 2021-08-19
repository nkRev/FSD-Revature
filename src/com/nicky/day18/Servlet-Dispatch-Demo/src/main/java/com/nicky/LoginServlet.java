package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		// get username & password
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		// if username & password are "Admin user" then send to welcome servlet
		if (username.equals("admin") && password.equals("adminpw")) {
			RequestDispatcher rd = req.getRequestDispatcher("/welcomeservlet");
			rd.forward(req, res);
		} else {
			// otherwise redirect to index.html
			out.println("Sorry invalid username and password");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
	}
}
