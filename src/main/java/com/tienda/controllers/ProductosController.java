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
import com.tienda.entity.Producto;
import com.tienda.services.InCategoriaService;
import com.tienda.services.InProductosService;



//import com.tienda.entity.Productos;



@RequestMapping("/productos")
@Controller
public class ProductosController {
	@Autowired
	private InProductosService seviceProd;

	@Autowired
	private InCategoriaService serviceCat;

	@GetMapping("/")
	public String mostrarLista(Model model) {
		List<Producto> lista = seviceProd.obtenerProductos();
		model.addAttribute("total", seviceProd.totalProductos());
		model.addAttribute("productos", lista);
		return "productos/listaProductos";
	}
	
	@PostMapping("/guardar")
	public String detalleProducto(Producto producto) {
		seviceProd.guardarProducto(producto);
		return "redirect:/productos/";
	}
	
	@GetMapping("/agregar")
	public String agregar(Producto producto, Model model) {
		List<Categoria> categorias = serviceCat.obtenerCategoria();
		model.addAttribute("categorias", categorias);		
		return "productos/formProductos";
	}

	@GetMapping("/buscar")
	public String buscarProducto(@RequestParam("id") Integer id, Model model) {
		Producto producto = null;
		if(id != null){
			producto=seviceProd.buscarPorId(id);
		}
		model.addAttribute("titulo", "Actualizar Producto");
		model.addAttribute("producto", producto);
		return new String("productos/formProductos");
	}

	@GetMapping("/eliminar")
	public String eliminar(@RequestParam("id") Integer id) {
		seviceProd.eliminarProducto(id);
		return new String("redirect:/productos/");
	}
	
	@GetMapping("/detalles")
	public String detalles(@RequestParam("id") Integer id , Model model) {
		Producto producto = null;
		producto = seviceProd.buscarPorId(id);
		model.addAttribute("producto", producto);
		return new String("productos/detalles");
	}
	
	
}
