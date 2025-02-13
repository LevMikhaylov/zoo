package com.example.demo.zoo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Frog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Ква-ква!");
    }
    @Value("${frog.name}")
    private String name;
    @Override
    public String getName(){
        return name;
    }
}
