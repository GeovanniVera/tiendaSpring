package com.tienda.services;

import java.util.List;

import com.tienda.entity.Categorias;

public interface InCategoriaService {
    //Definir las operaciones del crud
    public List<Categorias> obtenerCategoria();
    public void guardar(Categorias Categorias);
    public void eliminar(Integer idCategoria);
    public Categorias buscarPorId(Integer idCategoria);
    public int totalCategorias();
}
