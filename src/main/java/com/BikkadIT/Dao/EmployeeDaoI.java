package com.BikkadIT.Dao;

import java.util.List;

import com.BikkadIT.model.Employee;


public interface EmployeeDaoI {
	
	public int saveUserDao(Employee emp);

	public List<Employee> getAllUserDao();

	public Employee update(Employee emp);

	public void deleteAllEmployee();

	

	

}
