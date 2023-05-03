package br.com.zoo.base;

public abstract class Animal {
    protected String name;
    protected Double weight;

    public Animal(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract String getName();

    public abstract Double getWeight();

    protected void setWeight(Double weight) {
        this.weight = weight;
    }

    protected abstract void eat();

    protected abstract void makeSound();


}
