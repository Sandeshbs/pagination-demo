package com.san.paginationdemo;

import com.san.paginationdemo.domain.Employee;
import com.san.paginationdemo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PaginationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginationDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(EmployeeRepository employeeRepository) {
		return args -> {
			employeeRepository.save(new Employee("Sandesh", "BS", "san@gamil.com"));
		};
	}

}
