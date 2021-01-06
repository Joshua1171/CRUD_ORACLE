package com.indra.bbva.oracle.hr.services.aspirantes;

import com.indra.bbva.oracle.hr.dao.IAspirantesDao;
import com.indra.bbva.oracle.hr.entities.Aspirantes;
import com.indra.bbva.oracle.hr.entities.Countries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public class AspirantesServiceImpl implements IAspirantesService{

    @Autowired
    private IAspirantesDao aspirantesDao;


    @Override
    public List<Aspirantes> findAll() {
        return (List<Aspirantes>) aspirantesDao.findAll();
    }
}
