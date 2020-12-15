package com.indra.bbva.oracle.hr.dao;

import com.indra.bbva.oracle.hr.entities.Countries;
import com.indra.bbva.oracle.hr.entities.join.CountriesRegions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ICountriesDao extends JpaRepository<Countries,String> {

    @Query("select c from Countries c where c.country_id = ?1")
    public Countries buscarPorId(String id);

    //@Query(value = "DELETE FROM COUNTRIES WHERE COUNTRY_ID = ?1", nativeQuery = true)@Query(value ="SELECT r.region_name FROM Regions r JOIN Countries c on r.region_id=c.region_id",nativeQuery = true)
    //public List<Regions> verRegiones();

    @Query("SELECT new com.indra.bbva.oracle.hr.entities.join.CountriesRegions(c.country_name,r.region_name) FROM Countries c JOIN c.regions r")
    public List<CountriesRegions> findCountriesRegions();

    @Transactional
    @Modifying
    @Query("delete from Countries c where c.country_id= ?1")
    public void eliminarPorId(String id);
}
