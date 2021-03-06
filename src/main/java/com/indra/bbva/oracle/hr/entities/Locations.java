package com.indra.bbva.oracle.hr.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Locations implements Serializable {

    private static final long serialVersionUID = 1449718269110875295L;

    @Id
    private Long location_id;
    private String street_address;
    private String postal_code;
    private String city;
    private String state_province;
    private String country_id;


    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id",insertable = false,updatable = false)
    @JsonIgnore
    private Countries countries;

    @Override
    public String toString() {
        return "Locations{" +
                "location_id=" + location_id +
                ", street_address='" + street_address + '\'' +
                ", postal_code='" + postal_code + '\'' +
                ", city='" + city + '\'' +
                ", state_province='" + state_province + '\'' +
                ", country_id='" + country_id + '\'' +
                ", countries=" + countries +
                '}';
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Long location_id) {
        this.location_id = location_id;
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

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }


}

