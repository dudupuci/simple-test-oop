package br.com.zoo.entities.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.UUID;


public class LizardDto extends AnimalDto {

    public LizardDto(){}
    public LizardDto(UUID id, String name, Double weight) {
        super(id, name, weight);
    }


}
