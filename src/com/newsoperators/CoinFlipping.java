package com.newsoperators;

import java.util.Random;
import java.util.Scanner;

public class CoinFlipping {
    String coinsides="";

    public static void main(String[] args) {
        CoinFlipping coin=new CoinFlipping();
        Random rands =new Random();
        Scanner scaner=new Scanner(System.in);

        while(!(scaner.next().equals("k")) {
            int sides = rands.nextInt(2);

            if (sides == 1) {
                coin.coinsides = "Heads";
            } else {
                coin.coinsides = "Tailes";
            }
            System.out.println(coin.coinsides);
            System.out.println(sides);
        }
    }

}
