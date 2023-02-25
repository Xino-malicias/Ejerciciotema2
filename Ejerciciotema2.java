package com.example;

public class Ejerciciotema2 {

    public static void main(String[] args) {

        double camisa = 19.90;
        double precioIva = (camisa * 0.21);
        double precioFinal = obtenerPrecio(camisa, precioIva);
        System.out.println(precioFinal);
    }

    static double obtenerPrecio(double camisa, double precioIva){
        return (camisa + precioIva);
    }
}

