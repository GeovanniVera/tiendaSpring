package com.tienda.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tienda.entity.Categoria;
import com.tienda.services.InCategoriaService;


//import com.tienda.entity.Categorias;

@RequestMapping("/categorias")
@Controller
public class CategoriasController {
	@Autowired
	private InCategoriaService serviceCategoria;
	
	@GetMapping("/")
	public String mostrarLista(Model model) {
		List<Categoria> lista = serviceCategoria.obtenerCategoria();
		int total = serviceCategoria.totalCategorias();
        model.addAttribute("categorias", lista);
		model.addAttribute("totalCategorias", total);
		return "categorias/listaCategorias";
	}
	
	@GetMapping("/agregar")
	public String agregarCategoria(Categoria categoria) {
		System.out.println(categoria);
		return "categorias/formCategorias";
	}

	@PostMapping("/guardar")
	public String guardarCategoria(Categoria categoria) {
		//Recibir los datos
		System.out.println(categoria);
		//utilizamos el objeto de service categorias
		serviceCategoria.guardar(categoria);
		return new String("redirect:/categorias/");
	}

	@GetMapping("/eliminar")
	public String eliminarCategoria(@RequestParam("id") int idCategoria){
		//eliminar por id
		serviceCategoria.eliminar(idCategoria);
		return new String("redirect:/categorias/");
	}

	@GetMapping("/buscar")
	public String getMethodName(@RequestParam("id") Integer idCategoria, Model model) {
		//hacer una consulta 
		Categoria categoria = serviceCategoria.buscarPorId(idCategoria);
	
		//
		System.out.println(categoria);
		model.addAttribute("categoria", categoria);
		return new String("categorias/formCategorias");
	}
	
	
}
