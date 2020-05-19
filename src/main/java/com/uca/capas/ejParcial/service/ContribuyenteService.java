package com.uca.capas.ejParcial.service;

import java.util.List;

import com.uca.capas.ejParcial.domain.Contribuyente;

import org.springframework.dao.DataAccessException;

public interface ContribuyenteService {
    
    public List<Contribuyente> findAll() throws DataAccessException;

    public void save(Contribuyente c) throws DataAccessException;
}