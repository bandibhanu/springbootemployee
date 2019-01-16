package com.cg.app.employeeAppSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.employeeAppSpring.entity.Employee;
import com.cg.app.employeeAppSpring.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements Employeeservice {
	
	@Autowired(required=true)
	public EmployeeRepository repository;
	
	@Override()
	public void addNewEmployee(Employee employee) {
		repository.save(employee);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
				return repository.findAll();
	}

	@Override
	public void update(Employee employee) {
		repository.save(employee);
		
	}



	/*
	 * @Override public void delete(int empId) { // TODO Auto-generated method stub
	 * Employee employee=repository.getOne(empId); repository.delete(employee); }
	 */
//
//	@Override
//	public void getElementById(int empId) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete(int empId) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
