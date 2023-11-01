package com.example.cleancode.isp;

public class Television implements Encendible, Ajustable{

    @Override
    public void encender() {
        System.out.println("Encendiendo la televisión");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando la televisión");
    }

    @Override
    public void ajustarVolumen() {
        System.out.println("Ajustando el volumen de la televisión");
    }

}
