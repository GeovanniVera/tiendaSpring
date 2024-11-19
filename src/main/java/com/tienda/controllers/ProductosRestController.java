package com.tienda.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.tienda.entity.Productos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ProductosRestController {

    @GetMapping("/productosRest")
    public Map<String,Object> showList(){
        Productos producto = new Productos(1,"pizza","Pizza de peperoni","Alimentos","Dominos",120);
        Map<String,Object> body = new HashMap<>();

        body.put("title", "Productos");
        body.put("producto",producto);
        return body;
    }
    
}
