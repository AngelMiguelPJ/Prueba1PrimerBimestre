package com.example.prueba1;

public class Activities {

    private String actividad;
    private String estado;

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString(){
        return actividad + estado;
    }
}
