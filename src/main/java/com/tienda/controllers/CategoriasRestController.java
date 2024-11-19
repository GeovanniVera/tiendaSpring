package com.tienda.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.entity.Categorias;


@RestController
@RequestMapping("/apiCategorias")
public class CategoriasRestController {
    @GetMapping("/categoriasRest")
    public Map<String,Object> showCategory(){
        Categorias categoria = new Categorias(1,"Alimentos y Bebidas","Especializacion en alimentos y bebidas","categoria1.jpg",1);
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Categorias");
        body.put("categoria",categoria);
        return body;
    }
}
