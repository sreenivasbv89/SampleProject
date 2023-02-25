package com.aspirants.h2demo.controller;

import com.aspirants.h2demo.entity.onetoone.Employee;
import com.aspirants.h2demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){

       return employeeService.addEmployee(employee);
    }
}
