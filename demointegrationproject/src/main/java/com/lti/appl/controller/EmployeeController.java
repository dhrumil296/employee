package com.lti.appl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.appl.beans.Employee;
import com.lti.appl.services.EmpServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmpServiceImpl employeeService;
	
	//http://localhost:8090/api/v1/employees
	@GetMapping("/employees")
	public List<Employee> getEmplist(){
		System.out.println("Inside controller - calling getEmpList");
		List<Employee> empList = employeeService.getEmpList();
		return empList;
	}
}
