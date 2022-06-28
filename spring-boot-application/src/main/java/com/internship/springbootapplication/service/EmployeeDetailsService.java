package com.internship.springbootapplication.service;

import com.internship.springbootapplication.model.entity.Employee;
import com.internship.springbootapplication.model.entity.EmployeeDetails;

import java.util.List;
import java.util.Optional;

public interface EmployeeDetailsService {
    Optional<EmployeeDetails> findById(Integer id);
    List<EmployeeDetails> findAllEmployeeDetails();

    void saveEmployeeDetails(EmployeeDetails employeeDetails);

    void deleteEmployeeDetails(EmployeeDetails employeeDetails);
}
