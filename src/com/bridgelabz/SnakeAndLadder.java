package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println(" --- Snake and Ladder Problem --- ");

        int playerPosition = 100;
        Random random = new Random();
        int playerRollDie = random.nextInt(6) + 1;
        int rollDie = random.nextInt(3);
        while (playerPosition < 100) {
            switch (rollDie) {
                case 0 -> playerPosition = playerPosition + playerRollDie;
                case 1 -> {
                    playerPosition = playerPosition - playerRollDie;
                    if (playerPosition <= 0) {
                        SnakeAndLadder.main(args);
                    }
                }
                case 2 -> playerPosition = playerPosition;
                default -> {
                }
            }
        }
        if (playerPosition >= 100) {
            System.out.println("you won the game");
            System.exit(0);
        }
    }
}