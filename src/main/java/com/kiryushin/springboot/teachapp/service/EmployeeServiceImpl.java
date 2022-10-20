package com.kiryushin.springboot.teachapp.service;

import com.kiryushin.springboot.teachapp.dao.EmployeeRepository;
import com.kiryushin.springboot.teachapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl (EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee employee = null;
        if ( result.isPresent() ) {
            employee = result.get();
        } else {
            throw new RuntimeException("Did not find employee with id " + id);
        }

        return employee;
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
