package com.kodilla.spring.intro;

import java.util.Scanner;

public class Player {

    private String name;
    private int points;

    public Player(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void increasePoints() {
        points++;
    }

    public int chooseMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", choose: (1) Rock, (2) Paper, (3) Scissors, (4) Lizard, (5) Spock");
        return scanner.nextInt();
    }
}
