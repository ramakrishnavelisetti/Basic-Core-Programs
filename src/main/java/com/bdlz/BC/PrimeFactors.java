package com.bdlz.BC;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        int num, div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        System.out.print("Prime factors of given number are:- ");

        for (div = 2; div * div <= num; div++) {
            while (num % div == 0) {
                num = num / div;
                System.out.print(div + "  ");
            }

        }
        if (num != 1) {
            System.out.println(num);
        }
    }

}
