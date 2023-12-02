package com.example.springauto2;

import com.example.springauto2.configs.ConfigAuto;
import com.example.springauto2.models.Auto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigAuto.class);

        Auto mazda = context.getBean("Mazda3", Auto.class);
        System.out.printf(mazda.toString());
        System.out.println("\n//////////////////");
        Auto renault = context.getBean("RenaultDuster", Auto.class);
        System.out.printf(renault.toString());
    }

}
