package com.uca.capas.ejParcial.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.uca.capas.ejParcial.domain.Importancia;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class ImportanciaDaoImpl implements ImportanciaDao {

    @PersistenceContext(unitName = "capas")
    private EntityManager entityManager;

    @Override
    public List<Importancia> findAll() throws DataAccessException {
        StringBuffer sb = new StringBuffer();
        sb.append("select * from public.importancia");
        Query query = entityManager.createNativeQuery(sb.toString(), Importancia.class);
        List<Importancia> res = query.getResultList();

        return res;
    }
}