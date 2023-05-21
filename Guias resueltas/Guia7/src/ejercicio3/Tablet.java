package ejercicio3;

import interfaces.I_Conectividad;

public class Tablet implements I_Conectividad{
	
	// Implementación de los métodos de la interfaz para Tablet
    public void conectarWifi() {
        System.out.println("Tablet: Conectando al wifi...");
    }

    public void conectarBluetooth() {
        System.out.println("Tablet: Conectando al bluetooth...");
    }
}
