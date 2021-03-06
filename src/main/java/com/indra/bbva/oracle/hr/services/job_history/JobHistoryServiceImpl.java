package com.indra.bbva.oracle.hr.services.job_history;

import com.indra.bbva.oracle.hr.dao.IJobHistoryDao;

import com.indra.bbva.oracle.hr.entities.JobHistory;
import com.indra.bbva.oracle.hr.entities.join.JobHistoryEmploye;
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
    public List<JobHistory> findAllById(Long id) {
        return jobHistoryDao.buscarTodoPorId(id);
    }

    @Override
    public List<JobHistoryEmploye> findEmployeHistory() {
        return jobHistoryDao.findEmployeeHistory();
    }

    @Override
    public JobHistory findOneById(Long id) {
        return jobHistoryDao.buscarPorEmpleado(id);
    }

    @Override
    public void deleteById(Long id) {
        jobHistoryDao.eliminarPorIdEmpleado(id);
    }

    @Override
    public JobHistory save(JobHistory jobHistory) {
        return jobHistoryDao.save(jobHistory);
    }
}
