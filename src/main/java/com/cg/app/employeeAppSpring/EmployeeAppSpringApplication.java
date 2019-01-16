package com.cg.app.employeeAppSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.app.employeeAppSpring.entity.Address;
import com.cg.app.employeeAppSpring.entity.Employee;
import com.cg.app.employeeAppSpring.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeAppSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAppSpringApplication.class, args);
		
		
	}
	@Bean
	public CommandLineRunner populateData(EmployeeRepository repository) {
		
		return(args)->{
			repository.save(new Employee(101,"bhanu", 15000, new Address("8-7", "nag", "bankroad", "hyderabad", "508393")));
			repository.save(new Employee(102,"bhanu", 15000, new Address("8-7", "nag", "bankroad", "hyderabad", "508393")));
			repository.save(new Employee(103,"bhanu", 15000, new Address("8-7", "nag", "bankroad", "hyderabad", "508393")));
			repository.save(new Employee(104,"bhanu", 15000, new Address("8-7", "nag", "bankroad", "hyderabad", "508393")));
			repository.save(new Employee(105,"bhanu", 15000, new Address("8-7", "nag", "bankroad", "hyderabad", "508393")));
			repository.save(new Employee(106,"bhanu", 15000, new Address("8-7", "nag", "bankroad", "hyderabad", "508393")));

		};
		
}
}

