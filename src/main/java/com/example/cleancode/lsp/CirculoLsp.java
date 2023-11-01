package com.example.cleancode.lsp;

public class CirculoLsp extends FormaLsp {

    private double radio;

    public CirculoLsp(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

}
