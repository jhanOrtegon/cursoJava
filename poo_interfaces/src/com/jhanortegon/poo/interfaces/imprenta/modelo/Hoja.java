package com.jhanortegon.poo.interfaces.imprenta.modelo;

abstract public class Hoja {
    private String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    abstract public String imprimir();
}
