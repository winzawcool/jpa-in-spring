package com.solt.jdc.service;

import com.solt.jdc.dao.JpaEmployeeDao;
import com.solt.jdc.ds.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

@Service
public class EmployeeService {

    @Autowired
    private JpaEmployeeDao jpaEmployeeDao;

    @Transactional
    public void saveEmployeesUnderOneTransaction() {
        System.out.println("Saving Employee with JPA...");
        jpaEmployeeDao.save(new Employee(1,"John","William","john@email.com","999-99-99", Date.valueOf("2019-06-05"),7000));
        System.out.println("Saved Employee with JPA...");
    }

    @Transactional
    public void listAllEmployees() {
        System.out.println("List all employees...");
        jpaEmployeeDao.findAll().forEach(System.out::println);
    }
}
