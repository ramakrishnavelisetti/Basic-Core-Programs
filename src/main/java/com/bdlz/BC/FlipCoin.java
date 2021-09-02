package com.bdlz.BC;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int coin, flip, headcount = 0, tailcount = 0;

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter number of times you want to flip coin");
        flip = sc.nextInt();
        sc.close();

        if (flip < 0) {
            System.out.println("Error enter a number greater than zero!");
        } else {
            for (int i = 0; i < flip; i++) {
                coin = random.nextInt(2);
                if (coin == 0) {
                    System.out.println("HEAD");
                    headcount++;
                } else {
                    System.out.println("TAIL");
                    tailcount++;
                }
            }
            System.out.println("Percentage of Heads: " + headcount * 100 / flip);
            System.out.println("Percentage of Tails: " + tailcount * 100 / flip);
        }
    }
}
