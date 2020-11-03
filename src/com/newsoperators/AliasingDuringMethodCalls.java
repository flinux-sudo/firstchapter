package com.newsoperators;
public class AliasingDuringMethodCalls{
    public static void f(HaveField c){
        c.c=1;
    }
    public static void main(String[] args) {
        HaveField c =new HaveField();
        c.c=3;
        System.out.println(c.c);
        f(c);
        System.out.println(c.c);
    }
}
 class HaveField{
 float c;
}