package com.andrei.primeraApi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chanchy")
public class SaludoController {

    // con que metodo y bajo que url queiero que se vea mi holaMundo
    // se usara la anotacion GetMapping
    @GetMapping("/saludo")
    public String holaMundo () {
        return "Hola Mundo!";
    }

    // otro tipo de enpoint donde puedo añadir parametros
    // que anotacion se ha de poner par aindicar que nombre y edad son parametros?
    // dos opciones @RequestParam o @PathVariable
    // En este caso como disponemos de dos PathVariables hemos de indicar como queremos que se vea el Path
    @GetMapping("/holanombre/{nombre}/{edad}")
    public String holaMundoNombre2(@PathVariable String nombre, @PathVariable int edad){
        return "Hola Mundo!" + nombre + "Tu edad es: " +edad;
    }
}
