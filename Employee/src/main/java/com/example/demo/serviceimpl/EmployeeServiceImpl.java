package com.example.demo.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

	@Service
	public class EmployeeServiceImpl implements EmployeeService{
		
		@Autowired
		EmployeeRepository employeeRepository;
		
		@Override
		public Employee saveDetails(Employee employee) {
			return employeeRepository.save(employee);
		}
		
		@Override
		public List<Employee> getAllEmployees() {
			return employeeRepository.findAll();
		}

		@Override
		public void deleteDetails(String id) {
		
			 employeeRepository.deleteById(id);
			 
			
		}


}
