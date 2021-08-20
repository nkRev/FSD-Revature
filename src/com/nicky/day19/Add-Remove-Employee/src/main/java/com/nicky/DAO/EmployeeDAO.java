package com.nicky.DAO;

import java.sql.SQLException;
import java.util.List;

import com.nicky.model.Employee;

public interface EmployeeDAO {
	boolean addEmployee(Employee employee) throws SQLException;
	boolean updateEmployee(Employee employee) throws SQLException;
	void rmEmployee(int id) throws SQLException;
	List<Employee> getEmployees() throws SQLException;
	Employee getEmployeeById(int id) throws SQLException;
	
}
