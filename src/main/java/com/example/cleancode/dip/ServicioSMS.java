package com.example.cleancode.dip;

public class ServicioSMS implements ServicioNotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación por SMS: " + mensaje);
    }
}
