package com.newsoperators;

import java.util.Random;
import java.util.Scanner;

public class CoinFlipping {
    String coinsides="";

    public static void main(String[] args) {
        CoinFlipping coin=new CoinFlipping();
        Random rands =new Random();
        Scanner scaner=new Scanner(System.in);

        System.out.println("flipcoin:");
        System.out.println("to continue game input some sign" +
                "to end game input :E=END");
        do {
            int sides = rands.nextInt(2);

            if (sides == 1) {
                coin.coinsides = "Heads";
            } else {
                coin.coinsides = "Tailes";
            }
            System.out.println(coin.coinsides);
            System.out.println(sides);
            System.out.println("continue:");
        }while(!(scaner.next().equals("E")));
    }

}
