package com.indra.bbva.oracle.hr.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Regions implements Serializable {

    private static final long serialVersionUID = -4112237509759230761L;
    @Id
    private Long region_id;


    private String region_name;

    @OneToMany(targetEntity = Countries.class,fetch = FetchType.LAZY)
    @JoinColumn(name="r_fk",referencedColumnName = "region_id")
    @JsonIgnore
    private List<Countries> countries;

    @Override
    public String toString() {
        return "Regions{" +
                "region_id=" + region_id +
                ", region_name='" + region_name + '\'' +
                '}';
    }

    public List<Countries> getCountries() {
        return countries;
    }

    public void setCountries(List<Countries> countries) {
        this.countries = countries;
    }

    public Long getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Long region_id) {
        this.region_id = region_id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

}
