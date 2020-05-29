package com.ITAcademy.itSimpleHttpService2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ITAcademy.itSimpleHttpService2.bean.Employee;
import com.ITAcademy.itSimpleHttpService2.bean.Role;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	List<Employee> findByRole(Role role);
	
}
