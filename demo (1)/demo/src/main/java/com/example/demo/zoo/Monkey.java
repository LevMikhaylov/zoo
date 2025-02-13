package com.example.demo.zoo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Monkey implements Animal{
    @Override
    public String makeSound(){
        return "у-у-а!";
    }
    @Value("${monkey.name}")
    private String name;
    @Override
    public String getName(){
        return name;
    }
}
