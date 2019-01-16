package com.cg.app.employeeAppSpring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.app.employeeAppSpring.entity.Employee;
@Service
public interface Employeeservice {

	void addNewEmployee(Employee employee);

	List<Employee> getAllEmployees();

	void update(Employee employee);

	//void delete(int empId);

	//void getElementById(int empId);



}
