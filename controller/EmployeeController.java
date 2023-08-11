package com.telstra.restcrud.controller;

import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telstra.restcrud.model.Employee;
import com.telstra.restcrud.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/vl")

public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/Employee")
	public String addEmployee(@RequestBody Employee employee) 
	{
		employeeRepository.save(employee);
		return "employe added succesful";
	}
	
	@GetMapping("/Employee")
	public List<Employee> viewEmployee()
	{
		return employeeRepository.findAll();
	}
	@GetMapping("/Employee/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return employeeRepository.findById(id).get();
	}
	
	@DeleteMapping("/employee/{id}")
	public Employee deleteEmployeeById(@PathVariable int id)
	{
		return employeeRepository.findById(id).get();
	}
	
}
