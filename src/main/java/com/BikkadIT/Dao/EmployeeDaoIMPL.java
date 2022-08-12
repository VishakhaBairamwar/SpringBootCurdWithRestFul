package com.BikkadIT.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.BikkadIT.model.Employee;
@Repository
public class EmployeeDaoIMPL implements EmployeeDaoI{
	@Autowired
	private SessionFactory sf;

	@Override
	public int saveEmployeeDao(Employee emp) {
		Session session=sf.openSession();
		session.beginTransaction();
		int id=(int)session.save(emp);
		System.out.println(id);
		session.getTransaction().commit();
		return id;
	}

	@Override
	public List<Employee> getAllEmployeeDao() {
		Session session=sf.openSession();
		String hql="from User";
	  Query query = session.createQuery(hql);
	  List list = query.getResultList();
	  
		return list;
	}

	
	
	@Override
	public Employee update(Employee emp) {
		Session session=sf.openSession();
		session.beginTransaction();
		session.update(emp);
		session.getTransaction().commit();
		session.close();
		
		Session session2=sf.openSession();
	 Employee employee = session2.get(Employee.class,emp.getEmpId());
		session2.close();
		
		return employee;
	}

	@Override
	public void deleteAllEmployee(){
		Session session=sf.openSession();
		session.beginTransaction();
		String hql="delete all from Employee";
		Query query = session.createQuery(hql);
		session.beginTransaction();
		query.executeUpdate();
		session.getTransaction().commit();

	}
}
