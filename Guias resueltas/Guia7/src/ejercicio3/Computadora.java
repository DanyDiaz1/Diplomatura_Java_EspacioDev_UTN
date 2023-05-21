package ejercicio3;

import interfaces.I_Conectividad;

public class Computadora implements I_Conectividad{

	// Implementación de los métodos de la interfaz para Computadora
	public void conectarWifi() {
		System.out.println("Computadora: Conectando al wifi...");
	}

	public void conectarBluetooth() {
		System.out.println("Computadora: Conectando al bluetooth...");
	}
}
