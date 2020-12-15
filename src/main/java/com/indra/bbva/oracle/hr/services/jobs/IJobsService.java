package com.indra.bbva.oracle.hr.services.jobs;

import com.indra.bbva.oracle.hr.entities.Jobs;
import com.indra.bbva.oracle.hr.entities.join.JJobHistory;

import java.util.List;

public interface IJobsService {
    public List<Jobs> findAll();
    public List<JJobHistory> findHistory();
    public Jobs findById(String id);
    public void deleteById(String id);
    public Jobs save(Jobs c);
}
