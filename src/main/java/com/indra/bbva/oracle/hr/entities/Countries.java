package com.indra.bbva.oracle.hr.entities;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Countries implements Serializable {


    private static final long serialVersionUID = -6184806735949850277L;

    @Id
    private String country_id;
    private String country_name;
    private Long region_id;


    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "region_id",updatable = false,insertable = false)
    @JsonIgnore
    private Regions regions;

    @OneToMany(targetEntity = Locations.class,fetch = FetchType.LAZY)
    @JoinColumn(name="c_fk",referencedColumnName = "country_id")
    @JsonIgnore
    private List<Locations> locations;


    public Long getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Long region_id) {
        this.region_id = region_id;
    }

    public List<Locations> getLocations() {
        return locations;
    }

    public void setLocations(List<Locations> locations) {
        this.locations = locations;
    }

    public Regions getRegions() {
        return regions;
    }

    public void setRegions(Regions regions) {
        this.regions = regions;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }


}
