package com.firstobjectexercises;

import java.util.Arrays;
import java.util.Scanner;

public class PrintVariableCommandLine {
    Scanner scaner=new Scanner(System.in);
     String[] car=new String[3];
    public void printFromCommandLine(){
        for(int i=0;i<=2;i++){
            System.out.println("input: ");
            car[i]=scaner.next();
            System.out.println(car[i]);
        }
        for(String car :car){
            System.out.println(car);
        }
        System.out.println(Arrays.toString(car));

    }
}
