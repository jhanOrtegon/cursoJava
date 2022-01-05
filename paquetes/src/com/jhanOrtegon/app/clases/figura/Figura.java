package com.jhanOrtegon.app.clases.figura;

public class Figura {
    int lados;
    int area;

    public Figura(int lados, int area){
        this.lados = lados;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "lados=" + lados +
                ", area=" + area +
                '}';
    }
}
