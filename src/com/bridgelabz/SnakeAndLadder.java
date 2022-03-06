package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("--- Snake and Ladder Problem ---");

        Random random = new Random();
        int rollDie = random.nextInt(6 ) + 1;
        System.out.println("Dice face is : " + rollDie);
    }
}
