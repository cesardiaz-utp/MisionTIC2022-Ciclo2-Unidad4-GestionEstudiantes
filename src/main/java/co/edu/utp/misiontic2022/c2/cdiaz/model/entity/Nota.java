package co.edu.utp.misiontic2022.c2.cdiaz.model.entity;

public class Nota {
    private Estudiante estudiante;
    private Materia materia;
    private String nombre;
    private Double valor;

    public Nota(Estudiante estudiante, Materia materia, String nombre, Double valor) {
        this.estudiante = estudiante;
        this.materia = materia;
        this.nombre = nombre;
        this.valor = valor;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
