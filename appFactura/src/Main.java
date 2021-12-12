import com.jhanOrtegon.appFactura.modelo.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jhan Carlos Ortegon",1045746673);
        Producto producto1 = new Producto("perro caliente","comida rapida", 3.500);
        Producto producto2 = new Producto("Gaseosa","Bebida fria", 4.500);
        ItemFactura item1 = new ItemFactura(2,producto1);
        ItemFactura item2 = new ItemFactura(1,producto2);
        Factura factura1 = new Factura(cliente1);
        factura1.addItem(item1);
        factura1.addItem(item2);
        System.out.println(factura1.verDetalle());

        System.out.println("*****************************************");
        Cliente cliente2 = new Cliente("Jhan Carlos Ortegon",1045746673);
        Producto producto3 = new Producto("perro caliente","comida rapida", 3.500);
        Producto producto4 = new Producto("Gaseosa","Bebida fria", 5.000);
        ItemFactura item3 = new ItemFactura(2,producto3);
        ItemFactura item4 = new ItemFactura(12,producto4);
        Factura factura2 = new Factura(cliente2);
        factura2.addItem(item3);
        factura2.addItem(item4);
        System.out.println(factura2.verDetalle());
    }
}
