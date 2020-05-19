package com.uca.capas.ejParcial.service;

import java.util.List;
import com.uca.capas.ejParcial.domain.Importancia;
import org.springframework.dao.DataAccessException;

public interface ImportanciaService {
    public List<Importancia> findAll() throws DataAccessException;   
}