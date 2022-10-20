package com.kiryushinsa.thymeleaf.service;

import com.kiryushinsa.thymeleaf.dao.EmployeeDao;

import com.kiryushinsa.thymeleaf.dao.EmployeeRepository;
import com.kiryushinsa.thymeleaf.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
        return employeeRepository.findAllByOrderByLastNameAsc();
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
