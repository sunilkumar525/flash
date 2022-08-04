package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee saveDetails(@RequestBody Employee employee) {
		return employeeService.saveDetails(employee);
	}
	
	@GetMapping("/all")
	public  List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@DeleteMapping("/delete/{id}")
	public void  deleteEmployeeDetails(@RequestParam String id) {
		 employeeService.deleteDetails(id);
	}
}


