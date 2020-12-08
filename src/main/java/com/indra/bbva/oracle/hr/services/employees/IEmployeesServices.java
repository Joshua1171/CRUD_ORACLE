package com.indra.bbva.oracle.hr.services.employees;



import com.indra.bbva.oracle.hr.entities.Employees;

import java.util.List;

public interface IEmployeesServices {
    public List<Employees> findAll();
    public Employees findById(Long id);
    public void deleteById(Long id);
    public Employees save(Employees e);
}
