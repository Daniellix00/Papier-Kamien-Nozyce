package com.kodilla.spring.intro;


public class Main {
    public static void main(String[] args) {
        Player player = new Player("Player");
        Computer computer = new Computer();
        int numberOfRounds = 5; // You can adjust the number of rounds according to your preference
        Game game = new Game(player, computer, numberOfRounds);

        game.startGame();
    }
    }
