package com.indra.bbva.oracle.hr.services.jobs;

import com.indra.bbva.oracle.hr.dao.IJobsDao;
import com.indra.bbva.oracle.hr.entities.Jobs;
import com.indra.bbva.oracle.hr.entities.join.JJobHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsServiceImpl implements IJobsService{

    @Autowired
    private IJobsDao jobsDao;


    @Override
    public List<Jobs> findAll() {
        return (List<Jobs>) jobsDao.findAll();
    }

    @Override
    public List<JJobHistory> findHistory() {
        return jobsDao.findHistory();
    }

    @Override
    public Jobs findById(String id) {
        return jobsDao.buscarPorId(id);
    }

    @Override
    public void deleteById(String id) {
        jobsDao.eliminarPorId(id);
    }

    @Override
    public Jobs save(Jobs c) {
        return jobsDao.save(c);
    }
}
