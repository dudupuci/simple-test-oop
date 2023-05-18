package br.com.zoo.entities;

import br.com.zoo.base.Animal;
import br.com.zoo.entities.dto.CatDto;
import br.com.zoo.interfaces.DomesticAnimal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
@DiscriminatorValue("Cat")
public final class Cat extends Animal implements DomesticAnimal {

    // Inheritance for difference.
    private String ownersName;
    private Boolean isVaccinated;

    public Cat() {
    }

    public CatDto toDto() {
        return new CatDto(id, name, weight, ownersName, isVaccinated);
    }

    public Cat(UUID id, final String name, Double weight, String ownersName) {
        super(id, name, weight);
        this.ownersName = ownersName;
    }

    public Cat(UUID id, final String name, Double weight, String ownersName, Boolean isVaccinated) {
        super(id, name, weight);
        this.ownersName = ownersName;
        this.isVaccinated = isVaccinated;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public void setVaccinated(Boolean vaccinated) {
        isVaccinated = vaccinated;
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
                "id= " + id +
                "ownersName='" + ownersName + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", isVaccinated= " + isVaccinated;
    }
}
