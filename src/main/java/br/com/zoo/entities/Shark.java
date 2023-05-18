package br.com.zoo.entities;

import br.com.zoo.base.Animal;
import br.com.zoo.entities.dto.SharkDto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Entity
@DiscriminatorValue("Shark")
public final class Shark extends Animal {
    @Transient
    public Map<String, Integer> animalsEaten = new HashMap<>();

    public Shark() {
    }

    public SharkDto toDto() {
        return new SharkDto(id, name, weight, animalsEaten);
    }

    public Shark(UUID id, String name, Double weight) {
        super(id, name, weight);
    }

    public Shark(UUID id, String name, Double weight, Map<String, Integer> animalsEaten) {
        super(id, name, weight);
        this.animalsEaten = animalsEaten;
    }

    public Map<String, Integer> getAnimalsEaten() {
        return animalsEaten;
    }

    public void setAnimalsEaten(Map<String, Integer> animalsEaten) {
        this.animalsEaten = animalsEaten;
    }

    @Override
    protected void eat() {
        System.out.println("Shark.eat");
    }

    @Override
    protected void makeSound() {
        System.out.println("Shark.makeSound");
    }

    public void toHunt() {
        System.out.println("Shark.toHunt");
    }

    @Override
    public String toString() {
        return "Shark {" +
                "id= " + id +
                "name='" + name + '\'' +
                " weight=" + weight +
                " animalsEaten=" + animalsEaten + "}";
    }
}
