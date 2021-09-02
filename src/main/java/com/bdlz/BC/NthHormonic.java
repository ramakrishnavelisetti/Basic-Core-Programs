package com.bdlz.BC;

import java.util.Scanner;

public class NthHormonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0;
        System.out.println("Enter Number of Terms to Add");
        n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            sum += (1.0) / i;
            System.out.println(sum);
        }
        System.out.println("Harmonic sum is : " + sum);
    }
}
