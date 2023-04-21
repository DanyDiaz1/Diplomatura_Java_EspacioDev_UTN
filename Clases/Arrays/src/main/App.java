package main;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese que tamanio quiere que tenga el arreglo:");
		int tamanioArreglo=teclado.nextInt();
		int edades[]= new int[tamanioArreglo];
		
		
		for(int i=0; i<edades.length ; i++) {
			System.out.println("Ingrese el valor en la posicion: "+i);
			edades[i]=teclado.nextInt();
		}
		
		
		for(int i=0; i<edades.length ; i++) {
			System.out.println("El valor de la posicion "+ i + " es: "+ edades[i]);
		}
		
		
		
		/*int i=0;
		
		while(i<edades.length) {
			System.out.println("Ingrese el valor en la posicion: "+i);
			edades[i] = teclado.nextInt();
			i++;
		}
		
		i=0;
		
		while(i<edades.length) {
			System.out.println("El valor de la posicion "+ i + " es: "+ edades[i]);
			i++;
		}*/
		
	}

}
