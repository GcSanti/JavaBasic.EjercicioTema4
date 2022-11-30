package com.example.javabasicejerciciotema4;

     public class SmartDevice {
         String fabricante;
         String modelo;
         String color;
         int peso;
         double pulgadas;

              public SmartDevice(){
              }

          public SmartDevice( String fabricante, String modelo, String color, int peso, double pulgadas) {

              this.fabricante     = fabricante;
              this.modelo         = modelo;
              this.color          = color;
              this.peso           = peso;
              this.pulgadas       = pulgadas;
          }
}