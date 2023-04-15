import java.util.Scanner;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		/*
		 * El juego del adivinador Definir un algoritmo que permita adivinar un número
		 * entre 1 y 100. El algoritmo deberá determinar al azar el número a adivinar
		 * (utilizar la clase Random de Java). El usuario deberá ingresar primero un
		 * número, si acertó, el sistema le informará por pantalla el acierto y luego
		 * terminará. Si el número ingresado por el usuario es mayor o menor que el que
		 * tiene que adivinar, el sistema lo informará por pantalla y continuará hasta
		 * que adivine.
		 */

		Scanner teclado = new Scanner(System.in);
		int numeroAleatorio = generarNumeroAleatorio();
		int numeroUsuario = 0;

		while (numeroUsuario != numeroAleatorio) {
			System.out.println("Ingresa un numero entre 1 y 100");
			numeroUsuario = teclado.nextInt();

			if (numeroUsuario > 1 && numeroUsuario < 100) {
				validarIgualdad(numeroUsuario, numeroAleatorio);
			} else {
				System.out.println("Ingresaste un numero fuera del rango");
			}

		}

	}
	
	
	
	static int generarNumeroAleatorio() {
		Random rnd = new Random();

		return rnd.nextInt(100) + 1;
	}

	static void validarIgualdad(int usuario, int maquina) {

		if (usuario == maquina) {
			System.out.println("Felicidades, Acertaste");

		} else if (usuario > maquina) {
			System.out.println("El numero que estas buscando es menor");

		} else {
			System.out.println("El numero que estas buscando es mayor");
		}
	}

}
