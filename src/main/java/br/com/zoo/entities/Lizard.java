package br.com.zoo.entities;

import br.com.zoo.base.Animal;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public final class Lizard extends Animal {

    // Heranca para Implementacao

    public Lizard() {
    }

    public Lizard(UUID id, String name, Double weight) {
        super(id, name, weight);
    }


    @Override
    protected void eat() {

    }

    @Override
    protected void makeSound() {

    }

    @Override
    public String toString() {
        return "Lizard {" +
                "id= " + id +
                "name='" + name + '\'' +
                ", weight=" + weight + "}";
    }
}
