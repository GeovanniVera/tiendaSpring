package com.tienda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/categorias")
@Controller
public class CategoriasController {
	@GetMapping("/index")
	public String mostrarLista() {
		return "categorias/listaCategorias";
	}
	
	@GetMapping("/nuevaCategoria")
	public String agregarCategoria() {
		return "categorias/formCategorias";
	}
}
