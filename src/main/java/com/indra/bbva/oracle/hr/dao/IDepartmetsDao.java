package com.indra.bbva.oracle.hr.dao;

import com.indra.bbva.oracle.hr.entities.Departments;
import com.indra.bbva.oracle.hr.entities.join.DepartmentsLocations;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IDepartmetsDao extends CrudRepository<Departments,Long> {

    @Query("SELECT new com.indra.bbva.oracle.hr.entities.join.DepartmentsLocations" +
            "(d.department_name,l.street_address,l.postal_code,l.city,l.state_province) " +
            "FROM Departments d JOIN d.locations l")
    public List<DepartmentsLocations> findDepartmentsLocations();

}
