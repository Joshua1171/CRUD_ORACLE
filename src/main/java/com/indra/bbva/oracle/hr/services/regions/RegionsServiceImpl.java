package com.indra.bbva.oracle.hr.services.regions;

import com.indra.bbva.oracle.hr.dao.IRegionsDao;
import com.indra.bbva.oracle.hr.entities.Regions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionsServiceImpl implements IRegionsService {

    @Autowired
    private IRegionsDao regionsDao;

    @Override
    public List<Regions> findAll() {
        return (List<Regions>) regionsDao.findAll();
    }

    @Override
    public Regions findById(Long id) {
        return regionsDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        regionsDao.deleteById(id);

    }

    @Override
    public Regions save(Regions c) {
        return regionsDao.save(c);
    }
}
