package com.indra.bbva.oracle.hr.services.locations;

import com.indra.bbva.oracle.hr.entities.Locations;
import com.indra.bbva.oracle.hr.entities.join.LocationsCR;
import com.indra.bbva.oracle.hr.entities.join.LocationsCountries;

import java.util.List;

public interface ILocationsService {
    public List<Locations> findAll();
    public List<LocationsCountries> findLocationsCountries();
    public List<LocationsCR> findLocationsCR();
    public Locations findById(Long id);
    public void deleteById(Long id);
    public Locations save(Locations c);
}
