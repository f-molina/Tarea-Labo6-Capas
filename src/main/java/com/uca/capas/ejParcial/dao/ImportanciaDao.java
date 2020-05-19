package com.uca.capas.ejParcial.dao;

import java.util.List;
import com.uca.capas.ejParcial.domain.Importancia;
import org.springframework.dao.DataAccessException;

public interface ImportanciaDao {
    public List<Importancia> findAll() throws DataAccessException;   
}