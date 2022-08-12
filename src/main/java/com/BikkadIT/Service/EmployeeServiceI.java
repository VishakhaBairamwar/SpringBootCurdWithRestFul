package com.BikkadIT.Service;

import java.util.List;

import com.BikkadIT.model.Employee;


public interface EmployeeServiceI {
	
	public int saveEmployeeService(Employee emp);

	public List<Employee> getAllEmployeeService();

	public Employee update(Employee emp);

	public void deleteAllEmployee();

	

	

}
