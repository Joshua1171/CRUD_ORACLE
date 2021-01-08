package com.indra.bbva.oracle.hr.services.aspirantes;

import com.indra.bbva.oracle.hr.dao.IAspirantesDao;
import com.indra.bbva.oracle.hr.entities.Aspirantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;


@Service
public class AspirantesServiceImpl implements IAspirantesService{

    @Autowired
    private IAspirantesDao aspirantesDao;


    @Override
    @Transactional(readOnly = true)
    public List<Aspirantes> findAll() {
        return (List<Aspirantes>)aspirantesDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Set<Aspirantes> findByName(String dato) {
        return (Set<Aspirantes>) aspirantesDao.findByNombres(dato);
    }

    @Override
    @Transactional(readOnly = true)
    public Set<Aspirantes> filtro(String valor) {
        return aspirantesDao.findByNombresOrApellidosOrTecnologia(valor,valor,valor);
    }
}
