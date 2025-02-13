package com.example.demo.zoo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Monkey implements Animal{
    @Override
    public void makeSound(){
        System.out.println("у-у-а!");
    }
    @Value("${monkey.name}")
    private String name;
    @Override
    public String getName(){
        return name;
    }
}
