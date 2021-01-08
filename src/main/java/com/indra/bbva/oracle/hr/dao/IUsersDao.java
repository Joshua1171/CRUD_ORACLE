package com.indra.bbva.oracle.hr.dao;

import com.indra.bbva.oracle.hr.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsersDao extends CrudRepository<Usuario,Long> {
    public Usuario findByEmailAndPassword(String email,String password);
}
