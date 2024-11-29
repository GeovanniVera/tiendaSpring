package com.tienda.services;

import java.util.List;

import com.tienda.entity.Categoria;

public interface InCategoriaService {
    //Definir las operaciones del crud
    public List<Categoria> obtenerCategoria();
    public void guardar(Categoria Categorias);
    public void eliminar(Integer idCategoria);
    public Categoria buscarPorId(Integer idCategoria);
    public int totalCategorias();
}
