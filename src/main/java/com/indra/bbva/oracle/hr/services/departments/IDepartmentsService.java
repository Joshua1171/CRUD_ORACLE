package com.indra.bbva.oracle.hr.services.departments;

import com.indra.bbva.oracle.hr.entities.Departments;

import java.util.List;

public interface IDepartmentsService {
    public List<Departments> findAll();
    public Departments findById(Long id);
    public void deleteById(Long id);
    public Departments save(Departments c);
}
