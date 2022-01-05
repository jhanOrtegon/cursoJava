package com.jhanortegon.app.repository;

import com.jhanortegon.app.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepository implements CrudRepository{

    private List<Cliente> dataSource;

    public ClienteListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente listarPorId(Integer id) {
        Cliente x = null;
        for(Cliente cliente : this.dataSource){
            if(cliente.getId().equals(id)){
                x = cliente;
                break;
            }
        }
        return x;
    }

    @Override
    public void actualizar(Cliente cliente) {
        Cliente x = listarPorId(cliente.getId());
        x.setNombre(cliente.getNombre());
        x.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente cliente = listarPorId(id);
        this.dataSource.remove(cliente);
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }


}
