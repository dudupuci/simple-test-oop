package br.com.zoo.entities.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.UUID;


public class BirdDto extends AnimalDto {

    private String beakColor;

    public BirdDto(){}
    public BirdDto(UUID id, String name, Double weight, String beakColor) {
        super(id, name, weight);
        this.beakColor = beakColor;
    }

    @Override
    public String toString() {
        return "BirdDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", beakColor= " + beakColor + "}";
    }
}


