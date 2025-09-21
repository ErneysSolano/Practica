package com.esolano.list;

public enum enmMedioDePago {

    MP1("Efectivo"),
    MP2("Tarjeta"),
    MP3("Tranferencia Nequi"),
    MP4("Tranferencia X tranfiya");

    private final String medioPago;

    enmMedioDePago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getMedioPago() {
        return medioPago;
    }


}
