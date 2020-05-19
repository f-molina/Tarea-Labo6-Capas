package com.uca.capas.ejParcial.service;

import java.util.List;
import com.uca.capas.ejParcial.dao.ContribuyenteDao;
import com.uca.capas.ejParcial.domain.Contribuyente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContribuyenteServiceImpl implements ContribuyenteService {

    @Autowired
    ContribuyenteDao contribuyenteDao;

    @Override
    public List<Contribuyente> findAll() throws DataAccessException {
        return contribuyenteDao.findAll();
    }

    @Override
    @Transactional
    public void save(Contribuyente c) throws DataAccessException {
        contribuyenteDao.save(c);
    }
}