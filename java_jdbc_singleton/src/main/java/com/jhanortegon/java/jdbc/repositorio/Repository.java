package com.jhanortegon.java.jdbc.repositorio;

import com.jhanortegon.java.jdbc.modelo.Producto;

import java.util.List;

public interface Repository <T>{
    List<T> listar();
    T porId(Integer id);
    void actualizar(Producto t);
    void eliminar(Integer id);
}
