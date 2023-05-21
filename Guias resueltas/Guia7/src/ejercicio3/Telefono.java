package ejercicio3;

import interfaces.I_Conectividad;

public class Telefono implements I_Conectividad {
	// Implementación de los métodos de la interfaz para Teléfono
	
	public void conectarWifi() {
		System.out.println("Teléfono: Conectando al wifi...");
	}

	
	public void conectarBluetooth() {
		System.out.println("Teléfono: Conectando al bluetooth...");
	}
}
