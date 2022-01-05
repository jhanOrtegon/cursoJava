package com.jhanortegon.app.clases;

import com.jhanortegon.app.optionselect.Options;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementForm{

    List<Options> optiones;

    public SelectForm(String nombre) {
        super(nombre);
        this.optiones = new ArrayList<Options>();
    }

    public SelectForm addOptions(Options option){
        this.optiones.add(option);
        return this;
    }

    @Override
    public String dibujarElemento() {
        String select = "<select name= \""+this.getNombre()+"\">\n";
        for(Options option : this.optiones ){
            select +="<option value=\""+option.getValue()+"\" >"+option.getName()+"</option>\n";
        }
        select += "</select>";
        return select;
    }
}
