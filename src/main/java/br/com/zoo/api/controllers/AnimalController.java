package br.com.zoo.api.controllers;

import br.com.zoo.api.AnimalAPI;
import br.com.zoo.base.Animal;
import br.com.zoo.entities.dto.AnimalDto;
import br.com.zoo.services.impl.AnimalServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@RestController
public class AnimalController implements AnimalAPI {
    private final AnimalServiceImpl animalService;

    public AnimalController(AnimalServiceImpl animalService) {
        this.animalService = Objects.requireNonNull(animalService);
    }

    @Override
    public ResponseEntity<List<AnimalDto>> findAll() {
        return ResponseEntity.ok().body(this.animalService.findAll()
                .stream()
                .map(Animal::toDto)
                .toList());
    }

    @Override
    public ResponseEntity<Optional<AnimalDto>> findById(String id) {
        return ResponseEntity.ok().body(this.animalService.findById(UUID.fromString(id))
                .map(Animal::toDto));
    }

    @Override
    public ResponseEntity<Void> deleteById(String id) {
        this.animalService.deleteById(UUID.fromString(id));
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<String> update(@PathVariable("id") String id, @RequestBody AnimalDto newAnimal) {
        animalService.update(UUID.fromString(id), newAnimal);
        return ResponseEntity.ok("Animal updated successfully");
    }
}
