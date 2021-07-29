package co.edu.utp.misiontic2022.c2.cdiaz.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Nota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Estudiante estudiante;
    @ManyToOne
    private Materia materia;

    @Column(nullable = false, length = 100)
    private String nombre;
    @Column(nullable = false)
    private Double valor;

    public Nota() {
        // Obligado por JPA
    }

    public Nota(Estudiante estudiante, Materia materia, String nombre, Double valor) {
        this.estudiante = estudiante;
        this.materia = materia;
        this.nombre = nombre;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


}
