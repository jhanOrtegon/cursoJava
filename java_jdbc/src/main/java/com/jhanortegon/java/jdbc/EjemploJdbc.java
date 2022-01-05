package com.jhanortegon.java.jdbc;

import com.jhanortegon.java.jdbc.util.ConexionBd;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {


        try (Connection conn = ConexionBd.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet result = stmt.executeQuery("select * from productos")) {
            while(result.next()){
                System.out.println("id:" + result.getInt("id"));
                System.out.println("nombre:" + result.getString("nombre"));
                System.out.println("Precio:" + result.getDouble("precio"));
                System.out.println("fecha Registro:" + result.getTimestamp("fechaReg"));
                System.out.println("***********************************");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
