package com.indra.bbva.oracle.hr.dao;

import com.indra.bbva.oracle.hr.entities.Locations;
import com.indra.bbva.oracle.hr.entities.join.LocationsCR;
import com.indra.bbva.oracle.hr.entities.join.LocationsCountries;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ILocationsDao extends CrudRepository<Locations,Long> {

    @Query("SELECT new com.indra.bbva.oracle.hr.entities.join.LocationsCountries" +
            "(c.country_name,l.street_address,l.postal_code,l.city,l.state_province) " +
            "FROM Locations l JOIN l.countries c")
    public List<LocationsCountries> findLocationsCountries();

    @Query("SELECT new com.indra.bbva.oracle.hr.entities.join.LocationsCR" +
            "(l.street_address,l.postal_code,l.city,c.country_name,r.region_name) " +
            "FROM Locations l JOIN l.countries c JOIN c.regions r ")
    public List<LocationsCR> findLocationsCR();

}
