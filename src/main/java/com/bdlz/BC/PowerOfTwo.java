package com.bdlz.BC;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int number,power;
        System.out.println("Enter the power value: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            power = (int) Math.pow(2, i);
            System.out.println(2 + " to the power of " + i + " is " + power);
        }
    }
}
