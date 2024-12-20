package com.tienda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.entity.Categoria;
import com.tienda.repository.CategoriasRepository;

@Service
public class CategoriasServices implements InCategoriaService {
	@Autowired
	private CategoriasRepository repoCategorias;
	
	@Override
	public List<Categoria> obtenerCategoria() {
		return repoCategorias.findAll();
	}

	@Override
	public void guardar(Categoria categoria) {
		repoCategorias.save(categoria);
	}

	@Override
	public void eliminar(Integer idCategoria) {
		repoCategorias.deleteById(idCategoria);
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		Categoria categoria = null;
		Optional<Categoria> optional = repoCategorias.findById(idCategoria);
		if(optional.isPresent()){
			categoria = optional.get();
		}
		return categoria;
	}

	@Override
	public int totalCategorias() {
		return (int) repoCategorias.count();
	}

}
