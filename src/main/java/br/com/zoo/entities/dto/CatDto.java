package br.com.zoo.entities.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.UUID;


@JsonTypeName("Catzin")
public class CatDto extends AnimalDto {

    private String ownersName;
    private Boolean isVaccinated;

    public CatDto(UUID id, String name, Double weight, String ownersName, Boolean isVaccinated) {
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

    public Boolean getVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "CatDto{" +
                "ownersName='" + ownersName + '\'' +
                ", isVaccinated=" + isVaccinated +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                "} ";
    }
}