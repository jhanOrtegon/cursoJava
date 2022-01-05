package com.jhanortegon.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBd {

    private static String  usuario = "root";
    private static String password = "1234";
    private static String url = "jdbc:mysql://localhost:3306/db_java?serverTimezone=America/Bogota";
    private static Connection connect;

    public static Connection getConnection() throws SQLException {
        if (ConexionBd.connect == null){
            connect = DriverManager.getConnection(url,usuario,password);
        }
        return connect;
    }

}
