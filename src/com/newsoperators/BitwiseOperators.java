package com.newsoperators;

public class BitwiseOperators {
    final int one = 0x0;
    final int two = 0x1;

    public static void main(String[] args) {
        BitwiseOperators bitwise =new BitwiseOperators();
        System.out.println("one: "+Integer.toBinaryString(bitwise.one));
        System.out.println("two: "+Integer.toBinaryString(bitwise.two));
        System.out.println("and(&): "+Integer.toBinaryString(bitwise.one & bitwise.two));
        System.out.println("or(|): "+Integer.toBinaryString(bitwise.one | bitwise.two));
        System.out.println("xor(^): "+Integer.toBinaryString(bitwise.one ^ bitwise.two));
        System.out.println("~ : "+Integer.toBinaryString(~(bitwise.one)));
        System.out.println("~ : "+Integer.toBinaryString(bitwise.one));
        System.out.println((~(bitwise.one)));
        System.out.println("~ : "+Integer.toBinaryString(~(bitwise.two)));
        System.out.println("~ : "+Integer.toBinaryString(bitwise.two));
        System.out.println((~(bitwise.two)));


    }
}
