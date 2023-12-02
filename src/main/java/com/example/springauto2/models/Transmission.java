package com.example.springauto2.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Transmission {
    private Integer gears;
    private TransmissionType transmission;
    private Double weight;
    private Double price;
    public Integer getGears() {
        return gears;
    }

    public TransmissionType getTransmission() {
        return transmission;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setGears(Integer gears) {
        this.gears = gears;
    }

    public void setTransmission(TransmissionType transmission) {
        this.transmission = transmission;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Transmission() {
        this.gears = 0;
        this.transmission = TransmissionType.MANUAL;
        this.weight = 0.0;
        this.price = 0.0;
    }

    public Transmission(Integer gears, TransmissionType transmission, Double weight, Double price) {
        this.gears = gears;
        this.transmission = transmission;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Трансмиссия: " +
                "\n\t\tКоличество передач: " + gears +
                "\n\t\tТип: " + transmission.getValue() +
                "\n\t\tВес: " + weight +
                "\n\t\tСтоимость: " + price+"$" ;
    }
}
