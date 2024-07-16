package com.cc.java;

public class Cat {
  
    // Felder / fields / attributes
    public String name; // pass by reference
    public String furColor;
    public int age;  // pass by value
    

    
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }



    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

}