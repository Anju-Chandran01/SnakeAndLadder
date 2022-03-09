package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
    public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;
    static Random random = new Random();

    static int getRandomDieValue() {
        int randomValue = random.nextInt(6) + 1;
        return randomValue;
    }

    static int getRandomOption() {
        int randomValue1 = random.nextInt(3);
        return randomValue1;
    }

    public static void main(String[] args) {
        System.out.println("--- Snake and Ladder Simulator ---");
        Scanner in = new Scanner(System.in);

        int startPosition = 0;
        int currentPosition = 0;
        System.out.println("Game starts at: " + startPosition);
        while (currentPosition != 100) {
            System.out.println("To roll the die enter '1'");
            int die = in.nextInt();
            if (die == 1) {
                int playerDie = getRandomDieValue();
                System.out.println("Die Face: " + playerDie);
                int option = getRandomOption();
                switch (option) {
                    case IS_LADDER:
                        System.out.println("LADDER");
                        currentPosition += playerDie;
                        break;
                    case IS_SNAKE:
                        System.out.println("SNAKE");
                        currentPosition -= playerDie;
                        break;
                    default:
                        System.out.println("NO PLAY");
                        break;
                }
                if (currentPosition == 100) {
                    System.out.println("Position: " + currentPosition);
                    System.out.println("You Won!");
                    break;
                } else if (currentPosition > 100) {
                    currentPosition -= playerDie;
                    System.out.println("Invalid move!! You are at the same position.");
                    System.out.println("Current Position: " + currentPosition);
                } else if (currentPosition < 0) {
                    currentPosition = startPosition;
                    System.out.println("Back to Start");
                    System.out.println("Current Position: " + currentPosition);
                } else {
                    System.out.println("Current Position: " + currentPosition);
                }
            } else {
                System.exit(0);
            }
        }
    }
}