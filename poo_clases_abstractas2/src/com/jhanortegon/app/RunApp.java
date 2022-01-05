package com.jhanortegon.app;

import com.jhanortegon.app.clases.*;
import com.jhanortegon.app.optionselect.Options;

import java.util.Arrays;
import java.util.List;

public class RunApp {

    public static void main(String[] args) {
        LabelForm labelUsername = new LabelForm("labelUsername","Digita tu nombre:");
        InputForm username = new InputForm("name","text");
        LabelForm labelPassword = new LabelForm("labelPassword","Digita tu password:");
        InputForm password = new InputForm("pass","password");
        LabelForm labelEmail= new LabelForm("labelEmail","Digita tu Email:");
        InputForm email = new InputForm("email","email");
        TextareaForm textarea = new TextareaForm("textarea1","aqui va el texto en el textarea , esto es un ejemplo",10,10);
        SelectForm lenguajes = new SelectForm("lenguajes2021");
        lenguajes.addOptions(new Options("javaScript","0"))
                .addOptions(new Options("java","1"));
        username.setValor("jhankee 2021");
        password.setValor("123456");
        email.setValor("jhan@gmail.com");
        ElementForm elementoForm = new ElementForm("elemento") {
            @Override
            public String dibujarElemento() {
                return "soy un elemento";
            };
        };

        List<ElementForm> elementos = Arrays.asList(labelUsername,username,labelPassword , password,labelEmail,email,textarea,lenguajes,elementoForm);
        elementos.forEach(e -> {
            System.out.println(e.dibujarElemento());;
        });
    }
}
