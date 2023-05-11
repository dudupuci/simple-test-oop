package br.com.zoo.base;

import javax.persistence.*;
import java.util.UUID;

//@MappedSuperclass não irá persistir a tabela Animal, só irá servir de Superclasse para suas subclasses
// e criar uma Single Table para cada filho
@Entity // Irá persistir a tabela animal e podemos visualizar todos os animais em uma unica tabela.
public abstract class Animal {

    @Id
    protected UUID id;
    protected String name;
    protected Double weight;

    public Animal() {
    }

    public Animal(UUID id, String name, Double weight) {
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    protected abstract void eat();

    protected abstract void makeSound();
}
