package com.indra.bbva.oracle.hr.services.job_history;

import com.indra.bbva.oracle.hr.dao.IJobHistoryDao;
import com.indra.bbva.oracle.hr.dao.IJobsDao;
import com.indra.bbva.oracle.hr.entities.JobHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobHistoryServiceImpl implements IJobHistoryService{
    @Autowired
    private IJobHistoryDao jobHistoryDao;

    @Override
    public List<JobHistory> findAll() {
        return (List<JobHistory>) jobHistoryDao.findAll();
    }

    @Override
    public JobHistory findById(Long id) {
        return jobHistoryDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        jobHistoryDao.deleteById(id);
    }

    @Override
    public JobHistory save(JobHistory jobHistory) {
        return jobHistoryDao.save(jobHistory);
    }
}
