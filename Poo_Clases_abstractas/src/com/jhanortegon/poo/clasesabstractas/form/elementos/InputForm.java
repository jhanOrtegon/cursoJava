package com.jhanortegon.poo.clasesabstractas.form.elementos;

public class InputForm extends ElementoForm{
    private String typo = "text";

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String typo) {
        super(nombre);
        this.typo = typo;
    }

    public void setTypo(String typo) {
        this.typo = typo;
    }

    @Override
    public String dibujarHtml() {
        return "<input  name= \" " + this.nombre + " \"  type=\" " + this.typo + " \" value = \" "+ this.getValor() +" \">";
    }
}
