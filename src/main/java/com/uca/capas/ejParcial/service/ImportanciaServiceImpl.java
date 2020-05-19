package com.uca.capas.ejParcial.service;

import com.uca.capas.ejParcial.dao.ImportanciaDao;
import java.util.List;
import com.uca.capas.ejParcial.domain.Importancia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class ImportanciaServiceImpl implements ImportanciaService {

    @Autowired
    ImportanciaDao importanciaDao;

    @Override
    public List<Importancia> findAll() throws DataAccessException {
        return importanciaDao.findAll();
    }
    
}