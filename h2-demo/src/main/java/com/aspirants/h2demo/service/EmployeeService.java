package com.aspirants.h2demo.service;

import com.aspirants.h2demo.dao.EmployeeRepo;
import com.aspirants.h2demo.entity.onetoone.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo empRepo;
    public Employee addEmployee(Employee employee) {
        return empRepo.save(employee);
    }
}
