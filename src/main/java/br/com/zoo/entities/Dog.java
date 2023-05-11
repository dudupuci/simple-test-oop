package br.com.zoo.entities;

import br.com.zoo.base.Animal;
import br.com.zoo.interfaces.DomesticAnimal;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public final class Dog extends Animal implements DomesticAnimal {

    // Inheritance for difference.
    private String dogBread;
    @Transient
    private Set<String> toys = new HashSet<>();

    public Dog() {
    }

    public Dog(UUID id, final String dogBread, final String name, Double weight) {
        super(id, name, weight);
        this.dogBread = dogBread;
    }

    public Dog(UUID id, final String dogBread, final String name, Double weight, Set<String> toys) {
        super(id, name, weight);
        this.dogBread = dogBread;
        this.toys = toys;
    }

    public String getDogBread() {
        return dogBread;
    }


    public Set<String> getToys() {
        return toys;
    }

    public void setToys(Set<String> toys) {
        this.toys = toys;
    }

    @Override
    protected void eat() {
        System.out.println("Dog.eat");
    }

    @Override
    protected void makeSound() {
        System.out.println("Dog.makeSound");
    }

    public void askForAffection() {
        System.out.println("Dog.askForAffection");
    }

    @Override
    public String toString() {
        return "Dog {" +
                ", id=" + id +
                ", dogBread='" + dogBread + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", toys= " + toys;
    }


    @Override
    public void play() {
        System.out.println("Running on the street, searching for another DOG! :P ");
    }
}
