package br.com.zoo.entities;

import br.com.zoo.base.Animal;
import br.com.zoo.entities.dto.BirdDto;
import br.com.zoo.enums.BeakColor;
import br.com.zoo.interfaces.DomesticAnimal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.UUID;

@Entity
@DiscriminatorValue("Bird")
public final class Bird extends Animal implements DomesticAnimal {

    // Inheritance for difference.

    @Enumerated(EnumType.STRING)
    private BeakColor beakColor;

    public Bird() {
    }

    public Bird(UUID id, String name, Double weight, BeakColor beakColor) {
        super(id, name, weight);
        this.beakColor = beakColor;
    }

    public BirdDto toDto() {
        return new BirdDto(id, name, weight, beakColor);
    }

    public BeakColor getBeakColor() {
        return beakColor;
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
