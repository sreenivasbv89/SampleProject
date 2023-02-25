package com.aspirants.h2demo.dao;

import com.aspirants.h2demo.entity.onetoone.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
