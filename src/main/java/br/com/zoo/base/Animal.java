package br.com.zoo.base;

public abstract class Animal {

    protected String id;
    protected String name;
    protected Double weight;

    public Animal(String id, String name, Double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }


    public abstract String getId();

    public abstract String getName();

    public abstract Double getWeight();

    protected void setWeight(Double weight) {
        this.weight = weight;
    }

    protected abstract void eat();

    protected abstract void makeSound();
}
