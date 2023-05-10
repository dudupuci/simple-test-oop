package br.com.zoo.entities;

import br.com.zoo.base.Animal;
import br.com.zoo.enums.BeakColor;
import br.com.zoo.interfaces.DomesticAnimal;

public final class Bird extends Animal implements DomesticAnimal {

    // Inheritance for difference.

    private final BeakColor beakColor;

    public Bird(String id, String name, Double weight, BeakColor beakColor) {
        super(id, name, weight);
        this.beakColor = beakColor;
    }

    public BeakColor getBeakColor() {
        return beakColor;
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
    public void play() {
        System.out.println("Bird.play");
    }

    @Override
    public String toString() {
        return "Bird {" +
                "beakColor=" + beakColor +
                ", name='" + name + '\'' +
                ", weight=" + weight + "}";
    }
}
