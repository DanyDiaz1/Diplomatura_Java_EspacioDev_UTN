package ejercicio2;

import interfaces.I_ReproductorMusical;

public abstract class DispositivoElectronico implements I_ReproductorMusical{
	
	// Implementación básica de los métodos de la interfaz
    public void reproducir() {
        System.out.println("Reproduciendo música...");
    }

    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void detener() {
        System.out.println("Deteniendo música...");
    }
}
