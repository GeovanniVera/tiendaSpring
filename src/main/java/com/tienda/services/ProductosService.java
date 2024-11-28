package com.tienda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.entity.Producto;
import com.tienda.repository.ProductosRepository;

@Service
public class ProductosService implements InProductosService{
    @Autowired 
    ProductosRepository repoProductos;

    @Override
    public List<Producto> obtenerProductos() {
        return repoProductos.findAll();
    }

    @Override
    public void eliminarProducto(Integer idProducto) {
        repoProductos.deleteById(idProducto);
    }

    @Override
    public void guardarProducto(Producto Producto) {
        repoProductos.save(Producto);
    }

    @Override
    public Producto buscarPorId(Integer idProducto) {
        Producto producto = null;
        Optional<Producto> optional = repoProductos.findById(idProducto);
        if(optional.isPresent()){
            producto =  optional.get();
        }
        return producto;
    }

    @Override
    public int totalProductos() {
        return (int) repoProductos.count();
    }

}
