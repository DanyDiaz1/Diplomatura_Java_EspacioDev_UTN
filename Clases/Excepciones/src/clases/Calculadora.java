package clases;

import java.io.IOException;

public class Calculadora {
	
	
	public static void dividir(int numerador, int denominador)throws IOException {
		
		if(denominador==0) {
			throw new IOException();
		}
		int resultado = numerador/denominador;
		System.out.println(resultado);
	}
}
