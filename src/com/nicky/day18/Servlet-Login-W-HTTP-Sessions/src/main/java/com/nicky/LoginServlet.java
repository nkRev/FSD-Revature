package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	// http post request
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// set content type
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		// request dispatch navbar and include servlet req, res
		//req.getRequestDispatcher("/navbar.html").include(req, res);

		// Get username & password
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		// if username and pw = Nicky's Acc
		if (username.equals("nicky") && password.equals("qwerty")) {
			// successful login
			out.println("<h1>Login Successful!</h1>");
			out.println("<h2>Welcome, " + username + "</h1>");

			// create and add username to HttpSession
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
		} else {
			// otherwise login credentials are invalid
			// send back to login.html
			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req, res);
			
			out.println("Invalid Login Credentials");
		}

		// close PrintWriter resources
		out.close();

	}

}
