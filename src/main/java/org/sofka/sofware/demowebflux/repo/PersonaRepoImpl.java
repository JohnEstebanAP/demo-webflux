package org.sofka.sofware.demowebflux.repo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sofka.sofware.demowebflux.model.Persona;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonaRepoImpl implements IpersonaRepo {

  private static final Logger log = LoggerFactory.getLogger(PersonaRepoImpl.class);

  @Override
  public Mono<Persona> registrar(Persona per) {
    log.info(per.toString());
    return Mono.just(per);
  }

  @Override
  public Mono<Persona> modificar(Persona per) {
    log.info(per.toString());
    return Mono.just(per);
  }

  @Override
  public Mono<Persona> listarPorId(Integer id) {
    return Mono.just(new Persona(1, "john"));
  }

  @Override
  public Mono<Void> eliminar(Integer id) {
    return Mono.empty();
  }

  @Override
  public Flux<Persona> listar() {
    List<Persona> personas = new ArrayList<>();

    personas.add(new Persona(1, "john"));
    personas.add(new Persona(2, "luisa"));

    return Flux.fromIterable(personas);
  }
}
