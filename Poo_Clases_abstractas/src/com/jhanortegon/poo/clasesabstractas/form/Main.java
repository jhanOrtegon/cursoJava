package com.jhanortegon.poo.clasesabstractas.form;

import com.jhanortegon.poo.clasesabstractas.form.elementos.InputForm;
import com.jhanortegon.poo.clasesabstractas.form.elementos.SelectForm;
import com.jhanortegon.poo.clasesabstractas.form.elementos.select.Opciones;

public class Main {

    public static void main(String[] args) {

        InputForm userName = new InputForm("JhanKee");
        InputForm password = new InputForm("passwork mia","password");
        userName.setValor("soy el valor");
        password.setValor("soy la clave");


        SelectForm lenguaje = new SelectForm("lenguaje");
        Opciones op = new Opciones("0","c++");
        lenguaje.addOpciones(new Opciones("1","php"));
        lenguaje.addOpciones(new Opciones("2","js"));
        lenguaje.addOpciones(new Opciones("3","python"));
        lenguaje.addOpciones(new Opciones("4","java"));
        op.setSelect(true);
        lenguaje.addOpciones(op);
        System.out.println(lenguaje.dibujarHtml());
    }

}
