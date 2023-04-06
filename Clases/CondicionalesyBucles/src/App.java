import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero = 0;

		if (numero > 0) {
			System.out.println("El numero es positivo");
		} else if (numero < 0) {
			System.out.println("El numero es negativo");
		} else {
			System.out.println("El numero es 0");
		}

		int promedio = 7;

		if (promedio > 8) {
			System.out.println("Promociona");
		} else if (promedio < 6) {
			System.out.println("Desaprueba");
		} else if (promedio > 6 && promedio < 8) {
			System.out.println("Aprobo");
		}

		System.out.println("Ingrese el ejercicio que quiere ver");
		int opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Ejecutando el ejercicio 1");
			break;
		case 2:
			System.out.println("Ejecutando el ejercicio 2");
			break;
		case 3:
			System.out.println("Ejecutando el ejercicio 3");
			break;
		default:

			System.out.println("Marco un numero invalido");
			break;
		}

		int i = 0;
		boolean seguir = true;

		while (i < 10 && seguir == true) {
			System.out.println("El valor de i es: " + i);
			System.out.println("Queres seguir?");
			seguir = teclado.nextBoolean();
			i++;
		}

		int ejercicio = 0;

		do {
			System.out.println("Ingrese el ejercicio que quiere ver");
			ejercicio=teclado.nextInt();
			switch (ejercicio) {
			case 1:
				System.out.println("Ejercicio 1");
				break;
			case 2:
				System.out.println("Ejercicio 2");
				break;

			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}while (ejercicio != 0);
		
		System.out.println("Ingresa que tabla queres ver");
		int resultado=0;
		int tabla = teclado.nextInt();
		
		for(int j=1 ; j<=10 ; j++) {
			resultado=tabla*j;
			System.out.println(tabla + "X" + j + "=" + resultado);
			if(resultado==30) {
				continue;
			}
			System.out.println("Pasando al siguiente ciclo");
		}

	}
}
