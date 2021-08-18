package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("This is a get mthod of my servlet");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1>GET METHOD CALLED</h1>");
		out.print(new Date().toString());
	}

	/**
	 * some type of post master program was used to check this method.... the above
	 * doGet() method definitely works and is shown when in /third directory
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("This is a post method from Third Servlet");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1>Post method in ThirdServlet called!</h1>");
		out.print(new Date().toString());
	}
}
