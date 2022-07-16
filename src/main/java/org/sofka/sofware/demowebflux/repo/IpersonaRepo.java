package org.sofka.sofware.demowebflux.repo;

import org.sofka.sofware.demowebflux.model.Persona;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IpersonaRepo {


    Mono<Persona> registrar(Persona per);
    Mono<Persona> modificar(Persona per);
    Mono<Persona> listarPorId(Integer id);
    Mono<Void> eliminar(Integer id);

    Flux<Persona> listar() ;
}
