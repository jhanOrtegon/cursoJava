package com.jhanortegon.poo.clasesabstractas.form.elementos;

abstract public class ElementoForm {
    private String valor;
    protected String nombre;

    public ElementoForm(){
    }

    public ElementoForm(String nombre){
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    abstract public String dibujarHtml();

}
