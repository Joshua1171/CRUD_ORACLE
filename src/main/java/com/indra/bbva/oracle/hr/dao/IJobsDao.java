package com.indra.bbva.oracle.hr.dao;

import com.indra.bbva.oracle.hr.entities.Jobs;
import com.indra.bbva.oracle.hr.entities.join.CountriesRegions;
import com.indra.bbva.oracle.hr.entities.join.JJobHistory;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IJobsDao extends CrudRepository<Jobs,String> {


    @Query("select j from Jobs j where j.job_id = ?1")
    public Jobs buscarPorId(String id);

    @Query("SELECT new com.indra.bbva.oracle.hr.entities.join.JJobHistory" +
            "(h.start_date,j.job_title,j.min_salary,j.max_salary,h.end_date) " +
            "FROM Jobs j JOIN j.job_history h")
    public List<JJobHistory> findHistory();


    @Transactional
    @Modifying
    @Query("delete from Jobs j where j.job_id= ?1")
    public void eliminarPorId(String id);
}
