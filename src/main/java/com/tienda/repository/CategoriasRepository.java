package com.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.entity.Categorias;


public interface CategoriasRepository extends JpaRepository<Categorias, Integer> {
	
}
