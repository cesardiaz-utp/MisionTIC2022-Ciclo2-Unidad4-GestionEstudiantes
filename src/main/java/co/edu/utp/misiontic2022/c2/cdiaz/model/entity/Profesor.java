package co.edu.utp.misiontic2022.c2.cdiaz.model.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("P")
public class Profesor extends Persona {
    private String titulo;

    @ManyToMany
    @JoinTable(name = "Profesor_Materia", 
            joinColumns = @JoinColumn(name = "profesor_id"), 
            inverseJoinColumns = @JoinColumn(name = "materia_id"))
    private List<Materia> materias;

    public Profesor(){
        // POR JPA
    }

    public Profesor(Long identificacion, String nombre, String titulo) {
        super(identificacion, nombre);
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
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
