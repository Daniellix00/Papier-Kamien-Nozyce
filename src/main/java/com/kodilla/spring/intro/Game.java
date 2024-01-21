package com.kodilla.spring.intro;

public class Game {
    private Player player;
    private Computer computer;
    private int numberOfRounds;
    private int currentRound;

    public Game(Player player, Computer computer, int numberOfRounds) {
        this.player = player;
        this.computer = computer;
        this.numberOfRounds = numberOfRounds;
        this.currentRound = 0;
    }

    public void startGame() {
        while (currentRound < numberOfRounds) {
            System.out.println("\nRound " + (currentRound + 1) + ":");
            int playerMove = player.chooseMove();
            int computerMove = computer.chooseMove();

            System.out.println("Computer chose: " + mapToString(computerMove));

            if (playerMove == computerMove) {
                System.out.println("It's a draw this round!");
            } else if (isPlayerWin(playerMove, computerMove)) {
                System.out.println(player.getName() + " wins the round!");
                player.increasePoints();
            } else {
                System.out.println("Computer wins the round!");
            }

            currentRound++;
        }

        endGame();
    }

    private boolean isPlayerWin(int playerMove, int computerMove) {
        return (playerMove == 1 && (computerMove == 3 || computerMove == 4)) ||
                (playerMove == 2 && (computerMove == 1 || computerMove == 5)) ||
                (playerMove == 3 && (computerMove == 2 || computerMove == 4)) ||
                (playerMove == 4 && (computerMove == 2 || computerMove == 5)) ||
                (playerMove == 5 && (computerMove == 1 || computerMove == 3));
    }

    private void endGame() {
        System.out.println("\nFinal score:");
        System.out.println(player.getName() + ": " + player.getPoints() + " points");
        System.out.println("Computer: 0 points");

        if (player.getPoints() > 0) {
            System.out.println(player.getName() + " wins the game!");
        } else {
            System.out.println("Computer wins the game!");
        }
    }

    private String mapToString(int move) {
        switch (move) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            case 4:
                return "Lizard";
            case 5:
                return "Spock";
            default:
                return "Unknown";
        }
    }
}
