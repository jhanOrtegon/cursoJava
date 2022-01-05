package com.jhanortegon.app.repository;

import com.jhanortegon.app.model.Cliente;

import java.util.List;

public interface OrdenableRepository {
    List<Cliente> listar(String campo, Direccion direccion);
}
