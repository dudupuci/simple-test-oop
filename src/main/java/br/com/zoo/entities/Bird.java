package br.com.zoo.entities;

import br.com.zoo.base.Animal;
import br.com.zoo.enums.BeakColor;
import br.com.zoo.interfaces.DomesticAnimal;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public final class Bird extends Animal implements DomesticAnimal {

    // Inheritance for difference.

    private String beakColor;


    public Bird() {
    }

    public Bird(String id, String name, Double weight, String beakColor) {
        super(id, name, weight);
        this.beakColor = beakColor;
    }

    public String getBeakColor() {
        return beakColor;
    }

    @Override
    public String getId() {
        return id;
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
