package com.kiryushinsa.thymeleaf.dao;


import com.kiryushinsa.thymeleaf.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    Employee findById(Long id);

    void save(Employee employee);

    void deleteById(Long id);
}
