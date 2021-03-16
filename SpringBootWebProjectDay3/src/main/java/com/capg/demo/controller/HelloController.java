package com.capg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.bean.Employee;
import com.capg.demo.service.EmployeeService;
import com.capg.demo.service.EmployeeServiceJPA;

@RestController
@RequestMapping("/employee")
public class HelloController {
	@Autowired
	EmployeeServiceJPA eservice;
	
	@GetMapping
	public List<Employee> printAllEmployee() {
		return eservice.printAllEmployee();
	}

	@GetMapping("/{empid}")
	public ResponseEntity<Employee> findEmployee(@PathVariable int empid) {
		Employee e=eservice.findEmployee(empid);
		if(e!=null)
			return new ResponseEntity<Employee>(e,HttpStatus.OK); 
		else
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	}
	//@PostMapping(value="/create", consumes=MediaType.APPLICATION_JSON_VALUE)
	@PostMapping
	public List<Employee> saveEmployee(@RequestBody Employee emp) {
			return eservice.createEmployee(emp);
	}
	@DeleteMapping("/{empid}")
	public List<Employee> deleteEmployee(@PathVariable int empid){
		return eservice.removeEmployee(empid);
	}
	@PutMapping
	public List<Employee> updateEmployee(@RequestBody Employee emp){
		return eservice.updateEmployee(emp);
	}
}
