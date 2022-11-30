package com.example.javabasicejerciciotema4;

public class SmartPhone extends SmartDevice{
    int ram;
    String sistema;
    public SmartPhone(){
    }


    public SmartPhone ( String fabricante, String modelo, String color, int peso, double pulgadas, int ram, String sistema) {
        this.fabricante     = fabricante;
        this.modelo         = modelo;
        this.color          = color;
        this.peso           = peso;
        this.pulgadas       = pulgadas;
        this.ram            = ram;
        this.sistema        = sistema;


    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "ram=" + ram +
                ", sistema='" + sistema + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", pulgadas=" + pulgadas +
                '}';
    }
}

