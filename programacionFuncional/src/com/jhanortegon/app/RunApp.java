package com.jhanortegon.app;

import com.jhanortegon.app.modelo.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunApp {

    public static void imprimir(Usuario... usuario){
        Stream.of(usuario).forEach(e ->{
            System.out.println(e.getId());
            System.out.println(e.getUser());
            System.out.println(e.getPass());
            System.out.println("**************");
        });



    }

    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("jhan","carlos","valentina").map(String::toUpperCase);
        //nombres.forEach(System.out::println);
        List<String> listNombres = nombres.collect(Collectors.toList());
        //for(String x : listNombres){
         //   System.out.println(x.toLowerCase());
        //}
        //System.out.println("**********");
        //RunApp.imprimir(new Usuario("jhan","123"),new Usuario("jhan","123"),new Usuario("jhan","123"));

        List<Usuario> listaUsuarios = List.of(new Usuario("jhan", "123"),new Usuario("jhanka", "0456"));

        Stream<Usuario> z = listaUsuarios.stream().filter(e->e.getId() == 1);
        listaUsuarios = z.collect(Collectors.toList());
        System.out.println(listaUsuarios);





    }

}
