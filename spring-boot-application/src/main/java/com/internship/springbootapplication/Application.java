package com.internship.springbootapplication;

import com.internship.springbootapplication.model.entity.Employee;


import com.internship.springbootapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {
	@Autowired
	private EmployeeService employeeService;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


	}



		@PostConstruct
		private void construct() {
			Employee e1 = employeeService.findById(1).get();
			System.out.println(e1.getFirstName()+""
			+e1.getMiddleName());
		}

//	@Bean
//	public Employee demo(){
//		EmployeeRepositoryImpl employeeRepository=new EmployeeRepositoryImpl();
//		Employee e1=new Employee();
//		e1 =  employeeRepository.findbyID(1).get();
//
//		return e1;
//	}
//@Bean
//public CommandLineRunner demo(Employee employee) {
//	return (args) -> {
//		// save a few customers
//
//	};
//}




}
