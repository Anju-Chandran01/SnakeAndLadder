package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println(" --- Snake and Ladder Problem --- ");

        int playerPosition = 0;
        System.out.println("Game starts from : " + playerPosition);

        Random random = new Random();
        int playerRollDie = random.nextInt(6) + 1;
        System.out.println("Dice face : " + playerRollDie);
        int rollDie = random.nextInt(3);
        switch (rollDie) {
            case 0:
                playerPosition = playerPosition + playerRollDie;
                break;
            case 1:
                playerPosition = playerPosition - playerRollDie;
                break;
            case 2:
                playerPosition = playerPosition;
                break;
            default:
                break;
        }
        System.out.println("Player is at : " + playerPosition);
    }
}
