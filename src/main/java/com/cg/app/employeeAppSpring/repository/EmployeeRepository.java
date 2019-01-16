package com.cg.app.employeeAppSpring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.app.employeeAppSpring.entity.Employee;

@Repository

public interface EmployeeRepository extends MongoRepository<Employee, Object> {

	
	
 
	
}
