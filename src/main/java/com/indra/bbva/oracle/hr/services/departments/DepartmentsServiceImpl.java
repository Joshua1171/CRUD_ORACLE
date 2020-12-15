package com.indra.bbva.oracle.hr.services.departments;

import com.indra.bbva.oracle.hr.dao.IDepartmetsDao;
import com.indra.bbva.oracle.hr.entities.Departments;
import com.indra.bbva.oracle.hr.entities.join.DepartmentsLocations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentsServiceImpl implements IDepartmentsService{

    @Autowired
    private IDepartmetsDao departmetsDao;

    @Override
    public List<Departments> findAll() {
        return (List<Departments>) departmetsDao.findAll();
    }

    @Override
    public List<DepartmentsLocations> findDepartmentsLocations() {
        return departmetsDao.findDepartmentsLocations();
    }

    @Override
    public Departments findById(Long id) {
        return departmetsDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        departmetsDao.deleteById(id);
    }

    @Override
    public Departments save(Departments c) {
        return null;
    }
}
