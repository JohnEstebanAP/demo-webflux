package org.sofka.sofware.demowebflux.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sofka.sofware.demowebflux.model.Persona;
import org.sofka.sofware.demowebflux.repo.IpersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/personas/")
public class PersonaController {

    private static final Logger log = LoggerFactory.getLogger(PersonaController.class);

    @Autowired
    private IpersonaRepo repo;


    @GetMapping
    public Flux<Persona> listar(){
        return repo.listar();
    }

    @PostMapping
    public Mono<Persona> registrar(@RequestBody Persona per  ){
        return repo.registrar(per);
    }

    @PutMapping
    public Mono<Persona> modificar(@RequestBody Persona per  ){
        return repo.modificar(per);
    }

    @GetMapping("/{id}")
    public Mono<Persona> listarPorId(@PathVariable("id") Integer id){
        return repo.listarPorId(id);
    }


    @DeleteMapping("/{id}")
    public Mono<Void> eliminar(@PathVariable("id") Integer id){

        return   repo.eliminar(id);

    }

}
