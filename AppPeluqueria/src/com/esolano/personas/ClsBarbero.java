package com.esolano.personas;

public class ClsBarbero {
    private String nombre;
    private String apellido;
    private String telefono;
    private String tipoSangre;
    private Integer turnos[][];
    private String estado;

    public ClsBarbero() {
    }

    public ClsBarbero(String nombre, String estado, Integer[][] turnos, String tipoSangre, String telefono, String apellido) {
        this.nombre = nombre;
        this.estado = estado;
        this.turnos = turnos;
        this.tipoSangre = tipoSangre;
        this.telefono = telefono;
        this.apellido = apellido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer[][] getTurnos() {
        return turnos;
    }

    public void setTurnos(Integer[][] turnos) {
        this.turnos = turnos;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
