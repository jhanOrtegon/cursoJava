package com.jhanortegon.poo.clasesabstractas.form.elementos.select;

public class Opciones {
    private String valor;
    private String nombre;
    private boolean isSelect;

    public Opciones(String valor) {
        this.valor = valor;
    }

    public Opciones(boolean isSelect) {
        this.isSelect = isSelect;
    }

    public Opciones(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public Opciones(String valor, String nombre, boolean isSelect) {
        this.valor = valor;
        this.nombre = nombre;
        this.isSelect = isSelect;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }
}
