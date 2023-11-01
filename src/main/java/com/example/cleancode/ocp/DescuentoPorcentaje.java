package com.example.cleancode.ocp;

public class DescuentoPorcentaje implements Descuento{

    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - (precio * (porcentaje / 100));
    }

}
