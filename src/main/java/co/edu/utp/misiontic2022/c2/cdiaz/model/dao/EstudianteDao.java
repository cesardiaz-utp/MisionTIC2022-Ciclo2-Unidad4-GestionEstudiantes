package co.edu.utp.misiontic2022.c2.cdiaz.model.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import co.edu.utp.misiontic2022.c2.cdiaz.model.entity.Estudiante;

public class EstudianteDao {
    
    private EntityManagerFactory emf = null;

    public EstudianteDao(){
        emf = Persistence.createEntityManagerFactory("estudiantes-pu");
    }

    public void guardar(Estudiante estudiante) {
        var em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(estudiante);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
        em.close();
    }

    public List<Estudiante> listar() {
        var em = emf.createEntityManager();
        var query = em.createQuery("SELECT e FROM Estudiante e", Estudiante.class);
        var lista = query.getResultList();
        em.close();

        return lista;
    }

    public Estudiante consultar(Long id) {
        var em = emf.createEntityManager();
        var estudiante = em.find(Estudiante.class, id);
        em.close();

        return estudiante;
    }

    public void borrar(Long id) {
        var em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            var estudiante = em.find(Estudiante.class, id);
            em.remove(estudiante);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
        em.close();
    }

}
