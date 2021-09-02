package com.bdlz.BC;

public class FlipCoin {
    public static void main(String[] args) {
        double coin = (int) (Math.random() * 10) % 2;
        if (coin == 1) {
            System.out.println("Head");
        } else {
            System.out.println("Tail");
        }
    }

}
