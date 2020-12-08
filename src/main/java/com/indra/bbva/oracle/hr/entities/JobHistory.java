package com.indra.bbva.oracle.hr.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Table(name = "job_history")
public class JobHistory implements Serializable {

    private static final long serialVersionUID = 7598432306797093770L;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id",referencedColumnName = "employee_id")
    private Employees employee_id;

    @Id
    private Date start_date;
    private Date end_date;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "job_id",referencedColumnName = "job_id")
    private Jobs job_id;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id",referencedColumnName = "department_id")
    private Departments department_id;

    @Override
    public String toString() {
        return "Job_history{" +
                "employee_id=" + employee_id +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", job_id=" + job_id +
                ", department_id=" + department_id +
                '}';
    }

    public Employees getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Employees employee_id) {
        this.employee_id = employee_id;
    }

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
