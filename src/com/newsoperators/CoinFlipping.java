package com.newsoperators;

import java.util.Random;
//import java.util.Scanner;

public class CoinFlipping {
    String coinsides="";

    public static void main(String[] args) {
        CoinFlipping coin=new CoinFlipping();
        Random rands =new Random();
     //   Scanner scaner=new Scanner(System.in);

        System.out.println("flipcoin:");
        System.out.println("to continue game input some sign" +
                "to end game input :E=END");
        int limit=1000;
        int iterator=0;
        int numberofheads=0;
        int numberoftailes=0;
        do {
            int sides = rands.nextInt(2);

            if (sides == 1) {
                coin.coinsides = "Heads";
                numberofheads++;
            } else {
                coin.coinsides = "Tailes";
                numberoftailes++;
            }
            System.out.println(coin.coinsides);
            System.out.println(sides);
            System.out.println("continue:");
            System.out.println("iterator: "+iterator++);

        }while(iterator<limit);

        System.out.println("numberofheads: "+numberofheads);
        System.out.println("numberoftailes: "+numberoftailes);
    }

}
