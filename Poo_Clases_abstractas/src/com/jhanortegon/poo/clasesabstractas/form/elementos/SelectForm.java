package com.jhanortegon.poo.clasesabstractas.form.elementos;

import com.jhanortegon.poo.clasesabstractas.form.elementos.select.Opciones;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    private List<Opciones> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opciones>();
    }

    @Override
    public String dibujarHtml() {
        String html="";
        html += "<select name=\""+this.nombre+"\">\n";
        for(Opciones opcion : this.opciones ){
            if(opcion.isSelect()) {
                html += "\t<option value="+opcion.getValor()+" selected>"+opcion.getNombre()+"</option>\n";
            }else{
                html += "\t<option value="+opcion.getValor()+">"+opcion.getNombre()+"</option>\n";
            }
        };
        html += "</select> ";
        return html;
    }

    public void addOpciones(Opciones opciones){
        this.opciones.add(opciones);
    }
}
