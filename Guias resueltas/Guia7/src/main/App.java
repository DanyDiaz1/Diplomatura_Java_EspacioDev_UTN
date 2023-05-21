package main;

import ejercicio1.*;
import ejercicio2.*;
import ejercicio3.*;
import ejercicio4.*;
import ejercicio5.*;
import interfaces.*;

public class App {

	public static void main(String[] args) {

		// Ejercicio 1
		System.out.println("----------EJERCICIO 1-----------");
		Vehiculo coche = new Coche();
		coche.acelerar();
		coche.frenar();

		Vehiculo moto = new Moto();
		moto.acelerar();
		moto.frenar();

		Vehiculo camión = new Camion();
		camión.acelerar();
		camión.frenar();
		
		
		//Ejercicio 2
		System.out.println("----------EJERCICIO 2-----------");
		
		DispositivoElectronico reproductor1 = new ReproductorMP3();
        reproductor1.reproducir();
        reproductor1.pausar();
        reproductor1.detener();

        DispositivoElectronico reproductor2 = new ReproductorCD();
        reproductor2.reproducir();
        reproductor2.pausar();
        reproductor2.detener();

        DispositivoElectronico reproductor3 = new ReproductorVinilo();
        reproductor3.reproducir();
        reproductor3.pausar();
        reproductor3.detener();
        
        //Ejercicio 3
        System.out.println("----------EJERCICIO 3-----------");
        I_Conectividad teléfono = new Telefono();
        teléfono.conectarWifi();
        teléfono.conectarBluetooth();

        I_Conectividad tablet = new Tablet();
        tablet.conectarWifi();
        tablet.conectarBluetooth();

        I_Conectividad computadora = new Computadora();
        computadora.conectarWifi();
        computadora.conectarBluetooth();
        
        //Ejercicio 4
        System.out.println("----------EJERCICIO 4-----------");
        
        Empleado gerente = new Gerente();
        System.out.println("Salario del gerente: " + gerente.calcularSalario());
        System.out.println("Detalles del gerente: " + gerente.obtenerDetalles());

        Empleado desarrollador = new Desarrollador();
        System.out.println("Salario del desarrollador: " + desarrollador.calcularSalario());
        System.out.println("Detalles del desarrollador: " + desarrollador.obtenerDetalles());

        Empleado analista = new Analista();
        System.out.println("Salario del analista: " + analista.calcularSalario());
        System.out.println("Detalles del analista: " + analista.obtenerDetalles());
        
        //Ejercicio 5
		System.out.println("----------EJERCICIO 5-----------");

		I_Jugable juego = new Truco("Truco", 30);

		juego.iniciarJuego();
	}

}
