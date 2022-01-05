package com.jhanortegon.poo.interfaces.imprenta.modelo;

public class Paginas extends Hoja implements Imprimible{

    public Paginas(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return null;
    }
}
