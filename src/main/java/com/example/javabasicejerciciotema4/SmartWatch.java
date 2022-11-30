package com.example.javabasicejerciciotema4;

public class SmartWatch extends SmartDevice{
    String conectividad;

    public SmartWatch(){
        super();
    }

    public SmartWatch(String fabricante, String modelo, String color, int peso, double pulgadas, String conectividad) {
        super(fabricante,modelo,color,peso,pulgadas);
        this.conectividad = conectividad;

    }
    @Override
    public String toString() {
        return "SmartWatch{" +
                "conectividad='" + conectividad + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", pulgadas=" + pulgadas +
                '}';
    }
}
