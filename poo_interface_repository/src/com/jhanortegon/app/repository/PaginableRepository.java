package com.jhanortegon.app.repository;

import com.jhanortegon.app.model.Cliente;

import java.util.List;

public interface PaginableRepository {
    List<Cliente> listar(int desde, int hasta);
}
