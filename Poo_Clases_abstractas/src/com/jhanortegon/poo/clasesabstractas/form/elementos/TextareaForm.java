package com.jhanortegon.poo.clasesabstractas.form.elementos;

public class TextareaForm extends ElementoForm {
    private int columnas;
    private int filas;

    public TextareaForm(String nombre, int columnas, int filas) {
        super(nombre);
        this.columnas = columnas;
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    @Override
    public String dibujarHtml() {
        return "<textarea name= \" " + this.nombre + "  \" cols = \" "+ this.columnas +" \"  rows = \" "+this.filas+" \"> </textarea> ";
    }
}
