package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Employee;

public interface EmployeeService {

	public Employee saveDetails(Employee employee);

	public List<Employee> getAllEmployees();

	public void deleteDetails(String id);

}
