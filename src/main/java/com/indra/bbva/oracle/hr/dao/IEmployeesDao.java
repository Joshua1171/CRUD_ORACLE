package com.indra.bbva.oracle.hr.dao;

import com.indra.bbva.oracle.hr.entities.Employees;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeesDao extends CrudRepository<Employees,Long> {
}
