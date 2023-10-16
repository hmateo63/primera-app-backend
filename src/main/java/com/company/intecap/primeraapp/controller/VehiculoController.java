package com.company.intecap.primeraapp.controller;

import com.company.intecap.primeraapp.model.Cliente;
import com.company.intecap.primeraapp.model.Vehiculo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1") // es el prefijo de la url
public class VehiculoController {

    /*
    @GetMapping("/index") // http://localhost:8080/api/v1/index

    public String getIndex(){
        return "Bienvenidos a mi API REST  Spring Boot";
    }
    */



    // Ejemplo de Uso de clase HttpStatus
    @GetMapping("/vehiculos") // http://localhost:8080/api/v1/vehiculos
    public ResponseEntity<List<Vehiculo>> getVehiculos() {
        Vehiculo v1 = new Vehiculo(1, "Toyota", "2023", "Rojo", "P-123XYZ", 99000.00);
        Vehiculo v2 = new Vehiculo(2, "Mazda", "2022", "Celeste", "P-456TYZ", 89000.00);
        Vehiculo v3 = new Vehiculo(3, "Honda", "2021", "Verde", "P-789UYZ", 79000.00);
        Vehiculo v4 = new Vehiculo(4, "Suzuki", "2020", "Azul", "P-124WYZ", 69000.00);
        Vehiculo v5 = new Vehiculo(5, "Kia", "2019", "Amarillo", "P-567XYZ", 59000.00);
        //agregar los vehiculos  a la lista
        List<Vehiculo> vehiculos = List.of(v1, v2, v3, v4, v5);
        //retornar la lista de vehiculos
        return new ResponseEntity<>(vehiculos, HttpStatus.OK);
    }

}
