package com.nicky.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import com.nicky.DAO.EmployeeDAO;
import com.nicky.DAO.EmployeeDaoConn;
import com.nicky.model.Employee;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class GetAllEmployeeServlet extends HttpServlet {

	// get http request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// set content type
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		out.print("<!doctype html>");
		out.print("<head>");
		out.print("<title>Title</title>\r\n" + "    <!-- Required meta tags -->\r\n"
				+ "    <meta charset=\"utf-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n"
				+ "\r\n" + "    <!---import css-->\r\n"
				+ "    <link rel=\"stylesheet\" href=\"/src/main/webapp/css/style.css\">\r\n" + "\r\n"
				+ "    <!-- Bootstrap CSS -->\r\n"
				+ "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n"
				+ "        integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
		
		out.println("<style>");
		out.println(".divTable{\r\n"
				+ "	display: table;\r\n"
				+ "	width: 100%;\r\n"
				+ "}\r\n"
				+ ".divTableRow {\r\n"
				+ "	display: table-row;\r\n"
				+ "}\r\n"
				+ ".divTableHeading {\r\n"
				+ "	background-color: #EEE;\r\n"
				+ "	display: table-header-group;\r\n"
				+ "}\r\n"
				+ ".divTableCell, .divTableHead {\r\n"
				+ "	border: 1px solid #999999;\r\n"
				+ "	display: table-cell;\r\n"
				+ "	padding: 3px 10px;\r\n"
				+ "}\r\n"
				+ ".divTableHeading {\r\n"
				+ "	background-color: #EEE;\r\n"
				+ "	display: table-header-group;\r\n"
				+ "	font-weight: bold;\r\n"
				+ "}\r\n"
				+ ".divTableFoot {\r\n"
				+ "	background-color: #EEE;\r\n"
				+ "	display: table-footer-group;\r\n"
				+ "	font-weight: bold;\r\n"
				+ "}\r\n"
				+ ".divTableBody {\r\n"
				+ "	display: table-row-group;\r\n"
				+ "}");
		out.println("</style>");
		out.print("</head>");
		out.print("<body>");
		
		
		//navbar
		out.println("<div class=\"container\">\r\n"
				+ "    <nav class=\"navbar navbar-expand-sm navbar-light bg-light\">\r\n"
				+ "        <a class=\"navbar-brand\" href=\"index.html\">Employee System</a>\r\n"
				+ "        <button class=\"navbar-toggler d-lg-none\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavId\" aria-controls=\"collapsibleNavId\"\r\n"
				+ "            aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "            <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "        </button>\r\n"
				+ "        <div class=\"collapse navbar-collapse\" id=\"collapsibleNavId\">\r\n"
				+ "            <ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\r\n"
				+ "                <li class=\"nav-item active\">\r\n"
				+ "                    <a class=\"nav-link\" href=\"index.html\">Home <span class=\"sr-only\">(current)</span></a>\r\n"
				+ "                </li>\r\n"
				+ "                <li class=\"nav-item\">\r\n"
				+ "                    <a class=\"nav-link\" href=\"employee-info.html\">Add Employee</a>\r\n"
				+ "                </li>\r\n"
				+ "                <li class=\"nav-item\">\r\n"
				+ "                    <a class=\"nav-link\" href=\"getallemployees\">Employee List</a>\r\n"
				+ "                </li>\r\n"
				+ "                <li class=\"nav-item\">\r\n"
				+ "                    <a class=\"nav-link\" href=\"viewemployee\">View An Employee</a>\r\n"
				+ "                </li>\r\n"
				+ "            </ul>\r\n"
				+ "        </div>\r\n"
				+ "    </nav>\r\n"
				+ "</div>");

		
		EmployeeDAO dao = EmployeeDaoConn.getEmployeeDAO();
		try {
			// get all employees
			List<Employee> employeeList = dao.getEmployees();
			
			/** div table makes it responsive.. 
			 *  PAY ATTENTION TO CLASS NAMES AND CLOSING TAGS
			 ***/
			//table head
			out.println("<div class=\"container\">\r\n"
					+ "        <div class=\"divTable\">\r\n"
					+ "            <div class=\"divTableHeading\">\r\n"
					+ "                <div class=\"divTableRow\">\r\n"
					+ "                    <div class=\"divTableHead\">ID</div>\r\n"
					+ "                    <div class=\"divTableHead\">Name</div>\r\n"
					+ "                    <div class=\"divTableHead\">E-Mail</div>\r\n"
					+ "                    <div class=\"divTableHead\">Gender</div>\r\n"
					+ "                    <div class=\"divTableHead\">Country</div>\r\n"
					+ "                    <div class=\"divTableHead\">Edit</div>\r\n"
					+ "                    <div class=\"divTableHead\">Delete</div>\r\n"
					+ "                </div>\r\n"
					+ "            </div>");
			
			
			/**
			 * For each employee in employee list
			 * add each EmployeeObj accordingly to table columns
			 **/
			out.println(" <div class=\"divTableBody\">"); //opening table body
			for(Employee e : employeeList) {
				out.println("<div class=\"divTableRow\">"); //opening div for row
				out.println("  <div class=\"divTableCell\">"+e.getId()+"</div>"
						+"<div class=\"divTableCell\">"+e.getName()+"</div>"
						+"<div class=\"divTableCell\">"+e.getEmail()+"</div>"
						+"<div class=\"divTableCell\">"+e.getGender()+"</div>"
						+"<div class=\"divTableCell\">"+e.getCountry()+"</div>"
						+"<div class=\"divTableCell\">"
								+"<a href=editemployee?id="+e.getId()+">"+"Edit</a>"
						+"</div>"
						+"<div class=\"divTableCell\">"
								+"<a method='get' href='delete?id="+e.getId()+"'>"+"Delete</a>"
						+"</div>"
						);
				out.println("</div>"); //closing div row
			}
			

			out.println("</div>"); //closing div body
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		out.print("<!-- Optional JavaScript -->\r\n"
				+ "    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n"
				+ "    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\r\n"
				+ "        integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n"
				+ "        crossorigin=\"anonymous\"></script>\r\n"
				+ "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\r\n"
				+ "        integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\r\n"
				+ "        crossorigin=\"anonymous\"></script>\r\n"
				+ "    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n"
				+ "        integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n"
				+ "        crossorigin=\"anonymous\"></script>");
		out.print("</body>");
		out.print("</html>");
	}
}
