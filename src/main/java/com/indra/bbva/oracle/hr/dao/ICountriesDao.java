package com.indra.bbva.oracle.hr.dao;

import com.indra.bbva.oracle.hr.entities.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ICountriesDao extends JpaRepository<Countries,String> {

    @Query("select c from Countries c where c.country_id = ?1")
    public Countries buscarPorId(String id);

    //@Query(value = "DELETE FROM COUNTRIES WHERE COUNTRY_ID = ?1", nativeQuery = true)

    @Transactional
    @Modifying
    @Query("delete from Countries c where c.country_id= ?1")
    public void eliminarPorId(String id);
}
