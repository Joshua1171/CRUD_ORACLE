package com.indra.bbva.oracle.hr.entities;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Countries implements Serializable {


    private static final long serialVersionUID = -6184806735949850277L;
    @Id
    private String country_id;

    private String country_name;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "region_id",referencedColumnName = "region_id")
    private Regions region_id;


    @Override
    public String toString() {
        return "Countries{" +
                "country_id='" + country_id + '\'' +
                ", country_name='" + country_name + '\'' +
                ", region_id=" + region_id +
                '}';
    }

    public Regions getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Regions region_id) {
        this.region_id = region_id;
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
