package co.edu.utp.misiontic2022.c2.cdiaz.model.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
@DiscriminatorValue("E")
public class Estudiante extends Persona {
    private String codigo;

    @OneToMany
    private List<Materia> materias;

    @OneToMany
    private List<Nota> notas;

    public Estudiante() {
    }

    public Estudiante(Long identificacion, String nombre, String codigo) {
        super(identificacion, nombre);
        this.codigo = codigo;
    }

    public void setCodigo(String codigo) {
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

    @Override
    public String toString() {
        return "Estudiante [identificacion = " + getIdentificacion() + ", nombre = " + getNombre() + ", jornada= "
                + getJornada() + ", codigo=" + codigo + "]";
    }

}
