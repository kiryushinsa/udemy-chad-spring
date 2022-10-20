package com.kiryushin.springboot.teachapp.dao;

import com.kiryushin.springboot.teachapp.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    Employee findById(Long id);

    void save(Employee employee);

    void deleteById(Long id);
}
