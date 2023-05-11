package main;

import clases.*;

public class App {

	public static void main(String[] args) {

		Raton ratonHP = new Raton("Cable", "HP", 1000);
		Teclado tecladoHP = new Teclado("Bluetooth", "HP", 5000);
		Monitor monitorSamsung = new Monitor("Samsung", "Video", 29, 20000);
		Parlante parlanteEdifier = new Parlante("Edifier", "Audio", 50, 6000);

		Computadora compuBasica = new Computadora("Basic", tecladoHP, ratonHP, parlanteEdifier);
		compuBasica.agregarMonitor(monitorSamsung);

		Orden orden1 = new Orden();
		orden1.agregarComputadora(compuBasica);

		Raton ratonGamer = new Raton("Bluetooth", "Red Dragon", 10000);
		Teclado tecladoGamer = new Teclado("Bluetooth", "Red Dragon", 17000);
		Monitor monitorGamer = new Monitor("Asus", "Video", 40, 50000);
		Parlante parlanteSony = new Parlante("Sony", "Audio", 90, 14000);

		Computadora compuGamer = new Computadora("Gamer", tecladoGamer, ratonGamer, parlanteSony);
		compuGamer.agregarMonitor(monitorGamer);
		compuGamer.agregarMonitor(monitorGamer);
		compuGamer.agregarMonitor(monitorGamer);
		orden1.agregarComputadora(compuGamer);

		orden1.mostrarOrden();

		Orden orden2 = new Orden();
		orden2.agregarComputadora(compuGamer);
		orden2.mostrarOrden();
	}

}
