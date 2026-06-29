package com.mycompany.poojava;

public class Sistema {
    private Interface dispositivo;

    public Sistema(Interface dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void imprimirDocumento() {
        dispositivo.imprimir();
    }

}