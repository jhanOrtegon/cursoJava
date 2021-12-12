package com.jhanOrtegon.appFactura.modelo;

public class ItemFactura {
    private int id;
    private int cantidad;
    Producto producto;
    private static int contador;

    public ItemFactura(int cantidad, Producto producto) {
        this.id = ++ItemFactura.contador;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        ItemFactura.contador = contador;
    }

    public double valorItem(){
        return (this.cantidad * this.producto.getPrecio());
    }
}
