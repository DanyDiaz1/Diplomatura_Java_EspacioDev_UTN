package main;

import java.io.IOException;
import java.util.*;

import clases.Calculadora;
import excepciones.MenorDeEdadException;

public class App {

	public static void main(String[] args) throws MenorDeEdadException  {

		Scanner teclado = new Scanner(System.in);

		
		System.out.println("Ingrese una edad");
		int edad = teclado.nextInt();
		if(edad<18) {
			System.out.println("Sos menor de edad");
		}
		
		
		
			try {
				Calculadora.dividir(5, 0);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		

		try {
			int num1;
			int num2;
			System.out.println("Ingrese el primer numero");
			num1 = teclado.nextInt();
			System.out.println("Ingrese el segundo numero");
			num2 = teclado.nextInt();
			int resultado = num1 / num2;
			System.out.println(resultado);

		} catch (InputMismatchException ex) {
			System.out.println("Pusiste una letra en vez de un numero");
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Ocurrio un error inesperado");
		}

	}

}
