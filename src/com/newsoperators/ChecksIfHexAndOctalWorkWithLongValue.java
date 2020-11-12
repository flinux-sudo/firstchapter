package com.newsoperators;

public class ChecksIfHexAndOctalWorkWithLongValue {
    public static void main(String[] args) {
        long hex1=0x2L;
        long hex2=0x2;
        long octal1=0177L;
        long octal2=0177l;
        long octal3=0177;
        System.out.println("hex1 :"+Long.toBinaryString(hex1));
        System.out.println("hex2 :"+Long.toBinaryString(hex2));
        System.out.println("octal1 :"+Long.toBinaryString(octal1));
        System.out.println("octal2 :"+Long.toBinaryString(octal2));
        System.out.println("octal3 :"+Long.toBinaryString(octal3));
        System.out.println(((Object) hex1 ).getClass().getSimpleName());
        System.out.println(((Object) hex2 ).getClass().getSimpleName());
    }
}
