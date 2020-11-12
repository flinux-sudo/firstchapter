package com.newsoperators;

import javax.print.DocFlavor;

public class ShiftOperators {
    final int i=0x234;
    public void unsignedRightShiftOperators(){
        int i = -1;
        String j;
        System.out.println(Integer.toBinaryString(i));
        j=Integer.toBinaryString(i);
        System.out.println(j.length());
        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));
    }
    public void leftShiftOperator(){

        long i=100000000000000000L;
        System.out.println(Long.toBinaryString(i));
        System.out.println(i << 40);
        System.out.println(Long.toBinaryString(i <<40));
        System.out.println(Long.MIN_VALUE);

    }
    public void rightShiftOperator(){
        ShiftOperators right=new ShiftOperators();
        System.out.println(Integer.toBinaryString(right.i));
        for(int i=1;i<=9;i++) {
            System.out.println("i: "+i);
            System.out.println(Integer.toBinaryString(right.i >> i));
            System.out.println(i);
        }
    }
    public void leftAndRightShift(){
        ShiftOperators landr=new ShiftOperators();
        System.out.println(Integer.toBinaryString(landr.i));
        String l=(Integer.toBinaryString(landr.i << 10));

        for(int i=1;i<=9;i++) {
            System.out.println("i: "+i);
            System.out.println(landr.i>>> i);
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        ShiftOperators shift = new ShiftOperators();
        //shift.unsignedRightShiftOperators();
        //shift.leftShiftOperator();
        //shift.rightShiftOperator();
        shift.leftAndRightShift();

    }
}
