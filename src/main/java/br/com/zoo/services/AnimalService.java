package br.com.zoo.services;

import br.com.zoo.base.Animal;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AnimalService {
    String create(Animal animal);

    Optional<Animal> findById(UUID id);

    void update(UUID id, Animal animal);

    void deleteById(UUID id);

    List<Animal> findAll();
}
