package com.bdlz.BC;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        //variables
        char character;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a Character to Check it is a Vowel or Consonant");
        character = scanner.next().charAt(0);
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            switch (character) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.print(character + " is vowel");
                default:
                    System.out.println(character + " is consonant");
            }
        } else System.out.println("enter a character");
    }
}
