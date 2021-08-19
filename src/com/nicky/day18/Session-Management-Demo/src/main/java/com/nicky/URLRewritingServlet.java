package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class URLRewritingServlet extends HttpServlet {

	// get http request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		String name = req.getParameter("name");
		out.print("Welcome " + name);

		// append username in query string
		out.print("<h1><a href='GetValueFromURLRewritingServlet?name=" + name + "'>Click Here </a></h1>");
		out.close();
	}
}
