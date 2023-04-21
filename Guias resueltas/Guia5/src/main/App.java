package main;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		/*
		 * 5. Crea un programa que declare un array estático de enteros y luego lo
		 * inicialice con algunos valores. Luego, utiliza un bucle for para encontrar el
		 * valor máximo del array. (Sin utilizar la clase Math)
		 */

		int numeros[] = { 6, 3, 9, 8, 2, 4 };
		
		Arrays.sort(numeros);
		
		for(int i=0 ; i<numeros.length ; i++) {
			System.out.println(numeros[i]);
		}

		int numeroMayor = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
			
			if(numeros[i]>numeroMayor) {
				numeroMayor=numeros[i];
			}
		}
		
		System.out.println("El numero mayor del arreglo es: "+ numeroMayor);

	}

}
