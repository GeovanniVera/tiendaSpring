package com.tienda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tienda.entity.Categorias;
import com.tienda.services.InCategoriaService;

//import com.tienda.entity.Categorias;

@RequestMapping("/categorias")
@Controller
public class CategoriasController {
	@Autowired
	private InCategoriaService serviceCategoria;
	
	@GetMapping("/")
	public String mostrarLista(Model model) {
		List<Categorias> lista = serviceCategoria.obtenerCategoria();
		int total = serviceCategoria.totalCategorias();
        model.addAttribute("categorias", lista);
		model.addAttribute("totalCategorias", total);
		return "categorias/listaCategorias";
	}
	
	@GetMapping("/agregarCategoria")
	public String agregarCategoria() {
		
		return "categorias/formCategorias";
	}
}
