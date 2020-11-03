package com.newsoperators;

public class Dog {
    String name = "";
    String says = "";


    public static void main(String[] args) {
        Dog doggy1= new Dog();
        Dog doggy2= new Dog();
        Dog doggy3= doggy1;
        doggy1.name = "spot";
        doggy1.says = "Ruff!";
        doggy2.name = "scruffy";
        doggy2.says = "Wurf!";
        System.out.println("doggy : "+doggy1.name+"\tsays : "+doggy1.says);
        System.out.println("doggy : "+doggy2.name+"\tsays : "+doggy2.says);
        System.out.println("\n\n");
        System.out.println("doggy3==doggy1?");
        System.out.println(doggy3.equals(doggy1));
        System.out.println(doggy3==doggy1);
        System.out.println("doggy3==doggy2?");
        System.out.println(doggy3.equals(doggy2));
        System.out.println(doggy3==doggy2);
        System.out.println("doggy1==doggy2?");
        System.out.println(doggy1.equals(doggy2));
        System.out.println(doggy1==doggy2);
        System.out.println("doggy1==doggy3?");
        System.out.println(doggy1.equals(doggy3));
        System.out.println(doggy1==doggy3);
        System.out.println("doggy2==doggy1?");
        System.out.println(doggy2.equals(doggy1));
        System.out.println(doggy2==doggy1);
        System.out.println("doggy2==doggy3?");
        System.out.println(doggy2.equals(doggy3));
        System.out.println(doggy2==doggy3);


    }

}