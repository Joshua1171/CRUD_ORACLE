package com.indra.bbva.oracle.hr.entities.join;

public class LocationsCountries {

    private String country_name;
    private String street_address;
    private String city;
    private String state_province;

    public LocationsCountries(String country_name, String street_address, String city, String state_province) {
        this.country_name = country_name;
        this.street_address = street_address;
        this.city = city;
        this.state_province = state_province;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }
}
