package com.indra.bbva.oracle.hr.services.regions;

import com.indra.bbva.oracle.hr.entities.Regions;

import java.util.List;


public interface IRegionsService {
    public List<Regions> findAll();
    public Regions findById(Long id);
    public void deleteById(Long id);
    public Regions save(Regions c);
}
