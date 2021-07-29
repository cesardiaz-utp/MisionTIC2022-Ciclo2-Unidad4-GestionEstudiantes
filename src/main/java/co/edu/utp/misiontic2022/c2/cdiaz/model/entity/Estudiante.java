package co.edu.utp.misiontic2022.c2.cdiaz.model.entity;

import java.util.List;

public class Estudiante extends Persona {
    private String codigo;

    private List<Materia> materias;
    private List<Nota> notas;

    public Estudiante(Long identificacion, String nombre, String codigo) {
        super(identificacion, nombre);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public List<Nota> getNotas() {
        return notas;
    }
}
