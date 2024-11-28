package com.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.entity.Producto;

@Repository
public interface ProductosRepository extends JpaRepository<Producto,Integer>{

}
