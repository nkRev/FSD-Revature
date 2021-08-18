package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {


	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		out.println("<h1>Confirming Registration Info..</h1>");

		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String password = req.getParameter("user_password");
		String gender = req.getParameter("user_gender");
		String city = req.getParameter("user_city");
		String agreement = req.getParameter("agreement");
		if (agreement.equals("accepted")) {
			out.println("<h1>Name: " + name + "</h1>");
			out.println("<h1>email: " + email + "</h1>");
			out.println("<h1>password: " + password + "</h1>");
			out.println("<h1>gender: " + gender + "</h1>");
			out.println("<h1>city: " + city + "</h1>");
		} else {
			out.print("<h1>you have not accepted the terms and conditions!</h1>");
		}
	}
}
