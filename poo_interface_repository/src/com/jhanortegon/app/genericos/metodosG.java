package com.jhanortegon.app.genericos;

import com.jhanortegon.app.model.Cliente;

import java.util.Arrays;
import java.util.List;

public class metodosG
{

    public static <T> void imprimirDato(T generico){
        System.out.println("tipo de dato: " + generico.getClass().getSimpleName());
        System.out.println("valor = " + generico);
    }

    public static <T extends Cliente> void imprimirDato(T... generico){
        for(T x : generico){
            System.out.println(x);
        }
    }

    public static <T> List<T> convertitX(T[] datoArray){
        return Arrays.asList(datoArray);
    }

}
