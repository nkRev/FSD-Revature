package com.nicky.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.nicky.DAO.EmployeeDAO;
import com.nicky.DAO.EmployeeDaoConn;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class RmEmployeeServlet extends HttpServlet{
	
	
	//get https request
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		//get id from urlrewrite
		int id = Integer.parseInt(req.getParameter("id"));
		
		//get access to DAO
		EmployeeDAO dao = EmployeeDaoConn.getEmployeeDAO();
		
		//rm employee
		try {
			dao.rmEmployee(id);
			res.sendRedirect("getallemployees");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
}
