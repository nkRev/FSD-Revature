package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HiddenTextFieldServlet {

	//get request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//set content type
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		//get name
		String name = req.getParameter("name");
		out.println("<h2>Welcome, "+name+"</h2>");
		
		//create a form with invisible text field
		out.println("<form action='ViewHiddenForm'>");
		out.println("<input type='hidden' name='uname' value='"+name+"'/>");
		out.println("<input type='submit' value='send'>");
		out.println("</form>");
		//close resources
		out.close();
	}
	
}
