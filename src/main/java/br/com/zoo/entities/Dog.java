package br.com.zoo.entities;

import br.com.zoo.base.Animal;
import br.com.zoo.interfaces.DomesticAnimal;

import java.util.HashSet;
import java.util.Set;

public final class Dog extends Animal implements DomesticAnimal {

    // Heranca para Diferenca
    private final String dogBread;
    private Set<String> toys = new HashSet<>();

    public Dog(final String dogBread, final String name, Double weight) {
        super(name, weight);
        this.dogBread = dogBread;
    }

    public Dog(final String dogBread, final String name, Double weight, Set<String> toys) {
        super(name, weight);
        this.dogBread = dogBread;
        this.toys = toys;
    }

    public String getDogBread() {
        return dogBread;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getWeight() {
        return weight;
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
                "dogBread='" + dogBread + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", toys= " + toys;
    }


    @Override
    public void play() {
        System.out.println("Running on the street, searching for another DOG! :P ");
    }
}
