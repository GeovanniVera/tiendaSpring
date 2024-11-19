package com.tienda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.entity.Categorias;
import com.tienda.repository.CategoriasRepository;

@Service
public class CategoriasServices implements InCategoriaService {
	@Autowired
	private CategoriasRepository repoCategorias;
	
	@Override
	public List<Categorias> obtenerCategoria() {
		// TODO Auto-generated method stub
		return repoCategorias.findAll();
	}

	@Override
	public void guardar(Categorias Categorias) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer idCategoria) {
		// TODO Auto-generated method stub

	}

	@Override
	public Categorias buscarPorId(Integer idCategoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int totalCategorias() {
		return (int) repoCategorias.count();
	}

}
