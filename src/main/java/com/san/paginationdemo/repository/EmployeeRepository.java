package com.san.paginationdemo.repository;

import com.san.paginationdemo.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
