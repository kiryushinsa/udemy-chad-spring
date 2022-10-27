package com.kiryushinsa.thymeleaf.controller;

import com.kiryushinsa.thymeleaf.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private List<Employee> employeeList;

    @PostConstruct
    private void loadData () {
        Employee emp1 = new Employee(1, "leslie", "andrew", "leslie@test.com");
        Employee emp2 = new Employee(2, "bro", "kip", "bro@test.com");
        Employee emp3 = new Employee(3, "lancelot", "einstein", "lancelot@test.com");
        Employee emp4 = new Employee(4, "kevin", "bronko", "kevin@test.com");

        employeeList = new ArrayList<>();

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
    }

    @GetMapping("/list")
    public String getEmployee(Model model) {

        model.addAttribute("listEmployee", employeeList);

        return "list-employee";
    }
}
