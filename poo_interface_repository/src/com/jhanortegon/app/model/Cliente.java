package com.jhanortegon.app.model;

public class Cliente {
    private Integer id;
    private String nombre;
    private String apellido;
    private static int idIncrement;

    public Cliente(String nombre, String apellido) {
        this.id = ++idIncrement;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido ;
    }
}
