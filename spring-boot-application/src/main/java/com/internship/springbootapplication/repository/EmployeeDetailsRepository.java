package com.internship.springbootapplication.repository;

import com.internship.springbootapplication.model.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails,Integer> {

}
