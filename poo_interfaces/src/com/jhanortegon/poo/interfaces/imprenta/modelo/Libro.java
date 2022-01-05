package com.jhanortegon.poo.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {
    private List<Hoja> paginas;
    private String autor;
    private Genero genero;
    private int nHojas;

    public Libro(String autor, Genero genero, int nHojas) {
        this.autor = autor;
        this.genero = genero;
        this.nHojas = nHojas;
        this.paginas = new ArrayList<Hoja>();
    }

    public Libro addContenidoPaginas(Hoja pagina){
        this.paginas.add(pagina);
        return this;
    }

    public String imprimir(){
        String libro ="";
        libro += "*********** hola soy el libro *************\n";
        libro += "autor: " + this.autor + "\n";
        libro += "genero: " + this.genero + "\n";
        libro += "numero de hojas: " + this.nHojas + "\n";
        int pagina = 0;
        for(Hoja pg : this.paginas){
            libro += "pagina " + pagina + "\n";
            libro += "contenido : " + pg.getContenido() + "\n";
            libro += "**********************************\n";
            pagina++;
        };
        return libro;
    }
}
