package com.tienda.controllers;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.tienda.entity.Productos;



@RequestMapping("/productos")
@Controller
public class ProductosController {

	@GetMapping("/")
	public String mostrarLista() {
		return "productos/listaProductos";
	}
	
	@GetMapping("/detalles")
	public String detalleProducto() {
		return "productos/detalles";
	}
	
	@GetMapping("/agregarProducto")
	public String formularioProductos() {
		return "productos/formProductos";
	}
	
}
