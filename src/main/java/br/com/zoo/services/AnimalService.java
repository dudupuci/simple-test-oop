package br.com.zoo.services;

import br.com.zoo.base.Animal;
import br.com.zoo.entities.dto.AnimalDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AnimalService {
    String create(AnimalDto animal);
    Optional<Animal> findById(UUID id);
    void update(UUID id, AnimalDto animal);
    void deleteById(UUID id);
    List<Animal> findAll();
    List<Animal> findAllByName(String name);
    void clear();
}
