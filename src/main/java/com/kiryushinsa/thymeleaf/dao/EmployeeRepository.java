package com.kiryushinsa.thymeleaf.dao;


import com.kiryushinsa.thymeleaf.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public List<Employee> findAllByOrderByLastNameAsc();
}
