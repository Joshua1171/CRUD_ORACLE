package com.indra.bbva.oracle.hr.services.countries;

import com.indra.bbva.oracle.hr.dao.ICountriesDao;
import com.indra.bbva.oracle.hr.entities.Countries;
import com.indra.bbva.oracle.hr.entities.Regions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountriesServiceImpl implements ICountriesService{

    @Autowired
    private ICountriesDao iCountriesDao;

    @Override
    @Transactional(readOnly = true)
    public List<Countries> findAll() {
        return (List<Countries>)iCountriesDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Countries findById(String id) {
        return iCountriesDao.buscarPorId(id);
    }

    @Override
    @Transactional
    public void deleteById(String id) {
        iCountriesDao.eliminarPorId(id);
    }

    @Override
    @Transactional
    public Countries save(Countries c) {
        return iCountriesDao.save(c);
    }




}
