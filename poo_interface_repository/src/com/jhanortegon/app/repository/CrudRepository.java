package com.jhanortegon.app.repository;

import com.jhanortegon.app.model.Cliente;

import java.util.List;

public interface CrudRepository {
    List<Cliente> listar();
    Cliente listarPorId(Integer id);
    void actualizar(Cliente cliente);
    void eliminar(Integer id);
    void crear(Cliente cliente);
}
