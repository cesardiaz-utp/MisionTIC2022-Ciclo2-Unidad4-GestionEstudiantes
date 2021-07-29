package co.edu.utp.misiontic2022.c2.cdiaz.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Materia {
    @Id
    private String codigo;
    @Column(nullable = false)
    private String nombre;
    private Integer semestre;
    private String programa;
    private Integer creditos;

    @ManyToMany(mappedBy = "materias")
    private List<Profesor> profesores;

    public Materia() {
        // Para JPA
    }

    public Materia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Materia(String codigo, String nombre, Integer semestre, String programa, Integer creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.programa = programa;
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

}
