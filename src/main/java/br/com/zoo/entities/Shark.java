package br.com.zoo.entities;

import br.com.zoo.base.Animal;

public final class Shark extends Animal {

    // Heranca para Implementacao

    public Shark(String name, Double weight) {
        super(name, weight);
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
        System.out.println("Shark.eat");
    }

    @Override
    protected void makeSound() {
        System.out.println("Shark.makeSound");
    }

    public void toHunt() {
        System.out.println("Shark.toHunt");
    }
}
