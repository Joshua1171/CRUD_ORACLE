package com.indra.bbva.oracle.hr.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Departments implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long department_id;

    private String department_name;
    private Long manager_id;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id",referencedColumnName = "location_id")
    private Locations location_id;
    /*
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "users_to_roles",
            joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "role_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","role_id"})})
   */
    @Override
    public String toString() {
        return "Departments{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                ", manager_id=" + manager_id +
                ", location_id=" + location_id +
                '}';
    }

    public Locations getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Locations location_id) {
        this.location_id = location_id;
    }

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public Long getManager_id() {
        return manager_id;
    }

    public void setManager_id(Long manager_id) {
        this.manager_id = manager_id;
    }




}