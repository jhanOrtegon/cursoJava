package com.jhanortegon.app.genericos;


import com.jhanortegon.app.model.Cliente;

public class ClientePremiun extends Cliente {

    public ClientePremiun(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public String toString() {
        return "ClientePremiun{}"+  super.getNombre();
    }
}
