package co.edu.utp.misiontic2022.c2.cdiaz;

import co.edu.utp.misiontic2022.c2.cdiaz.controller.UniversidadController;
import co.edu.utp.misiontic2022.c2.cdiaz.model.entity.Estudiante;
import co.edu.utp.misiontic2022.c2.cdiaz.model.entity.Jornada;
import co.edu.utp.misiontic2022.c2.cdiaz.model.entity.Materia;
import co.edu.utp.misiontic2022.c2.cdiaz.model.entity.Profesor;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        var controller = new UniversidadController();
        //System.out.println(controller.consultarEstudiante(123459L));
        controller.eliminarEstudiante(123459L);
        controller.listarEstudiantes().forEach(e -> System.out.println(e));
        
    }

    private static void cargarInformacionInicial() {
        var controller = new UniversidadController();

        var p1 = new Profesor(10030619L, "Cesar Augusto Diaz", "Ingeniero");
        controller.guardarProfesor(p1);

        var e1 = new Estudiante(123456L, "Adriana Castellanos", "ac123456");
        var e2 = new Estudiante(123457L, "Alejandro Jimenez", "aj123457");
        var e3 = new Estudiante(123458L, "Carlos Guerrero", "cg123458");
        var e4 = new Estudiante(123459L, "Diana Garzon", "dg123459");
        controller.guardarEstudiante(e1);
        controller.guardarEstudiante(e2);
        controller.guardarEstudiante(e3);
        controller.guardarEstudiante(e4);

        var m1 = new Materia("c001", "Python");
        var m2 = new Materia("c002", "Java");
        controller.guardarMateria(m1);
        controller.guardarMateria(m2);
    }
}
