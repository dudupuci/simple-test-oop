package br.com.zoo.entities.dto;

import br.com.zoo.enums.BeakColor;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.UUID;


public class BirdDto extends AnimalDto {

    private BeakColor beakColor;

    public BirdDto() {
    }

    public BirdDto(UUID id, String name, Double weight, BeakColor beakColor) {
        super(id, name, weight);
        this.beakColor = beakColor;
    }

    public BeakColor getBeakColor() {
        return beakColor;
    }

    public void setBeakColor(BeakColor beakColor) {
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


