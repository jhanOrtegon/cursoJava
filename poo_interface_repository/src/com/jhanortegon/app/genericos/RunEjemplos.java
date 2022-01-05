package com.jhanortegon.app.genericos;

import com.jhanortegon.app.model.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunEjemplos {

    public static void main(String[] args) {

    metodosG.imprimirDato(new ClientePremiun("jhan","ortegon"),new Cliente("jhan","ortegon"), new Cliente("jhan","ortegon"));
        System.out.println("******************");
        System.out.println(metodosG.convertitX(new String[]{"aaa","bbbb"}));
        List<String> x = Arrays.asList("aaa","bbb");


        System.out.println(x.toString());
    }
}
