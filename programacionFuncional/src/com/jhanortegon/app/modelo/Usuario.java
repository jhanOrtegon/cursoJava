package com.jhanortegon.app.modelo;

public class Usuario {
    private final int id;
    private static int ultimoId;
    private String user;
    private String pass;

    public Usuario(String user, String pass) {
        this.id = ++Usuario.ultimoId;
        this.user = user;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
