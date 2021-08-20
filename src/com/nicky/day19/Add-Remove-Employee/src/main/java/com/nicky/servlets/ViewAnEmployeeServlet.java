package com.nicky.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.nicky.DAO.EmployeeDAO;
import com.nicky.DAO.EmployeeDaoConn;
import com.nicky.model.Employee;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewAnEmployeeServlet extends HttpServlet {

	// get http request
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		// html head
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

		// html body
		out.print("<body>");

		// navbar
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
		// Get Employee'
		out.println("<div class=\"container\">");
		out.println("<form method=\"post\" action=\"viewemployee\" class=\"form-inline\">\r\n"
				+ "        <div class=\"form-group\">\r\n" + "            <label for=\"\">Employee ID </label>\r\n"
				+ "            <input type=\"text\" name=\"id\" id=\"id\" class=\"form-control\" placeholder=\"\" aria-describedby=\"helpId\">\r\n"
				+ "            <input type=\"submit\" value=\"Submit\">\r\n" + "        </div>\r\n" + "    </form>");
		out.println("</div>");

	}

	// post http request
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		int id = Integer.parseInt(req.getParameter("id"));
		EmployeeDAO dao = EmployeeDaoConn.getEmployeeDAO();
		try {
			Employee employee = dao.getEmployeeById(id);
			out.println("<div class=\"container\">\r\n" 
					+ "<div class=\"divTable\">\r\n"
					+ "<div class=\"divTableHeading\">\r\n"
					+ "<div class=\"divTableRow\">\r\n"
					+ "<div class=\"divTableHead\">ID</div>\r\n"
					+ "<div class=\"divTableHead\">Name</div>\r\n"
					+ "<div class=\"divTableHead\">E-Mail</div>\r\n"
					+ "<div class=\"divTableHead\">Gender</div>\r\n"
					+ "<div class=\"divTableHead\">Country</div>\r\n"
					+ "<div class=\"divTableHead\">Edit</div>\r\n"
					+ "<div class=\"divTableHead\">Delete</div>\r\n" 
					+ "</div>\r\n"
					+ "</div>");
			
			out.println(" <div class=\"divTableBody\">"); //opening table body
			out.println("<div class=\"divTableRow\">"); // opening div for row
			out.println("  <div class=\"divTableCell\">" + employee.getId() + "</div>" + "<div class=\"divTableCell\">"
					+ employee.getName() + "</div>" + "<div class=\"divTableCell\">" + employee.getEmail() + "</div>"
					+ "<div class=\"divTableCell\">" + employee.getGender() + "</div>" + "<div class=\"divTableCell\">"
					+ employee.getCountry() + "</div>" + "<div class=\"divTableCell\">" + "<a href=editemployee?id="
					+ employee.getId() + ">" + "Edit</a>" + "</div>" + "<div class=\"divTableCell\">"
					+ "<a href='/delete?id=" + employee.getId() + "'>" + "Delete</a>" + "</div>");
			out.println("</div>"); // closing div row
			out.println("</div>"); // closing div body
			out.println("</div>");
			out.println("</div>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
