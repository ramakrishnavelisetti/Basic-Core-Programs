package com.bdlz.BC;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        year = sc.nextInt();
        sc.close();

        if (year > 999 && year < 9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                System.out.println("yes! it is leap year");
            else
                System.out.println("No, it is not a leap year");
        } else {
            System.out.println("Enter valid year");
        }

    }
}
