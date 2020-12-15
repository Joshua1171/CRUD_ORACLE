package com.indra.bbva.oracle.hr.entities.join;

public class LocationsCR {
    private String street_address;
    private String postal_code;
    private String city;
    private String country_name;
    private String region_name;


    public LocationsCR(String street_address, String postal_code, String city, String country_name, String region_name) {
        this.street_address = street_address;
        this.postal_code = postal_code;
        this.city = city;
        this.country_name = country_name;
        this.region_name = region_name;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
