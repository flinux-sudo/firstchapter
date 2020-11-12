package com.newsoperators;

public class CompareTwoStrings {
    public void compare(String x,String z){
        System.out.println(x.equals(z));
        System.out.println(!(x.equals(z)));

    }



    public static void main(String[] args) {
        CompareTwoStrings compare=new CompareTwoStrings();
        compare.compare("abc","abc");
    }
}
