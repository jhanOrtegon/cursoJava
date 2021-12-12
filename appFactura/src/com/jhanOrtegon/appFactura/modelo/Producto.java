package com.jhanOrtegon.appFactura.modelo;

public class Producto {
    private int id;
    private String nombre;
    private String categoria;
    private double precio;
    private String descripcion;
    private static int contador;


    public Producto(String nombre, String categoria, double precio) {
        this.id = ++Producto.contador;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public Producto(String nombre, String categoria, double precio, String descripcion) {
        this.id = ++Producto.contador;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
