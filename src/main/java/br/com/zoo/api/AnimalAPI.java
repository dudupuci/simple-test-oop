package br.com.zoo.api;

import br.com.zoo.base.Animal;
import br.com.zoo.entities.dto.AnimalDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api("Animals Endpoints")
@RequestMapping(path = "/animals")
public interface AnimalAPI {

    @GetMapping
    ResponseEntity<List<AnimalDto>> findAll();

    @GetMapping
    @RequestMapping(value = "find/{id}")
    ResponseEntity<Optional<AnimalDto>> findById(@PathVariable("id") String id);

    @DeleteMapping
    @RequestMapping(value = "delete/{id}")
    ResponseEntity<Void> deleteById(@PathVariable("id") String id);

    @PutMapping
    @RequestMapping(value = "update/{id}")
    ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody AnimalDto animal);

}
