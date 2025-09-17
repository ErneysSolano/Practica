package com.esolano.personas;

import com.esolano.list.enmEstado;

import javax.swing.*;
import java.util.LinkedHashMap;

public class ClsBarbero {
    private String nombre;
    private String apellido;
    private String telefono;
    private String tipoSangre;
    private enmEstado estado;

    public ClsBarbero(String nombre, String apellido, String telefono, String tipoSangre,  enmEstado estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tipoSangre = tipoSangre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public enmEstado getEstado() {
        return estado;
    }

    public void setEstado(enmEstado estado) {
        this.estado = estado;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString(){
        return nombre + " " + apellido + " " + telefono + " " +
                tipoSangre + "" + estado.getEstado();
    }

}
