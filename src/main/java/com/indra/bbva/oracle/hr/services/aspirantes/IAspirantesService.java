package com.indra.bbva.oracle.hr.services.aspirantes;

import com.indra.bbva.oracle.hr.entities.Aspirantes;

import java.util.List;
import java.util.Set;

public interface IAspirantesService {

    public List<Aspirantes> findAll();
    public Set<Aspirantes> findByName(String dato);
    public Set<Aspirantes> filtro(String valor);
}
