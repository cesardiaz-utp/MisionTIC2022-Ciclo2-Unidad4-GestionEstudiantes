package co.edu.utp.misiontic2022.c2.cdiaz.model.entity;

import java.util.List;

public class Profesor extends Persona {
    private String titulo;

    private List<Materia> materias;

    public Profesor(Long identificacion, String nombre, String titulo) {
        super(identificacion, nombre);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    
}
