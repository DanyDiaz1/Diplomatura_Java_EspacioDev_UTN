import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * 7. Realizar un algoritmo que permita cargar 10 valores por teclado y nos
		 * muestre posteriormente la suma de los valores ingresados y su promedio.
		 */
		Scanner teclado = new Scanner(System.in);
		int suma = 0;
		double promedio = 0;
		int contador = 0;
		
		while(contador<10) {
			System.out.println("Ingrese un valor");
			suma += teclado.nextInt();
			
			contador++;
		}
		
		System.out.println("El resultado de la suma es: "+ suma);
		
		promedio = suma / contador;
		
		System.out.println("El resultado del promedio es "+ promedio);

	}

}
