package com.firstobjectexercises;

public class AutoboxingExamples {
    public void autoBoxExamples(){
        int a=50;
        char c='c';
        double e=1.1;
        boolean d=true;
        Integer a2=new Integer(a);
        Integer a3=5;
        Character c1=new Character(c);
        Double e1=new Double(e);
        Boolean d1=new Boolean(d);
        System.out.println(a2);
        System.out.println(a2.getClass().getSimpleName());
        System.out.println(c1);
        System.out.println(c1.getClass().getSimpleName());
        System.out.println(e1);
        System.out.println(e1.getClass().getSimpleName());
        System.out.println(d1);
        System.out.println(d1.getClass().getSimpleName());
    }

}
