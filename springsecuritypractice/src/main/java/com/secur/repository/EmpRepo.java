package com.secur.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.secur.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer>{
 
	public Employee findByEmail(String email);
}
