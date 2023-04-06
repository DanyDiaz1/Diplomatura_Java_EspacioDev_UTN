import java.util.Scanner;

public class Guia1 {

	public static void main(String[] args) {

		
		// Ejercicio 1
		
		int num1 = 10;
		int num2 = 20;
		int resultado = num1 + num2;
		System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + resultado);

		
		// Ejercicio 2
		
		int base = 10;
		int altura = 5;
		int area = base * altura;
		System.out.println("El área de un rectángulo de base " + base + " y altura " + altura + " es igual a " + area);

		
		// Ejercicio 3
		
		int numero = 10;
		numero += 5;
		System.out.println("El número " + numero + " incrementado en 5 es igual a " + numero);

		
		// Ejercicio 4
		
		int a = 15;
		int b = 10;
		if (a > b) {
			System.out.println("La primera variable es mayor que la segunda");
		}

		
		// Ejercicio 5
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		int num = input.nextInt();
		if (num > 0 && num % 2 == 0) {
			System.out.println("El número ingresado es positivo y par");
		}

		
		// Ejercicio 6
		
		System.out.print("Ingrese su nombre: ");
		String nombre = input.next();
		System.out.println("Hola, " + nombre);

		
		// Ejercicio 7
		
		System.out.print("Ingrese un número decimal: ");
		double decimal = input.nextDouble();
		int entero = (int) decimal;
		System.out.println("El número decimal " + decimal + " convertido a entero es: " + entero);

		
		// Ejercicio 8
		
		int valor = 10;
		valor *= 5;
		System.out.println("El valor de la variable multiplicado por 5 es igual a " + valor);

		
		// Ejercicio 9
		
		System.out.print("Ingrese su edad: ");
		int edad = input.nextInt();
		if (edad >= 18 && edad <= 30) {
			System.out.println("Cumple los requisitos");
		}

		
		// Ejercicio 10
		
		System.out.print("Ingrese su nombre: ");
		String nombre2 = input.next();
		System.out.print("Ingrese su edad: ");
		int edad2 = input.nextInt();
		System.out.print("Ingrese su correo electrónico: ");
		String correo = input.next();
		System.out.println("Nombre: " + nombre2);
		System.out.println("Edad: " + edad2);
		System.out.println("Correo electrónico: " + correo);

		input.close();
	}
}
