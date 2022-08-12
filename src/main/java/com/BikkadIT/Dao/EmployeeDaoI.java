package com.BikkadIT.Dao;

import java.util.List;

import com.BikkadIT.model.Employee;


public interface EmployeeDaoI {
	
	public int saveEmployeeDao(Employee emp);

	public List<Employee> getAllEmployeeDao();

	public Employee update(Employee emp);

	public void deleteAllEmployee();

	

	

	

}
