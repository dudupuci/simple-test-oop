package br.com.zoo.entities.dto;

import br.com.zoo.base.Animal;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.UUID;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BirdDto.class, name = "Bird"),
        @JsonSubTypes.Type(value = CatDto.class, name = "Cat"),
        @JsonSubTypes.Type(value = DogDto.class, name = "Dog"),
        @JsonSubTypes.Type(value = LizardDto.class, name = "Lizard"),
        @JsonSubTypes.Type(value = SharkDto.class, name = "Shark")
})
public class AnimalDto {
    protected UUID id = UUID.randomUUID();
    protected String name;
    protected Double weight;

    public AnimalDto(){
    }

    public AnimalDto(UUID id, String name, Double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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
}

