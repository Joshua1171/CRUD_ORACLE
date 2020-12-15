package com.indra.bbva.oracle.hr.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Jobs implements Serializable {

    private static final long serialVersionUID = -3050410142291684121L;

    @Id
    private String job_id;
    private String job_title;
    private int min_salary;
    private int max_salary;

    @OneToMany(targetEntity = JobHistory.class,fetch = FetchType.LAZY)
    @JoinColumn(name="job_id",referencedColumnName = "job_id")
    @JsonIgnore
    private List<JobHistory> job_history;

    @Override
    public String toString() {
        return "Jobs{" +
                "job_id='" + job_id + '\'' +
                ", job_title='" + job_title + '\'' +
                ", min_salary=" + min_salary +
                ", max_salary=" + max_salary +
                ", job_history=" + job_history +
                '}';
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public int getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(int min_salary) {
        this.min_salary = min_salary;
    }

    public int getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(int max_salary) {
        this.max_salary = max_salary;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public List<JobHistory> getJob_history() {
        return job_history;
    }

    public void setJob_history(List<JobHistory> job_history) {
        this.job_history = job_history;
    }
}
