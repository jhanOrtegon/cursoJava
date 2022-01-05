package com.jhanortegon.java.jdbc.repositorio;

import java.util.List;

public interface Repository <T>{
    List<T> listar();
    T porId(Long id);
    void actualizar(T t);
    void eliminar(Long id);
}
