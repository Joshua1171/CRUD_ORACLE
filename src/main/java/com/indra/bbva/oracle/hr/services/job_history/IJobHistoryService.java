package com.indra.bbva.oracle.hr.services.job_history;

import com.indra.bbva.oracle.hr.entities.JobHistory;

import java.util.List;

public interface IJobHistoryService {
    public List<JobHistory> findAll();
    public JobHistory findById(Long id);
    public void deleteById(Long id);
    public JobHistory save(JobHistory jobHistory);
}
