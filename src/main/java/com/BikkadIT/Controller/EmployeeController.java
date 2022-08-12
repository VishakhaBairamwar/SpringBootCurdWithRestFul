package com.BikkadIT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.BikkadIT.Service.EmployeeServiceI;
import com.BikkadIT.model.Employee;



@Controller
public class EmployeeController {
	@Autowired
	private EmployeeServiceI employeeServiceI;
	
	
	
	@PostMapping(value="/saveEmployee",consumes = "application/json",produces = "application/json")
	public ResponseEntity<Integer> saveEmployeeService(@RequestBody Employee emp) {
		int id = employeeServiceI.saveEmployeeService(emp);
	
		return new ResponseEntity<Integer>(id,HttpStatus.CREATED);
		
	}
	
	
	@GetMapping(value="/getAllEmployee", produces = "application/json")
	public ResponseEntity<List<Employee>> getAllEmployeeService(){
		List<Employee> employee = employeeServiceI.getAllEmployeeService();
		return new ResponseEntity<List<Employee>>(employee,HttpStatus.OK);
		
	}
	
	
	@PutMapping(value="/update",consumes = "application/json",produces = "application/json")
	public ResponseEntity<Object> update(@RequestBody Employee emp){
     Employee employee = employeeServiceI.update(emp);
			return new ResponseEntity<Object>(employee,HttpStatus.OK);
		}
	
	
	
	
	@DeleteMapping(value="/deleteAllEmployee")
	public ResponseEntity<Employee>deleteAllEmployee(){
          employeeServiceI.deleteAllEmployee();
		return new ResponseEntity<Employee>(HttpStatus.OK);
		
	}
	
}

