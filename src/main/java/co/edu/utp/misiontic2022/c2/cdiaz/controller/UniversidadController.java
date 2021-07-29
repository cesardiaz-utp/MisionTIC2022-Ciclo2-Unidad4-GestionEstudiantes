package co.edu.utp.misiontic2022.c2.cdiaz.controller;

import java.util.List;

import co.edu.utp.misiontic2022.c2.cdiaz.model.dao.EstudianteDao;
import co.edu.utp.misiontic2022.c2.cdiaz.model.dao.MateriaDao;
import co.edu.utp.misiontic2022.c2.cdiaz.model.dao.ProfesorDao;
import co.edu.utp.misiontic2022.c2.cdiaz.model.entity.Estudiante;
import co.edu.utp.misiontic2022.c2.cdiaz.model.entity.Materia;
import co.edu.utp.misiontic2022.c2.cdiaz.model.entity.Profesor;

public class UniversidadController {
    private ProfesorDao profesorDao;
    private EstudianteDao estudianteDao;
    private MateriaDao materiaDao;

    public UniversidadController() {
        profesorDao = new ProfesorDao();
        estudianteDao = new EstudianteDao();
        materiaDao = new MateriaDao();
    }

    public void guardarProfesor(Profesor profesor) {
        profesorDao.guardar(profesor);
    }

    public void guardarEstudiante(Estudiante estudiante) {
        estudianteDao.guardar(estudiante);
    }

    public List<Estudiante> listarEstudiantes(){
        return estudianteDao.listar();
    }

    public Estudiante consultarEstudiante(Long id){
        return estudianteDao.consultar(id);
    }

    public void eliminarEstudiante(Long id){
        estudianteDao.borrar(id);
    }

    public void guardarMateria(Materia materia) {
        materiaDao.guardar(materia);
    }

}
