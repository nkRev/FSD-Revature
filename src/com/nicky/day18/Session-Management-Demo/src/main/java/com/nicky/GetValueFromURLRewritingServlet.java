package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetValueFromURLRewritingServlet extends HttpServlet {

	// get https reqest
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		// getting value from query string
		String name = req.getParameter("name");
		out.print("Welcome " + name);
		out.close();
	}
}
