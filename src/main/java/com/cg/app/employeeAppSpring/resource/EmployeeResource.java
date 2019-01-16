package com.cg.app.employeeAppSpring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.employeeAppSpring.entity.Employee;
import com.cg.app.employeeAppSpring.service.Employeeservice;

@RestController
@RequestMapping("/employees")
public class EmployeeResource {

	@Autowired
	public Employeeservice service;
	
	@PostMapping
	public void addNewEmployee(@RequestBody Employee employee)
	{
		service.addNewEmployee(employee);
	}
	@GetMapping
	public List<Employee>getAllEmployees(){
		return service.getAllEmployees();
	}
	@PutMapping
	public void update(@RequestBody Employee employee)
	{
		service.update(employee);
	}
//	@DeleteMapping("/{empId}")
//	public void delete(@PathVariable int empId)
//	{
//		service.delete(empId);
//	}
	
	
	
}
