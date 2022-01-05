package com.jhanortegon.poo.interfaces.imprenta.modelo;

import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

    private String persona;
    private String profesion;
    private List<String> experiencias;

    public Curriculum(String contenido, String persona, String profesion, List experiencias) {
        super(contenido);
        this.persona = persona;
        this.profesion = profesion;
        this.experiencias = experiencias;
    }

    @Override
    public String imprimir() {
        String curriculum = "";
        curriculum += "******** mi curriculon *********\n";
        curriculum += "mi nombre es: " + this.persona + "\n";
        curriculum += "mi profesion es: " + this.profesion + "\n";
        curriculum += "mi experiencia es la siguiente: \n";
        int i = 1;
        for(String e : this.experiencias){
            curriculum += i + "- " + e + "\n";
            i++;
        }
        curriculum += "contenido: " + this.getContenido();
        return curriculum;
    }
}
