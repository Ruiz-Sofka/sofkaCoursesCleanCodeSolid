package com.example.cleancode.dip;

public class Notificador {

    private ServicioNotificacion servicio;

    public Notificador(ServicioNotificacion servicio) {
        this.servicio = servicio;
    }

    public void enviarNotificacion(String mensaje) {
        servicio.enviar(mensaje);
    }

}
