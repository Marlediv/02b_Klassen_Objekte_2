package com.cc.java;

public class Cat {
  
    private String name;
    private String furColor;
    private int age;
    
    // Konstruktor ( kein Rückgabetyp)
     public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }



    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }



    public String getName() {

        if (getPermission()) {
            return name;
        } else {
            return "Sorry, no permission to access the name.";
        }
        
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getFurColor() {
        return furColor;
    }



    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public Cat() {
    }
      
    private boolean getPermission() {

        // return true; // hier ein Rechtsschutz-Check einbauen
        return false; // hier ein Fehler simulieren
    }
    
}