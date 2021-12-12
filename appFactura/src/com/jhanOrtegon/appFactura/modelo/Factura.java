package com.jhanOrtegon.appFactura.modelo;

import java.util.Date;

public class Factura {
    private int id;
    private static int idContador;
    Cliente cliente;
    Date fecha;
    ItemFactura[] items;
    private final int MAX_ITEMS = 10;
    private static int contadorItems;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.fecha = new Date();
        this.id = ++Factura.idContador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItem(ItemFactura item){
        if(this.items.length >10){
            System.out.println("hay muchos Items en la factura, la cantidad maxima es 10");
        }
        this.items[contadorItems++] = item;
    }

    public double getvalorTotal(){
        double valorTotal = 0;
        for(ItemFactura producto :  this.items){
            if(producto == null){continue;}
            valorTotal+= producto.valorItem();
        }
        return  valorTotal;
    }

    public String verDetalle(){
        String plantilla =
            "************* TU TIENDA EN CASA *************\n" +
             "Factura ID: " + Factura.idContador + "\n" +
            "- Informacion del Cliente: " +
                    "Nombre: " + cliente.getNombre() + "\n" +
                    "Cedula: " + cliente.getId() + "\n \n" +
            cliente.getNombre() +" ,aqui Tu compra:" + "\n";
            int i = 0;
            for(ItemFactura producto: this.items){

                if(producto == null){continue;}
                plantilla +=
                       "Producto " + (++i) + ": " + producto.getProducto().getNombre() + "\n" +
                       "Cantidad: " + producto.getCantidad() + "\n" +
                       "valor: " +  producto.valorItem() + "\n";
            }

            plantilla += "\nTOTAL : " +  getvalorTotal();

            return plantilla;
    }
}
