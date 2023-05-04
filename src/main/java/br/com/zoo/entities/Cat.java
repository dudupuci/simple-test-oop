package br.com.zoo.entities;

import br.com.zoo.base.Animal;
import br.com.zoo.interfaces.DomesticAnimal;

public final class Cat extends Animal implements DomesticAnimal {

    // Heranca para Diferenca
    private final String ownersName;
    private Boolean isVaccinated;

    public Cat(final String name, Double weight, String ownersName) {
        super(name, weight);
        this.ownersName = ownersName;
    }

    public Cat(final String name, Double weight, String ownersName, Boolean isVaccinated) {
        super(name, weight);
        this.ownersName = ownersName;
        this.isVaccinated = isVaccinated;
    }

    public String getOwnersName() {
        return ownersName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getWeight() {
        return weight;
    }

    public Boolean getVaccinated() {
        return isVaccinated;
    }

    @Override
    protected void eat() {
        System.out.println("Cat.eat");
    }

    @Override
    protected void makeSound() {
        System.out.println("Cat.makeSound");
    }

    @Override
    public void play() {
        System.out.println("Scratching the lady's sofa! Meow.");
    }

    @Override
    public String toString() {
        return "Cat {" +
                "ownersName='" + ownersName + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", isVaccinated= " + isVaccinated;
    }
}
