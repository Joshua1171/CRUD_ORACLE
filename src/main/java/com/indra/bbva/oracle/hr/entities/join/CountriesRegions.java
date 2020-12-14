package com.indra.bbva.oracle.hr.entities.join;

import javax.persistence.Entity;

public class CountriesRegions {

    private String country_name;
    private String region_name;

    public CountriesRegions(String country_name, String region_name) {
        this.country_name = country_name;
        this.region_name = region_name;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }
}
