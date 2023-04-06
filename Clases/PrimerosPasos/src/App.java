import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int num1 = 5;

		int num2 = 2;

		int resultado = num1 * (num2 - 4);

		// System.out.println(resultado);

		int resto = num1 % 2;

		System.out.println("El valor del numero 1 es: " + num1 + "\n El valor del numero 2 es: " + num2
				+ "\n El valor del resto de la division es: " + resto);

		if (resto == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}

		// Suma en asignacion
		int a = 5;
		int b = 3;

		// a = a + 4;
		a *= b;

		System.out.println(a);

		int edad = 15;
		boolean vip = false;

		if (edad >= 18 || vip) {
			System.out.println("Puede ingresar");
		} else {
			System.out.println("No puede ingresar");
		}

		int contador = 0;
		contador++;

		System.out.println(contador);
		contador++;
		System.out.println(contador);

		contador--;
		System.out.println(contador);

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese su nombre: ");
		String nombre = teclado.nextLine();
		System.out.println("Ingresa tu edad");
		int edadUsuario = teclado.nextInt();
		

		System.out.println("El nombre que ingreso es: " + nombre + " Y su edad es: " + edadUsuario);
				

	}

}
