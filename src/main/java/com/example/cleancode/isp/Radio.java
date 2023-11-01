package com.example.cleancode.isp;

public class Radio implements Encendible {

    @Override
    public void encender() {
        System.out.println("Encendiendo la radio");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando la radio");
    }

}
