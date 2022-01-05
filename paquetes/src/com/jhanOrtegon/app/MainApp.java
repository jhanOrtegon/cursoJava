package com.jhanOrtegon.app;

import com.jhanOrtegon.app.clases.TipoFigura;
import com.jhanOrtegon.app.clases.circulo.Circulo;

public class MainApp {

    public static void main(String[] args){
        Circulo c = new Circulo(0, 20, "circulo", TipoFigura.CIRCULO);
        System.out.println(c);
        Circulo.metodoStatico();
    }

}
