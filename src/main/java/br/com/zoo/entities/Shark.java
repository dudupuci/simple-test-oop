package br.com.zoo.entities;

import br.com.zoo.base.Animal;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.HashMap;
import java.util.Map;

@Entity
public final class Shark extends Animal {
    @Transient
    public Map<String, Integer> animalsEaten = new HashMap<>();

    public Shark() {
    }

    public Shark(String id, String name, Double weight) {
        super(id, name, weight);
    }

    public Shark(String id, String name, Double weight, Map<String, Integer> animalsEaten) {
        super(id, name, weight);
        this.animalsEaten = animalsEaten;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getWeight() {
        return weight;
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
