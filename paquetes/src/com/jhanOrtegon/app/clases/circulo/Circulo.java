package com.jhanOrtegon.app.clases.circulo;

import com.jhanOrtegon.app.clases.figura.Figura;
import com.jhanOrtegon.app.clases.TipoFigura;

public class Circulo extends Figura {
    String nombre;
    TipoFigura tipo;

    public Circulo(int lados,int area,  String nombre, TipoFigura tipo){
        super(lados,area);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    static public void metodoStatico(){
        System.out.println("soy un metodo estatico");
    }
}
