package com.tienda.services;

import java.util.List;

import com.tienda.entity.Producto;

public interface InProductosService {
    public List<Producto> obtenerProductos();
    public void eliminarProducto(Integer idProducto);
    public void guardarProducto(Producto Producto);
    public Producto buscarPorId(Integer idProducto);
    public int totalProductos();
}
