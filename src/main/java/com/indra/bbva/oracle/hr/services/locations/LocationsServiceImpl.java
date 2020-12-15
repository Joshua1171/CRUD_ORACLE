package com.indra.bbva.oracle.hr.services.locations;

import com.indra.bbva.oracle.hr.dao.ILocationsDao;
import com.indra.bbva.oracle.hr.entities.Locations;
import com.indra.bbva.oracle.hr.entities.join.LocationsCR;
import com.indra.bbva.oracle.hr.entities.join.LocationsCountries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationsServiceImpl implements ILocationsService {

    @Autowired
    private ILocationsDao locationsDao;
    @Override
    public List<Locations> findAll() {
        return (List<Locations>) locationsDao.findAll();
    }

    @Override
    public List<LocationsCountries> findLocationsCountries() {
        return locationsDao.findLocationsCountries();
    }

    @Override
    public List<LocationsCR> findLocationsCR() {
        return locationsDao.findLocationsCR();
    }

    @Override
    public Locations findById(Long id) {
        return locationsDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        locationsDao.deleteById(id);
    }

    @Override
    public Locations save(Locations c) {
        return locationsDao.save(c);
    }
}
