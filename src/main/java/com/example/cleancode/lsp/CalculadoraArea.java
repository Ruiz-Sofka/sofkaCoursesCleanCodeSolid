package com.example.cleancode.lsp;

public class CalculadoraArea {
    public double calcularAreaTotal(FormaLsp[] formas) {
        double areaTotal = 0.0;
        for (FormaLsp forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
}