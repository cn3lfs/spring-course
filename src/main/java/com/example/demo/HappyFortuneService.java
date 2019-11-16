package com.example.demo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
    private String[] myArray = {"Today is your 1 day!", "Today is your 2 day!", "Today is your 3 day!"};
    private Random generator = new Random();

    @Override
    public String getFortune() {
        int randomIndex = generator.nextInt(myArray.length);
        return myArray[randomIndex];
    }
}
