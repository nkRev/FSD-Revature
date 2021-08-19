package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class HttpSessionServlet extends HttpServlet{
	//get https request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		//get name from the form
		String name = req.getParameter(getServletInfo());
		out.println("Welcome "+name	);
		
		//request httpsession
		HttpSession session = req.getSession();
		session.setAttribute("uname", session);
			
		out.println("<a href='GetValueFromHttpSession'>Click Me</a>");
		out.close();
	}
}
