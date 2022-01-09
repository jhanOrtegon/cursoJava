package com.jhanortegon.java.jdbc;

import com.jhanortegon.java.jdbc.modelo.Categoria;
import com.jhanortegon.java.jdbc.modelo.Producto;
import com.jhanortegon.java.jdbc.repositorio.ProductoRepositoryImplements;
import com.jhanortegon.java.jdbc.repositorio.Repository;
import com.jhanortegon.java.jdbc.util.ConexionBd;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {
        try (Connection conn = ConexionBd.getConnection()){
            Repository<Producto> repositorio = new ProductoRepositoryImplements();
            System.out.println("xxxx");
            repositorio.listar().forEach(e ->{
                System.out.println("ID = " + e.getId());
                System.out.println("NOMBRE = " +e.getNombre());
                System.out.println("PRECIO = " +e.getPrecio());
                System.out.println("FECHAREG = " + e.getFechaReg());
                System.out.println("CATEGORIA = " + e.getCategoria().getNombre());
                System.out.println("==================================");
            });
            Producto pro = repositorio.porId(10);
            System.out.println(pro);
            repositorio.eliminar(9);

            System.out.println("zzzz");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
