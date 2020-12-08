package com.indra.bbva.oracle.hr.services.locations;

import com.indra.bbva.oracle.hr.entities.Locations;

import java.util.List;

public interface ILocationsService {
    public List<Locations> findAll();
    public Locations findById(Long id);
    public void deleteById(Long id);
    public Locations save(Locations c);
}
