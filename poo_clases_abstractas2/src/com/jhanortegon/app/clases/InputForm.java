package com.jhanortegon.app.clases;

public class InputForm extends ElementForm {

    private String typo;
    private boolean estado = true;

    public InputForm(String nombre, String typo) {
        super(nombre);
        this.typo = typo;
    }

    public InputForm(String nombre, String valor, String typo) {
        super(nombre, valor);
        this.typo = typo;
    }

    public InputForm(String nombre, String typo, boolean estado) {
        super(nombre);
        this.typo = typo;
        this.estado = estado;
    }

    public InputForm(String nombre, String valor, String typo, boolean estado) {
        super(nombre, valor);
        this.typo = typo;
        this.estado = estado;
    }

    @Override
    public String dibujarElemento() {
        if(this.estado == true){
            return "<input type=\""+this.typo+"\" name=\""+this.getNombre()+"\" value=\""+this.getValor()+"\">";
        }else{
            return "<input type=\""+this.typo+"\" name=\""+this.getNombre()+"\" value=\""+this.getValor()+"\" disabled>";
        }
    }
}
