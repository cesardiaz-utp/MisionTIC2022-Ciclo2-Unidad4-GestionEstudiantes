package co.edu.utp.misiontic2022.c2.cdiaz.model.entity;

public abstract class Persona {
    private Long identificacion;
    private String nombre;
    private Jornada jornada;

    public Persona(Long identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public Long getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }

    public Jornada getJornada() {
        return jornada;
    }

}
