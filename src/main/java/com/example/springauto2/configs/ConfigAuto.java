package com.example.springauto2.configs;

import com.example.springauto2.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
//@ComponentScan(value = "com.example.springauto2")
@PropertySource("application.properties")
public class ConfigAuto {

    @Bean
    public Auto Mazda3(){
        Auto auto = new Auto();
        auto.setBrand("Mazda");
        auto.setName("3");
        auto.setEngine(engine1());
        auto.setTransmission(transmission1());
        auto.setWheel(wheel1());
        auto.setCarBody(carBody1());
        auto.setPrice(20000.0);

        return auto;
    }
    @Bean
    public Engine engine1(){
        Engine engine = new Engine();
        engine.setEngineVolume(2.0);
        engine.setPower(150);
        engine.setPrice(8000.0);
        engine.setWeight(150.0);
        return engine;
    }
    @Bean
    public Transmission transmission1(){
        Transmission transmission = new Transmission();
        transmission.setTransmission(TransmissionType.AUTO);
        transmission.setGears(6);
        transmission.setWeight(120.0);
        transmission.setPrice(5000.0);
        return transmission;
    }
    @Bean
    public CarBody carBody1(){
        CarBody carBody = new CarBody();
        carBody.setType(CarBodyType.Coupe);
        carBody.setPrice(2000.0);
        carBody.setWeight(1500.0);
        return carBody;
    }
    @Bean
    public Wheel wheel1(){
        Wheel wheel = new Wheel();
        wheel.setDiameter(15);
        wheel.setPrice(1500.0);
        wheel.setWeight(25.0);
        return wheel;
    }
//----------------------
    @Bean
    public Auto RenaultDuster(){
        Auto auto = new Auto();
        auto.setBrand("Renault");
        auto.setName("Duster");
        auto.setEngine(engine1());
        auto.setTransmission(transmission1());
        auto.setWheel(wheel1());
        auto.setCarBody(carBody1());
        auto.setPrice(20000.0);

        return auto;
    }
    @Bean
    public Engine engine2(){
        Engine engine = new Engine();
        engine.setEngineVolume(2.0);
        engine.setPower(120);
        engine.setPrice(5000.0);
        engine.setWeight(180.0);
        return engine;
    }
    @Bean
    public Transmission transmission2(){
        Transmission transmission = new Transmission();
        transmission.setTransmission(TransmissionType.MANUAL);
        transmission.setGears(6);
        transmission.setWeight(150.0);
        transmission.setPrice(3000.0);
        return transmission;
    }
    @Bean
    public CarBody carBody2(){
        CarBody carBody = new CarBody();
        carBody.setType(CarBodyType.Pickup);
        carBody.setPrice(2500.0);
        carBody.setWeight(1700.0);
        return carBody;
    }
    @Bean
    public Wheel wheel2(){
        Wheel wheel = new Wheel();
        wheel.setDiameter(16);
        wheel.setPrice(1600.0);
        wheel.setWeight(25.0);
        return wheel;
    }

    @Bean
    public Auto KiaRio(){
        Auto auto = new Auto();
        auto.setBrand("Kia");
        auto.setName("Rio");
        auto.setEngine(engine1());
        auto.setTransmission(transmission1());
        auto.setWheel(wheel1());
        auto.setCarBody(carBody1());
        auto.setPrice(15000.0);

        return auto;
    }
    @Bean
    public Engine engine3(){
        Engine engine = new Engine();
        engine.setEngineVolume(1.5);
        engine.setPower(123);
        engine.setPrice(6000.0);
        engine.setWeight(160.0);
        return engine;
    }
    @Bean
    public Transmission transmission3(){
        Transmission transmission = new Transmission();
        transmission.setTransmission(TransmissionType.AUTO);
        transmission.setGears(6);
        transmission.setWeight(140.0);
        transmission.setPrice(3500.0);
        return transmission;
    }
    @Bean
    public CarBody carBody4(){
        CarBody carBody = new CarBody();
        carBody.setType(CarBodyType.Hatchback);
        carBody.setPrice(2600.0);
        carBody.setWeight(1600.0);
        return carBody;
    }
    @Bean
    public Wheel wheel3(){
        Wheel wheel = new Wheel();
        wheel.setDiameter(15);
        wheel.setPrice(1650.0);
        wheel.setWeight(27.0);
        return wheel;
    }
}
