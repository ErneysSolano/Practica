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

    @Override
    public String toString(){
        return nombre + " " + apellido + " " + telefono + " " +
                tipoSangre + "" + estado.getEstado();
    }

}
