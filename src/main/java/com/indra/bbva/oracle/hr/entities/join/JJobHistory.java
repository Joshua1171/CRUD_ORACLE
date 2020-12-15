package com.indra.bbva.oracle.hr.entities.join;

import java.util.Date;

public class JJobHistory {

    private Date start_date;
    private String job_title;
    private int min_salary;
    private int max_salary;
    private Date end_date;

    public JJobHistory(Date start_date, String job_title, int min_salary, int max_salary, Date end_date) {
        this.start_date = start_date;
        this.job_title = job_title;
        this.min_salary = min_salary;
        this.max_salary = max_salary;
        this.end_date = end_date;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }


    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
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

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
