package com.indra.bbva.oracle.hr.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Employees implements Serializable {

    private static final long serialVersionUID = 3847828725908770386L;

    @Id
    private Long employee_id;
    private String first_name;
    private String last_name;

    @Email
    @Column(unique = true)
    private String email;
    private String phone_number;
    private Date hire_date;



    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "job_id",referencedColumnName = "job_id",insertable = false,updatable = false)
    @JsonIgnore
    private Jobs job_id;

    private Integer salary;

    private Integer commission_pct;

    private Integer manager_id;


    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id",referencedColumnName = "department_id",insertable = true,updatable = true)
    @JsonIgnore
    private Departments department_id;


    @OneToMany(targetEntity = Locations.class,fetch = FetchType.LAZY)
    @JoinColumn(name="employee_id",referencedColumnName = "employee_id",insertable = false,updatable = false)
    @JsonIgnore
    private List<JobHistory> job_history;


    @Override
    public String toString() {
        return "Employees{" +
                "employee_id=" + employee_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", hire_date=" + hire_date +
                ", job_id=" + job_id +
                ", salary=" + salary +
                ", commission_pct=" + commission_pct +
                ", manager_id=" + manager_id +
                ", department_id=" + department_id +
                ", job_history=" + job_history +
                '}';
    }


    public List<JobHistory> getJob_history() {
        return job_history;
    }

    public void setJob_history(List<JobHistory> job_history) {
        this.job_history = job_history;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getCommission_pct() {
        return commission_pct;
    }

    public void setCommission_pct(Integer commission_pct) {
        this.commission_pct = commission_pct;
    }

    public Jobs getJob_id() {
        return job_id;
    }

    public void setJob_id(Jobs job_id) {
        this.job_id = job_id;
    }

    public Departments getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Departments department_id) {
        this.department_id = department_id;
    }
}
