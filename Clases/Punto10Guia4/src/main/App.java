package main;
import clases.*;


public class App {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Juan","Juan@gmail.com",0.10);
		System.out.println("Id Cliente 1: " + c1.id);
		
		Cliente c2 = new Cliente("Roberto","roberto@gmail.com",0.30);
		System.out.println("Id Cliente 2: " + c2.id);
		
		System.out.println(c1);
		
		Factura f1 = new Factura(1500,c1);
		System.out.println(f1);
		f1.calcularMontoConDescuento();
		System.out.println(f1);
		
		Factura f2 = new Factura(5000,c2);
		f2.calcularMontoConDescuento();
		System.out.println(f2);
	}

}
