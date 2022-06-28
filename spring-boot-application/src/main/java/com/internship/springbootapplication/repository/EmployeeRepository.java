package com.internship.springbootapplication.repository;

import com.internship.springbootapplication.model.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>  {

    //    Optional<Employee> findByName(Integer Id);

}
