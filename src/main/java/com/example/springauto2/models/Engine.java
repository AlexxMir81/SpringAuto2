package com.example.springauto2.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Engine {
    private Integer power;
    private Double engineVolume;
    private Double weight;
    private Double price;
    public Integer getPower() {
        return power;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Engine() {
        this.power = 0;
        this.engineVolume = 0.0;
        this.weight = 0.0;
        this.price = 0.0;
    }
    public Engine(Integer power, Double engineVolume, Double weight, Double price) {
        this.power = power;
        this.engineVolume = engineVolume;
        this.weight = weight;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Двигатель: " +
                "\n\t\tМощность: " + power +"л.с."+
                "\n\t\tОбъем: " + engineVolume +"л."+
                "\n\t\tDес: " + weight +"кг."+
                "\n\t\tЦена: " + price +"$";
    }







}
