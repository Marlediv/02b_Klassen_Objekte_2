package com.cc.java;

public class Cat {
  
    // Felder / fields / attributes
    public String name; // pass by reference
    public String furColor;
    public int age;  // pass by value
    
    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

}