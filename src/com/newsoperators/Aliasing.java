package com.newsoperators;

public class Aliasing {
    public void aliasing(){
        Alias c1=new Alias();
        Alias c2=new Alias();
        c1.level=2;
        System.out.println(c1.level);
        c2.level=4;
        c1=c2;
        System.out.println(c2.level);
        c1.level=6;
        System.out.println((c1.level));
    }
}
class Alias{
    float level;
}