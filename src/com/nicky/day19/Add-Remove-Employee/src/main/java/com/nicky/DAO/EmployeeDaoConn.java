package com.nicky.DAO;

public class EmployeeDaoConn {
	private static EmployeeDAO dao;

	private void EmployeeDAOFactory() {
		
	}

	public static EmployeeDAO getEmployeeDAO() {
		if (dao == null) {
			dao = new EmployeeDAOImpl();

		}
		return dao;
	}
}
