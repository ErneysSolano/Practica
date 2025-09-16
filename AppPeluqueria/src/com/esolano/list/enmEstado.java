package com.esolano.list;

public enum enmEstado {
    Disponible("No tiene turno"),
    Ocupado("Ya cuenta con turno asignado"),
    Ausente("Descansando");

     private final String estado;

    enmEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
