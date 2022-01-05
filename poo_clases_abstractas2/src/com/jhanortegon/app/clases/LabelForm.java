package com.jhanortegon.app.clases;

public class LabelForm extends ElementForm{

    public LabelForm(String nombre, String valor) {
        super(nombre, valor);
    }

    @Override
    public String dibujarElemento() {
        return "<label name=\""+this.getNombre()+"\">" + this.getValor() + "</label>";
    }
}
