package co.edu.utp.misiontic2022.c2.cdiaz.model.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import co.edu.utp.misiontic2022.c2.cdiaz.model.entity.Materia;

public class MateriaDao {
    private EntityManagerFactory emf = null;

    public MateriaDao(){
        emf = Persistence.createEntityManagerFactory("estudiantes-pu");
    }

    public void guardar(Materia materia) {
        var em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(materia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
        em.close();
    }
}
