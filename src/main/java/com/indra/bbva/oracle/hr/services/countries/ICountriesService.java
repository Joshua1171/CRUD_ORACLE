package com.indra.bbva.oracle.hr.services.countries;

import com.indra.bbva.oracle.hr.entities.Countries;
import com.indra.bbva.oracle.hr.entities.join.CountriesRegions;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ICountriesService {

    public List<Countries> findAll();
    public List<CountriesRegions> findNames();
    public Countries findById(String id);
    public void deleteById(String id);
    public Countries save(Countries c);

}
