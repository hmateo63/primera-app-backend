package com.company.intecap.primeraapp.controller;

import com.company.intecap.primeraapp.model.Producto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProductoController {

    @GetMapping("/productos")
    public ResponseEntity<List<Producto>> getProductos(){

        //crear 3 productos
        Producto p1 = new Producto(1, "Producto 1", "Descripcion 1", 100.0);
        Producto p2 = new Producto(2, "Producto 2", "Descripcion 2", 200.0);
        Producto p3 = new Producto(3, "Producto 3", "Descripcion 3", 300.0);
        Producto p4 = new Producto(4, "Producto 4", "Descripcion 4", 400.0);
        
        //agregar los productos a la lista
        List<Producto> productos = List.of(p1, p2, p3, p4);

        //retornar la lista de productos

        return new ResponseEntity<>(productos, HttpStatus.OK);
    }
}
