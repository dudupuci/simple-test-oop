package br.com.zoo.base;

import br.com.zoo.entities.dto.AnimalDto;

import javax.persistence.*;
import java.util.UUID;

//@MappedSuperclass e criar uma Single Table para cada filho
@Entity // Irá persistir a tabela animal e podemos visualizar todos os animais em uma unica tabela.
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class Animal {

    @Id
    protected UUID id = UUID.randomUUID();
    protected String name;
    protected Double weight;

    public Animal() {
    }

    public AnimalDto toDto() {
        return new AnimalDto(id, name, weight);
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
