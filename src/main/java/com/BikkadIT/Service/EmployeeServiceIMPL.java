package com.BikkadIT.Service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BikkadIT.Dao.EmployeeDaoI;
import com.BikkadIT.model.Employee;
@Repository
public class EmployeeServiceIMPL implements EmployeeServiceI{
	@Autowired
	private EmployeeDaoI employeeDaoI;

	@Override
	public int saveEmployeeService(Employee emp) {
		System.out.println("Service Layer");
		System.out.println(emp);
		int id=employeeDaoI.saveEmployeeDao(emp);
		System.out.println(id);
				
		return id;
	}

	@Override
	public List<Employee> getAllEmployeeService() {
	List<Employee>list=employeeDaoI.getAllEmployeeDao();
		return list;
	}

	
	
	@Override
	public Employee update(Employee emp) {
		Employee emp1= employeeDaoI.update(emp);
		return emp1;
	}


	@Override
	public void deleteAllEmployee(){
		employeeDaoI.deleteAllEmployee();
	}

}


