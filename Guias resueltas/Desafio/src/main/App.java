package main;
import clases.*;

public class App {

	public static void main(String[] args) {
		
		Raton ratonHP = new Raton("Cable","HP");
		Teclado tecladoHP = new Teclado("Bluetooth","HP");
		Monitor monitorSamsung = new Monitor("Samsung",29);

		Computadora compuBasica = new Computadora("Basic",monitorSamsung,tecladoHP,ratonHP);
		
		Orden orden1 = new Orden();
		orden1.agregarComputadora(compuBasica);
		
		
		Raton ratonGamer = new Raton("Bluetooth","Red Dragon");
		Teclado tecladoGamer = new Teclado("Bluetooth","Red Dragon");
		Monitor monitorGamer = new Monitor("Asus",40);

		Computadora compuGamer = new Computadora("Gamer",monitorGamer,tecladoGamer,ratonGamer);
		orden1.agregarComputadora(compuGamer);
		
		orden1.mostrarOrden();
		
		Orden orden2 = new Orden();
		orden2.agregarComputadora(compuGamer);
		orden2.mostrarOrden();
	}

}
