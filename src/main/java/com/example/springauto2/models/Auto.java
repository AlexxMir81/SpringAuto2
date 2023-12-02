package com.example.springauto2.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Auto {
    private  Engine engine;
    private Transmission transmission;
    private Wheel wheel;
    private  CarBody carBody;
    private Double price;
    private String brand;
    private String name;



    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public Double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public Auto() {
        this.engine = new Engine();
        this.transmission = new Transmission();
        this.wheel = new Wheel();
        this.carBody = new CarBody();
        this.price = 0.0;
        this.brand = "";
        this.name = "noName";
    }
    public Auto(Engine engine, Transmission transmission, Wheel wheel, CarBody carBody, Double price, String brand, String name) {
        this.engine = engine;
        this.transmission = transmission;
        this.wheel = wheel;
        this.carBody = carBody;
        this.price = price;
        this.brand = brand;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Автомобиль. Марка: " + brand+" "+name+":\n\t" +
                engine.toString() +
                "\n\t"+transmission.toString() +
                "\n\t"+wheel.toString() +
                "\n\t"+carBody.toString() +
                "\n\tСтоимость: " + price+"$" ;
    }
}
