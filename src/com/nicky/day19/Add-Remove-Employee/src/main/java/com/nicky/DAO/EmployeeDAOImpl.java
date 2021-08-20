package com.nicky.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nicky.model.Employee;
import com.nicky.util.DAOUtilities;

public class EmployeeDAOImpl implements EmployeeDAO {
	Connection connection = null;
	PreparedStatement ps;

	public EmployeeDAOImpl() {
		try {
			this.connection = DAOUtilities.getConnection();
		} catch (SQLException throwables) {

		}
	}

	@Override
	public boolean addEmployee(Employee employee) throws SQLException {
		final String sql = "INSERT INTO employees (Name, Email, Gender, Country) VALUES (?, ?, ?, ?)";
		ps = connection.prepareStatement(sql);
		ps.setString(1, employee.getName());
		ps.setString(2, employee.getEmail());
		ps.setString(3, employee.getGender());
		ps.setString(4, employee.getCountry());

		if(ps.executeUpdate()!=0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean updateEmployee(Employee employee) throws SQLException {
		final String sql = "UPDATE employees SET Name = ?, Email = ?, Gender= ?, Country = ? WHERE id = ?";
		ps = connection.prepareStatement(sql);

		ps.setString(1, employee.getName());
		ps.setString(2, employee.getEmail());
		ps.setString(3, employee.getGender());
		ps.setString(4, employee.getCountry());
		ps.setInt(5, employee.getId());

		if(ps.executeUpdate()!=0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void rmEmployee(int id) throws SQLException {
		final String sql = "Delete from employees where id = ?";
		ps = connection.prepareStatement(sql);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	@Override
	public List<Employee> getEmployees() throws SQLException {
		List<Employee> empList = new ArrayList<>();
		final String sql = "SELECT * FROM employees";
		ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Employee emp = new Employee();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("Name"));
			emp.setEmail(rs.getString("Email"));
			emp.setGender(rs.getString("Gender"));
			emp.setCountry(rs.getString("Country"));
			empList.add(emp);
		}

		return empList;
	}

	@Override
	public Employee getEmployeeById(int id) throws SQLException {
		Employee emp = new Employee();
		final String sql = "SELECT * FROM employees WHERE id = ?";
		ps = connection.prepareStatement(sql);
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("Name"));
			emp.setEmail(rs.getString("Email"));
			emp.setGender(rs.getString("Gender"));
			emp.setCountry(rs.getString("Country"));
		}
		return emp;
	}

}
