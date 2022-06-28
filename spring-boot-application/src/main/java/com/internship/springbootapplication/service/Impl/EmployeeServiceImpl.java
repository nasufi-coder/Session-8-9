package com.internship.springbootapplication.service.Impl;

import com.internship.springbootapplication.model.entity.Employee;
import com.internship.springbootapplication.repository.EmployeeRepository;
import com.internship.springbootapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeServiceImpl  implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Optional<Employee> findById(Integer id) {
        return employeeRepository.findById(id);

    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

}
