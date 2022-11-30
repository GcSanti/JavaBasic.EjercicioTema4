package com.example.javabasicejerciciotema4;

public class Main  {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Samsung","a52","Negro",189,6.5,6,"Android");
        SmartWatch smartWatch = new SmartWatch("Apple","Watch 6","Rojo", 30, 1.57,"Bluetooth");

        System.out.println("El dispositivo es: " + smartPhone + "\nEl dispositivo es: " + smartWatch);
    }
}