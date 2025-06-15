package com.icecreamparlour.icecream.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "flavour")
public class FlavourEntity {
    @Id
    private String flavourId;

    public FlavourEntity() {
    }

    public FlavourEntity(String flavourId, String flavour) {
        this.flavourId = flavourId;
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavourId() {
        return flavourId;
    }

    public void setFlavourId(String flavourId) {
        this.flavourId = flavourId;
    }

    private String flavour;

    @Override
    public String toString() {
        return "FlavourEntity{" +
                "flavourId='" + flavourId + '\'' +
                ", flavour='" + flavour + '\'' +
                '}';
    }
}
