package br.com.zoo.services.impl;

import br.com.zoo.base.Animal;
import br.com.zoo.entities.*;
import br.com.zoo.entities.dto.*;
import br.com.zoo.repositories.AnimalRepository;
import br.com.zoo.services.AnimalService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
public class AnimalServiceImpl implements AnimalService {
    private AnimalRepository repository;

    public AnimalServiceImpl(final AnimalRepository repository) {
        this.repository = Objects.requireNonNull(repository);
    }

    @Override
    public void create(AnimalDto animalDto) {
        Animal animal = convertTargetAnimal(animalDto);
        this.repository.save(animal);
    }

    @Override
    public Optional<Animal> findById(UUID id) {
        return this.repository.findById(id);
    }

    @Override
    public void update(UUID id, AnimalDto newAnimalDto) {
        Animal oldAnimal = repository.findById(id).orElseThrow(() -> new RuntimeException("err"));

        oldAnimal.setId(newAnimalDto.getId());
        oldAnimal.setName(newAnimalDto.getName());
        oldAnimal.setWeight(newAnimalDto.getWeight());

        if (oldAnimal instanceof Dog) {
            DogDto dogDto = (DogDto) newAnimalDto;
            Dog dog = (Dog) oldAnimal;
            dog.setToys(dogDto.getToys());
        } else if (oldAnimal instanceof Cat) {
            CatDto catDto = (CatDto) newAnimalDto;
            Cat cat = (Cat) oldAnimal;
            cat.setOwnersName(catDto.getOwnersName());
            cat.setVaccinated(catDto.getVaccinated());
        }
        repository.save(oldAnimal);
    }


    @Override
    public void deleteById(UUID id) {
        this.repository.deleteById(id);
    }

    @Override
    public List<Animal> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<Animal> findAllByName(String name) {
        return this.repository.findAllByName(name);
    }

    @Override
    public void clear() {
        this.repository.deleteAll();
    }

    public void updateDataAnimal(AnimalDto oldAnimal, AnimalDto newAnimalDto) {
        oldAnimal.setId(newAnimalDto.getId());
        oldAnimal.setName(newAnimalDto.getName());
        oldAnimal.setWeight(newAnimalDto.getWeight());
    }

    private Animal convertTargetAnimal(AnimalDto dto) {
        if (dto instanceof DogDto) {
            return new Dog(
                    dto.getId(),
                    ((DogDto) dto).getDogBread(),
                    dto.getName(),
                    dto.getWeight(),
                    ((DogDto) dto).getToys()
            );
        } else if (dto instanceof CatDto) {
            return new Cat(
                    dto.getId(),
                    dto.getName(),
                    dto.getWeight(),
                    ((CatDto) dto).getOwnersName(),
                    ((CatDto) dto).getVaccinated()
            );
        } else if (dto instanceof BirdDto) {
            return new Bird(
                    dto.getId(),
                    dto.getName(),
                    dto.getWeight(),
                    ((BirdDto) dto).getBeakColor()
            );
        } else if (dto instanceof LizardDto) {
            return new Lizard(
                    dto.getId(),
                    dto.getName(),
                    dto.getWeight()
            );
        } else if (dto instanceof SharkDto) {
            return new Shark(
                    dto.getId(),
                    dto.getName(),
                    dto.getWeight(),
                    ((SharkDto) dto).getAnimalsEaten()
            );
        }
        return null;
    }
}
