package com.nicky;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet{

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>Calculation Result</h1>");
		
		int inputOne = Integer.parseInt(req.getParameter("input_one"));
		int inputTwo = Integer.parseInt(req.getParameter("input_two"));
		int result = 0;
		String operand = req.getParameter("operand");
		
		if(operand.equals("add")) {
			
			out.println(inputOne+" + "+ inputTwo +" = "+ add(inputOne, inputTwo));
			
		}else if(operand.equals("subtract")) {
			
			out.println(inputOne+" - "+ inputTwo +" = "+ subtract(inputOne, inputTwo));
			
		}else if(operand.equals("multiply")) {
			
			out.println(inputOne+" * "+ inputTwo +" = "+ multiply(inputOne, inputTwo));
			
		}else if(operand.equals("divide")) {
			
			out.println(inputOne+" / "+ inputTwo +" = "+ divide(inputOne, inputTwo));
			
		}
		
	}
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		return (a/b);
	}
}
