package com.indra.bbva.oracle.hr.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@IdClass(JobHistoryPK.class)
@Table(name = "job_history")
public class JobHistory implements Serializable {


    private static final long serialVersionUID = 7598432306797093770L;



    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id",insertable = false,updatable = false)
    @JsonIgnore
    private Employees employees;

    @Id
    private Long employee_id;

    @Id
    @Temporal(TemporalType.TIMESTAMP)
    private Date start_date;

    @PrePersist
    public void prePersist(){
        this.start_date=new Date();
    }

    private Date end_date;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "job_id",referencedColumnName = "job_id",insertable = false,updatable = false)
    @JsonIgnore
    private Jobs jobs;

    private String job_id;


    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id",insertable = false,updatable = false)
    @JsonIgnore
    private Departments departments;

    private Long department_id;




    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobHistory)) return false;
        JobHistory that = (JobHistory) o;
        return employee_id.equals(that.employee_id) && getStart_date().equals(that.getStart_date());
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee_id, getStart_date());
    }
}
