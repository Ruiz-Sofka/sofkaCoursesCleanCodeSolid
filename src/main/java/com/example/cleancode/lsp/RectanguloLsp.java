package com.example.cleancode.lsp;

public class RectanguloLsp extends FormaLsp{

    private double longitud;
    private double ancho;

    public RectanguloLsp(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return longitud * ancho;
    }

}
