package com.indra.bbva.oracle.hr.entities.join;

import java.util.Date;

public class JobHistoryEmploye {

    private Date hire_date;
    private Date start_date;
    private String first_name;
    private String last_name;
    private String email;
    private Date end_date;

    public JobHistoryEmploye(Date hire_date, Date start_date, String first_name, String last_name, String email, Date end_date) {
        this.hire_date = hire_date;
        this.start_date = start_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.end_date = end_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
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
}
