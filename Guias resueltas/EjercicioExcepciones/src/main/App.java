package main;

import clases.Cliente;
import excepciones.NotEnoughMoneyException;

public class App {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Marcos");
		c1.depositar(800);
		c1.imprimir();

		try {
			c1.extraer(500);
		} catch (NotEnoughMoneyException e) {
			e.printStackTrace();
		}
		
		c1.imprimir();
		
		try {
			c1.extraer(600);
		} catch (NotEnoughMoneyException e) {
			System.out.println(e.getMessage());
		}
	}

}
