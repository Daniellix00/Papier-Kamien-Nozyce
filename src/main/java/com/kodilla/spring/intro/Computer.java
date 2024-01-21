package com.kodilla.spring.intro;

import java.util.Random;

public class Computer {
    public int chooseMove() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }
}

