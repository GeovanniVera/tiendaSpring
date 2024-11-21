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
	
	@GetMapping("/agregar")
	public String agregarCategoria() {
		return "categorias/formCategorias";
	}

	@PostMapping("/guardar")
	public String guardarCategoria(Categorias categoria) {
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
	public String getMethodName(@RequestParam("id") int idCategoria) {
		//hacer una consulta 
		Categorias categoria = serviceCategoria.buscarPorId(idCategoria);
		//
		System.out.println(categoria);
		return new String("redirect:/categorias/agregar");
	}
	
	
}
