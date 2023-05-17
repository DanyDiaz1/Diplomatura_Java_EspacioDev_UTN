package main;
import ejercicio5.*;
import interfaces.I_Jugable;

public class App {

	public static void main(String[] args) {
		I_Jugable juego = new Truco("Truco",30);
		
		juego.iniciarJuego();
	}

}
