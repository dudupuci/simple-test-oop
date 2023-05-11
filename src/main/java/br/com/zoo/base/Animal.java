package br.com.zoo.base;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {

    @Id
    protected String id;
    protected String name;
    protected Double weight;

    public Animal() {
    }

    public Animal(String id, String name, Double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public abstract String getId();

    public void setId(String id) {
        this.id = id;
    }

    protected abstract void eat();

    protected abstract void makeSound();
}
