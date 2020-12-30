package com.solt.jdc.dao;

import com.solt.jdc.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface JpaEmployeeDao extends CrudRepository<Employee,Integer> {
}
