package com.jhanortegon.java.jdbc.repositorio;

import com.jhanortegon.java.jdbc.modelo.Categoria;
import com.jhanortegon.java.jdbc.modelo.Producto;
import com.jhanortegon.java.jdbc.util.ConexionBd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositoryImplements implements Repository{

    private Connection getConectarBd() throws SQLException {
        return ConexionBd.getConnection();
    }

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();
        try(Statement stm = getConectarBd().createStatement();
            ResultSet rs = stm.executeQuery("SELECT p.*, c.nombre as categoriaName FROM productos p inner join categorias c on (c.id = p.categoria_id)")
        ) {
            while(rs.next()){
                Producto producto = new Producto();
                Categoria  categoria = new Categoria();
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setFechaReg(rs.getDate("fechaReg"));
                categoria.setNombre(rs.getString("categoriaName"));
                producto.setCategoria(categoria);
                productos.add(producto);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return productos;
    }

    @Override
    public Object porId(Integer id) {
        Producto producto = new Producto();
        Categoria categoria = new Categoria();
        try(PreparedStatement stmt = getConectarBd().prepareStatement("SELECT p.*, c.nombre as catNombre FROM productos p inner join categorias c on (c.id = p.categoria_id) WHERE p.id = ?")
        ) {
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setFechaReg(rs.getDate("fechaReg"));
                categoria.setNombre(rs.getString("catNombre"));
                producto.setCategoria(categoria);
            }
            rs.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return producto;
    }

    @Override
    public void actualizar(Producto producto) {
        String sql;
        if(producto.getId() != null && producto.getId() > 0){
             sql = "update productos set nombre = ? , precio = ? where id = ?";
        }else{
             sql = "insert into productos(nombre,precio, categoria_id) values (?,?,?) ";
        }

        try(PreparedStatement stmt = getConectarBd().prepareStatement(sql);){
            stmt.setString(1, producto.getNombre());
            stmt.setDouble(2, producto.getPrecio());
            if(producto.getId() != null && producto.getId() > 0){
                stmt.setInt(3, producto.getId());
            }else{
                stmt.setInt(3, producto.getCategoria().getId());

            }
            stmt.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void eliminar(Integer id) {
        String sql = "delete from productos where id = ?";
    try(PreparedStatement stmt = getConectarBd().prepareStatement(sql);) {
        stmt.setInt(1, id);
        stmt.executeUpdate();
    } catch (SQLException exception) {
        exception.printStackTrace();
    }
    }
}
