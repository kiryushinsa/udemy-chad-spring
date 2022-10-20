package com.kiryushin.springboot.teachapp.dao;

import com.kiryushin.springboot.teachapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoJpaImpl (EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        Query query = entityManager.createQuery("from Employee");

        List<Employee> employeeList = query.getResultList();

        return employeeList;
    }

    @Override
    public Employee findById(Long id) {

        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void save(Employee employee) {
        Employee theEmployee = entityManager.merge(employee);

        // update entity with id from retrieving from database
        employee.setId(theEmployee.getId());
    }

    @Override
    public void deleteById(Long id) {
        Query query = entityManager.createQuery("delete from Employee where id=:employeeId");

        query.setParameter("employeeId", id);
        query.executeUpdate();
    }

}
