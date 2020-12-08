package com.indra.bbva.oracle.hr.dao;

import com.indra.bbva.oracle.hr.entities.Locations;
import org.springframework.data.repository.CrudRepository;

public interface ILocationsDao extends CrudRepository<Locations,Long> {
}
