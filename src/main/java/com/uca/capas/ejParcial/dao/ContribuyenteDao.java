package com.uca.capas.ejParcial.dao;

import java.util.List;
import com.uca.capas.ejParcial.domain.Contribuyente;
import org.springframework.dao.DataAccessException;

public interface ContribuyenteDao {

    public List<Contribuyente> findAll() throws DataAccessException;

    public void save(Contribuyente c) throws DataAccessException;
    
}