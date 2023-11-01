package com.example.cleancode;

import com.example.cleancode.dip.Notificador;
import com.example.cleancode.dip.ServicioEmail;
import com.example.cleancode.dip.ServicioSMS;
import com.example.cleancode.isp.Radio;
import com.example.cleancode.isp.Television;
import com.example.cleancode.lsp.CalculadoraArea;
import com.example.cleancode.lsp.CirculoLsp;
import com.example.cleancode.lsp.FormaLsp;
import com.example.cleancode.lsp.RectanguloLsp;
import com.example.cleancode.ocp.Descuento;
import com.example.cleancode.ocp.DescuentoMontoFijo;
import com.example.cleancode.ocp.DescuentoPorcentaje;
import com.example.cleancode.srp.Circulo;
import com.example.cleancode.srp.Rectangulo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CleancodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleancodeApplication.class, args);
		// Ejemplo de uso SRP
		Circulo circulo = new Circulo(5.0);
		Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

		System.out.println("Área del círculo: " + circulo.calcularArea());
		System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

		// Ejemplo de uso OCP
		double precioInicial = 100.0;

		Descuento descuento10Porciento = new DescuentoPorcentaje(10.0);
		double precioConDescuentoPorcentaje = descuento10Porciento.aplicarDescuento(precioInicial);
		System.out.println("Precio con 10% de descuento: " + precioConDescuentoPorcentaje);

		Descuento descuento20MontoFijo = new DescuentoMontoFijo(20.0);
		double precioConDescuentoMontoFijo = descuento20MontoFijo.aplicarDescuento(precioInicial);
		System.out.println("Precio con descuento de 20%: " + precioConDescuentoMontoFijo);


		// Ejemplo de uso LSP
		CirculoLsp circuloLsp = new CirculoLsp(5.0);
		RectanguloLsp rectanguloLsp = new RectanguloLsp(4.0, 6.0);

		FormaLsp[] formas = {circuloLsp, rectanguloLsp};

		CalculadoraArea calculadora = new CalculadoraArea();
		double areaTotal = calculadora.calcularAreaTotal(formas);

		System.out.println("Área total de las formas: " + areaTotal);

		// Ejemplo de uso ISP
		Television television = new Television();
		Radio radio = new Radio();

		// Operaciones de encendido y apagado en ambas clases
		television.encender();
		television.apagar();

		radio.encender();
		radio.apagar();

		// Operación de ajuste de volumen solo en Televisión
		television.ajustarVolumen();

		// Ejemplo de uso DIP
		ServicioEmail servicioEmail = new ServicioEmail();
		ServicioSMS servicioSMS = new ServicioSMS();

		Notificador notificadorEmail = new Notificador(servicioEmail);
		Notificador notificadorSMS = new Notificador(servicioSMS);

		notificadorEmail.enviarNotificacion("¡Hola! Este es un correo de prueba.");
		notificadorSMS.enviarNotificacion("Este es un mensaje SMS de prueba.");

	}

}
