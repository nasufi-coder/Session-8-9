package com.internship.springbootapplication.service;

import com.internship.springbootapplication.model.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    Optional<Employee> findById(Integer id);
    List<Employee> findAllEmployees();

    void saveEmployee(Employee employee);

    void deleteEmployee(Employee employee);
}
