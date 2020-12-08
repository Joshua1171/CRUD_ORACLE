package com.indra.bbva.oracle.hr.dao;

import com.indra.bbva.oracle.hr.entities.JobHistory;
import org.springframework.data.repository.CrudRepository;

public interface IJobHistoryDao extends CrudRepository<JobHistory,Long> {
}
