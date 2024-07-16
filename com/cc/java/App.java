package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Custom-Konstruktor
        Cat cat = new Cat("Grizabella", "white", 29);
        output("Blick von aussen: " + cat);
        output("Blick von innen: " + cat.getInstanceVariable());

        // Werte ausgeben
        output(cat.name);
        output(cat.furColor);
        output(Integer.toString(cat.age)); // Explizite Typumwandlung


        System.out.println("----------------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);
        output("Blick von aussen: " + cat2);
        output("Blick von innen: " + cat2.getInstanceVariable());

        // Werte ausgeben
        output(cat2.name);
        output(cat2.furColor);
        output(Integer.toString(cat2.age)); // Explizite Typumwandlung



    }

      // Statische Methode, die in der Klasse ausgeführt wird ...
    public static void output(String outputStr){
        System.out.println(outputStr);
    }
   
}
