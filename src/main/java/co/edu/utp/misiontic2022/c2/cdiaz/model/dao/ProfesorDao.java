package co.edu.utp.misiontic2022.c2.cdiaz.model.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import co.edu.utp.misiontic2022.c2.cdiaz.model.entity.Profesor;

public class ProfesorDao {
    private EntityManagerFactory emf = null;

    public ProfesorDao() {
        emf = Persistence.createEntityManagerFactory("estudiantes-pu");
    }

    public void guardar(Profesor profesor) {
        var em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(profesor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
        em.close();
    }
}
