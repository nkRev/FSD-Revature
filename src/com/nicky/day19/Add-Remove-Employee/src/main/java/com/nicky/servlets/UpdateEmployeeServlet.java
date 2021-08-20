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


public class UpdateEmployeeServlet extends HttpServlet{
	
	//get http request
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
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
		out.print("</head>");
		
		//html body
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
		Employee employee;
		int id = Integer.parseInt(req.getParameter("id"));
		
		try {
				employee = dao.getEmployeeById(id);
			
			
			//add employee form...
			out.println("<div class=\"container\">"); //opening div
			out.println("<h1>Update Employee</h1>");
			out.println("<form action=\"confeditemployee\" method=\"post\">");
			out.println("<div class=\"form-group\">\r\n"
					+ "    <input type=\"hidden\" class=\"form-control\" name=\"id\" id=\"id\" value=\""+employee.getId()+"\">\r\n"
					+ "</div>");
			out.println("<div class=\"form-group form-inline\">\r\n"
					+ "                <label for=\"\">Name</label>\r\n"
					+ "                <input type=\"text\" name=\"employee-name\" id=\"employee-name\" class=\"form-control\" placeholder=\"Name\"\r\n"
					+ "                    aria-describedby=\"helpId\">\r\n"
					+ "            </div>");
			out.println("<div class=\"form-group form-inline\">\r\n"
					+ "                <label for=\"\">Email</label>\r\n"
					+ "                <input type=\"email\" name=\"employee-email\" id=\"employee-email\" style=\"width: 15rem;\" class=\"form-control\"\r\n"
					+ "                    placeholder=\"abc@gmail.com\" aria-describedby=\"helpId\">\r\n"
					+ "            </div>");
			out.println(" <div class=\"form-check form-check-inline form-group \" >\r\n"
					+ "                <label class=\"form-check-label\">Gender\r\n"
					+ "                    <input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"gender\" value=\"Male\"> Male\r\n"
					+ "                    <input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"gender\" value=\"Female\"> Female\r\n"
					+ "                </label>\r\n"
					+ "            </div>");
			out.println("<div class=\"dropdown\" >\r\n"
					+ "                <div class=\"form-group form-inline\">\r\n"
					+ "                    <label for=\"country\">Country</label>\r\n"
					+ "                    <select class=\"custom-select scrollable-menu\" name=\"country\" id=\"country\">\r\n"
					+ "                        <option selected>Select one</option>\r\n"
					+ "                        <option value=\"USA\">USA</option>\r\n"
					+ "                        <option value=\"Japan\">Japan</option>\r\n"
					+ "                        <option value=\"Korea\">Korea</option>\r\n"
					+ "                        <option value=\"Australia\">Australia</option>\r\n"
					+ "                        <option value=\"Europe\">Europe</option>\r\n"
					+ "                        <option value=\"United Arab Emerates\">United Arab Emerates</option>\r\n"
					+ "                        <option value=\"Argentina\">Argentina</option>\r\n"
					+ "                        <option value=\"Bhutan\">Bhutan</option>\r\n"
					+ "                        <option value=\"Laos\">Laos</option>\r\n"
					+ "                    </select>\r\n"
					+ "                </div>\r\n"
					+ "                <input type=\"submit\" value=\"Submit\">\r\n"
					+ "            </div>");
			out.println("</form>");
			out.println("</div>");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		//closing body, html, and js links
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
