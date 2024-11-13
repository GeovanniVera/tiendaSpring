package com.tienda.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class ProductosRestController {

    @GetMapping("/productosRest")
    public Map<String,Object> mostrarLista(){
        Map<String,Object> body = new HashMap<>();

        body.put("title","Productos");
        body.put("productName", "Pizza");
        body.put("descripcion", "Pizza de peperoni grande");
        body.put("categoria", "Alimentos y Bebidas");
        body.put("marca", "Dominos");
        body.put("precio", 128);

        return body;
    }
    
}
