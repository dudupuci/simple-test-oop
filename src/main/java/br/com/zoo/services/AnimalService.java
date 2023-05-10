package br.com.zoo.services;

import br.com.zoo.base.Animal;

import java.util.Optional;

public interface AnimalService {
    String create(Animal animal);

    Optional<Animal> findById(String id);

    void update(Animal animal);

    void deleteById(String id);
}
