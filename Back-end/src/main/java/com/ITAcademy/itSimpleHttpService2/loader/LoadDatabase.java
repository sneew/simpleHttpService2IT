package com.ITAcademy.itSimpleHttpService2.loader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ITAcademy.itSimpleHttpService2.bean.Employee;
import com.ITAcademy.itSimpleHttpService2.bean.Role;
import com.ITAcademy.itSimpleHttpService2.repository.EmployeeRepository;




@Configuration
public class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		return args -> {System.out.println("Preloading Data to memotyDatabase"); 
						repository.save(new Employee("Bilbo Biggins", Role.BOSS));
						repository.save(new Employee("Frodo Biggins", Role.EMPLOYEE));
						System.out.println("Data loaded");
		};
	}
}
