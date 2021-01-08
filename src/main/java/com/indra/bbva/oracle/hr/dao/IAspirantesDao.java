package com.indra.bbva.oracle.hr.dao;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.indra.bbva.oracle.hr.entities.Aspirantes;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface IAspirantesDao extends CrudRepository<Aspirantes,Long> {

    public Set<Aspirantes> findByApellidos(String apellido);
    public Set<Aspirantes> findByNombres(String nombres);
    public Set<Aspirantes> findByEstatus(int estatus);
    public Set<Aspirantes> findByTecnologia(String tecnologia);
    public Set<Aspirantes> findByExperiencia(int experiencia);
    public Set<Aspirantes> findByNombresOrApellidosOrTecnologia
            (String nombre,String apellidos,String tecnologia);


}
