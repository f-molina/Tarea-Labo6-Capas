package com.uca.capas.ejParcial.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.uca.capas.ejParcial.domain.Contribuyente;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class ContribuyenteDaoImpl implements ContribuyenteDao {

    @PersistenceContext(unitName = "capas")
    private EntityManager entityManager;

    @Override
    public List<Contribuyente> findAll() throws DataAccessException {
        StringBuffer sb = new StringBuffer();
        sb.append("select * from public.contribuyente");
        Query query = entityManager.createNativeQuery(sb.toString(), Contribuyente.class);
        List<Contribuyente> res = query.getResultList();

        return res;
    }

    @Override
    public void save(Contribuyente c) throws DataAccessException {
        entityManager.persist(c);
    }
}