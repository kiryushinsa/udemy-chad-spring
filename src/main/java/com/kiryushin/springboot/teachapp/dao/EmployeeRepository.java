package com.kiryushin.springboot.teachapp.dao;

import com.kiryushin.springboot.teachapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
