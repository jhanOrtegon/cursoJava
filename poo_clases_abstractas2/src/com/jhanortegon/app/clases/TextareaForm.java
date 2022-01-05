package com.jhanortegon.app.clases;

public class TextareaForm extends ElementForm{

    private int cols;
    private int rows;

    public TextareaForm(String nombre, String valor, int cols, int rows) {
        super(nombre, valor);
        this.cols = cols;
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String dibujarElemento() {
        return "<textarea cols=\""+this.cols+"\"  rows=\""+this.rows+"\" name=\""+this.getNombre()+"\">" + this.getValor() + "</textarea>";
    }
}
