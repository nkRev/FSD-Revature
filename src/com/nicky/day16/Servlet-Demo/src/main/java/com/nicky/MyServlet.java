package com.nicky;
import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyServlet implements Servlet{
	ServletConfig config;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroying...");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This servlet was created by Nicky";
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.config = servletConfig;
		System.out.println("creating servlet!");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servicing...");
	}

}
