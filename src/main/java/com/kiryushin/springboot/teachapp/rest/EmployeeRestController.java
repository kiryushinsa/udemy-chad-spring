package com.kiryushin.springboot.teachapp.rest;

import com.kiryushin.springboot.teachapp.dao.EmployeeDao;
import com.kiryushin.springboot.teachapp.entity.Employee;
import com.kiryushin.springboot.teachapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    private List<Employee> getAllEmployee() {

        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    private Employee getEmployee(@PathVariable Long employeeId) {
        Employee employee =  employeeService.findById(employeeId);

        if ( employee == null ) {
            throw new RuntimeException("Employee not found = " + employeeId);
        }

        return employee;
    }

    @PostMapping("/employees")
    private Employee addEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);

        return employee;
    }

    @PutMapping("/employees")
    private Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);

        return employee;
    }

    @DeleteMapping("/employees/{employeeId}")
    private String deleteEmployee(@PathVariable Long employeeId) {

        Employee employee = employeeService.findById(employeeId);

        if (employeeId == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        employeeService.deleteById(employeeId);

        return "Deleted employeeId - " + employeeId;
    }


}
