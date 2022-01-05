package com.jhanortegon.poo.interfaces.imprenta;

import com.jhanortegon.poo.interfaces.imprenta.modelo.*;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {

        Curriculum curriculum = new Curriculum("este es el contenido del curriculum","valentina","estudiante",Arrays.asList("red 5g","crediAs"));
        Informe informe = new Informe("contenido del informe","walter david","naruto");
        Libro libro = new Libro("jhankee",Genero.CIENCIA_FICCION,3);
        libro.addContenidoPaginas(new Paginas("contenido x , 1")).
                addContenidoPaginas(new Paginas("contenido x, 2")).
                addContenidoPaginas(new Paginas("continido adicional "));

        imprimir(libro);
        imprimir(curriculum);
        imprimir(informe);
    }

    public static void imprimir (Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
