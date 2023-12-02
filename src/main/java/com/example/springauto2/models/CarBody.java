package com.example.springauto2.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class CarBody {
    private CarBodyType type;
    private Double weight;
    private Double price;
    public CarBody() {
        this.type = CarBodyType.Unclassified;
        this.weight = 0.0;
        this.price = 0.0;
    }
    public CarBody(CarBodyType type, Double weight, Double price) {
        this.type = type;
        this.weight = weight;
        this.price = price;
    }
    public void setType(CarBodyType type) {
        this.type = type;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public CarBodyType getType() {
        return type;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Кузов: " +
                "\n\t\tТип кузова: " + type.getValue() +
                "\n\t\tВес: " + weight +
                "\n\t\tСтоимость: " + price+"$";
    }
}
