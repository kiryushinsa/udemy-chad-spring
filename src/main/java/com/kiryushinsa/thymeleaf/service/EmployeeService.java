package com.kiryushinsa.thymeleaf.service;


import com.kiryushinsa.thymeleaf.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(Long id);

    void save(Employee employee);

    void deleteById(Long id);
}
