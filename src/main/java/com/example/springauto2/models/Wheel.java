package com.example.springauto2.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Wheel {
    private Integer diameter;
    private Double weight;
    private Double price;

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public Wheel() {
        this.diameter = 0;
        this.weight = 0.0;
        this.price = 0.0;
    }
    public Wheel(Integer diameter, Double weight, Double price) {
        this.diameter = diameter;
        this.weight = weight;
        this.price = price;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public Integer getDiameter() {
        return diameter;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Колеса: " +
                "\n\t\tРадиус: " + diameter +
                "\n\t\tВес: " + weight +
                "\n\t\tСтоимость: " + price+"$";
    }
}
