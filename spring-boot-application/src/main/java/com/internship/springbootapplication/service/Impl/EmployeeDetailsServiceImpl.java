package com.internship.springbootapplication.service.Impl;

import com.internship.springbootapplication.model.entity.EmployeeDetails;
import com.internship.springbootapplication.repository.EmployeeDetailsRepository;
import com.internship.springbootapplication.repository.EmployeeRepository;
import com.internship.springbootapplication.service.EmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

    @Autowired
    private EmployeeDetailsRepository employeeDetailsRepository;

    @Override
    public Optional<EmployeeDetails> findById(Integer id) {
        return employeeDetailsRepository.findById(id);
    }

    @Override
    public List<EmployeeDetails> findAllEmployeeDetails() {
        return employeeDetailsRepository.findAll();
    }

    @Override
    public void saveEmployeeDetails(EmployeeDetails employeeDetails) {
            employeeDetailsRepository.save(employeeDetails);
    }

    @Override
    public void deleteEmployeeDetails(EmployeeDetails employeeDetails) {
            employeeDetailsRepository.delete(employeeDetails);
    }
}
