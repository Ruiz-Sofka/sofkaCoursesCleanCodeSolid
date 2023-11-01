package com.example.cleancode.dip;

public class ServicioEmail implements ServicioNotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación por correo electrónico: " + mensaje);
    }
}
