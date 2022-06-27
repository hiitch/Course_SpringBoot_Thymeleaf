package com.springboot.demo.myapp.dao;

import com.springboot.demo.myapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //custom code
    List<Employee> findAllByOrderByLastNameAsc();
}
