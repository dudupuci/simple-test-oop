package br.com.zoo.services.impl;

import br.com.zoo.base.Animal;
import br.com.zoo.repositories.AnimalRepository;
import br.com.zoo.services.AnimalService;

import java.util.Objects;
import java.util.Optional;

public class AnimalServiceImpl implements AnimalService {
    private AnimalRepository repository;

    public AnimalServiceImpl(final AnimalRepository repository) {
        this.repository = Objects.requireNonNull(repository);
    }

    @Override
    public String create(Animal animal) {
        var obj = this.repository.save(animal);
        return obj.getId();
    }

    @Override
    public Optional<Animal> findById(String id) {
        return this.repository.findById(id);
    }

    @Override
    public void update(Animal animal) {
        this.repository.save(animal);
    }

    @Override
    public void deleteById(String id) {
        this.repository.deleteById(id);
    }
}
