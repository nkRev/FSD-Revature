package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SendRedirectServlet extends HttpServlet{
	
	//get request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//set content type
		res.setContentType("text/html");
	
		PrintWriter out = res.getWriter();
		
		//get name
		String name = req.getParameter("name");
		//send redirect with name at the end could show hidden values?
		res.sendRedirect("https://www.google.com?name=?" + name);
		//close print writer
		out.close();
	}

}
