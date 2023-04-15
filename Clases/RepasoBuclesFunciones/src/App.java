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
		Random rnd = new Random();
		int numeroAleatorio = rnd.nextInt(100) + 1;
		int numeroUsuario = 0;
		int contadorIntentos = 1;

		while (numeroUsuario != numeroAleatorio) {

			System.out.println("Ingresa un numero");
			numeroUsuario = teclado.nextInt();

			if (numeroUsuario > 0 && numeroUsuario < 100) {

				if (numeroUsuario == numeroAleatorio) {
					System.out.println("Felicidades, Acertaste con " + contadorIntentos + " intentos");

				} else if (numeroUsuario > numeroAleatorio) {
					System.out.println("El numero que estas buscando es menor");
					contadorIntentos++;

				} else {
					System.out.println("El numero que estas buscando es mayor");
					contadorIntentos++;
				}

			} else {

				System.out.println("Ingresaste numeros fuera del rango solicitado");
			}

		}

	}
}
