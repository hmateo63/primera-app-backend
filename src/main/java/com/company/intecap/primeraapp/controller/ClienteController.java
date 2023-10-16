package com.company.intecap.primeraapp.controller;




import com.company.intecap.primeraapp.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1") // es el prefijo de la url
public class ClienteController {

    @GetMapping("/index") // http://localhost:8080/api/v1/index

    public String getIndex(){
        return "Bienvenidos a mi API REST  Spring Boot";
    }



    // Ejemplo de Uso de clase HttpStatus
 @GetMapping("/clientes") // http://localhost:8080/api/v1/clientes
     public ResponseEntity<List<Cliente>> getClientes(){
         //crear 3 clientes
     //crear 3 clientes
     Cliente c1 = new Cliente(1, "Juan", "Perez", "Calle 1", "1234567", "juan@gmail.com");
     Cliente c2 = new Cliente(2, "Maria", "Lopez", "Calle 2", "1234567", "maria@gamail.com");
     Cliente c3 = new Cliente(3, "Pedro", "Gomez", "Calle 3", "1234567", "pedro@gmail.com");
     Cliente c4 = new Cliente(4, "Ana", "Garcia", "Calle 4", "1234567", "anagarcia@gmail.com");
         //agregar los clientes a la lista
        List<Cliente> clientes = List.of(c1, c2, c3);
          //retornar la lista de clientes
        return new ResponseEntity<>(clientes, HttpStatus.OK);
     }

     //Uso de clase HttpStatus: se utiliza para representar códigos de estado HTTP y sus descripciones asociadas. Esto es útil cuando estás construyendo aplicaciones web utilizando Spring y necesitas enviar respuestas HTTP con códigos de estado apropiados.

     @GetMapping("/success")
    public ResponseEntity<String> getSuccess(){
        return new ResponseEntity<>("Operacion Exitosa", HttpStatus.OK); // codigo 200
    }

    @GetMapping("/not-found")
    public ResponseEntity<String> getNotFound(){
        return new ResponseEntity<>("No se encontro el recurso", HttpStatus.NOT_FOUND); // codigo 404
    }

    @GetMapping("/error")
    public ResponseEntity<String> getError(){
        return new ResponseEntity<>("Error en el servidor", HttpStatus.INTERNAL_SERVER_ERROR); // codigo 500
    }

}
