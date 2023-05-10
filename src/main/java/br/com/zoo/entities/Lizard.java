package br.com.zoo.entities;

import br.com.zoo.base.Animal;

public final class Lizard extends Animal {

    // Heranca para Implementacao

    public Lizard(String id, String name, Double weight) {
        super(id, name, weight);
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

    @Override
    protected void eat() {

    }

    @Override
    protected void makeSound() {

    }

    @Override
    public String toString() {
        return "Lizard {" +
                "name='" + name + '\'' +
                ", weight=" + weight + "}";
    }
}
