package com.jhanortegon.app.clases;

abstract public class ElementForm {

    private String nombre;
    private String valor;

    public ElementForm(String nombre) {
        this.nombre = nombre;
    }

    public ElementForm(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String dibujarElemento();

}
