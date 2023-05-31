package main;

import java.io.IOException;
import java.util.*;

import clases.Calculadora;
import excepciones.MenorDeEdadException;

public class App {

	public static void main(String[] args) throws MenorDeEdadException  {

		Scanner teclado = new Scanner(System.in);
		

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
			ex.printStackTrace();
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Ocurrio un error inesperado");
		}

	}

}
