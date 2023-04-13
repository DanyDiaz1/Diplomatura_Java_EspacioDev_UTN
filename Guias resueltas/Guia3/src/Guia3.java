import java.util.Scanner;

public class Guia3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el ejercicio que quiere ver");
		int ejercicio = sc.nextInt();

		switch (ejercicio) {
		case 1: //Ejercicio 1
			System.out.println("Ingrese el primer numero");
			int num1 = sc.nextInt();
			System.out.println("Ingrese el segundo numero");
			int num2 = sc.nextInt();
			int resultado1 = suma(num1, num2);
			System.out.println("El resultado es: " + resultado1);
			break;

		case 2: //Ejercicio 2
			String nombre = sc.nextLine();
			darBienvenida(nombre);
			break;

		case 3: //Ejercicio 3
			System.out.println("Ingrese un numero");
			int num3 = sc.nextInt();
			boolean resultado2 = comprobarParidad(num3);
			System.out.println("El número es par: " + resultado2);
			break;

		case 4: //Ejercicio 4
			System.out.println("Ingrese la base");
			int num4 = sc.nextInt();
			System.out.println("Ingrese el exponente");
			int num5 = sc.nextInt();
			double resultado3 = potencia(num4, num5);
			System.out.println("El resultado es: " + resultado3);
			break;

		case 5: //Ejercicio 5
			int opcion = 0;
			
			while (opcion != 5) {
				System.out.println("Seleccione una opción:");
				System.out.println("1. Suma");
				System.out.println("2. Resta");
				System.out.println("3. Multiplicación");
				System.out.println("4. División");
				System.out.println("5. Salir");
				
				opcion = sc.nextInt();

				switch (opcion) {
				case 1: //Suma
					System.out.println("Ingrese el primer numero");
					int num6 = sc.nextInt();
					System.out.println("Ingrese el segundo numero");
					int num7 = sc.nextInt();
					int resultado4 = suma(num6, num7);
					System.out.println("El resultado es: " + resultado4);
					break;

				case 2: //Resta
					System.out.println("Ingrese el primer numero");
					int num8 = sc.nextInt();
					System.out.println("Ingrese el segundo numero");
					int num9 = sc.nextInt();
					int resultado5 = resta(num8, num9);
					System.out.println("El resultado es: " + resultado5);
					break;

				case 3: //Multiplicacion
					System.out.println("Ingrese el primer numero");
					int num10 = sc.nextInt();
					System.out.println("Ingrese el segundo numero");
					int num11 = sc.nextInt();
					int resultado6 = multiplicacion(num10, num11);
					System.out.println("El resultado es: " + resultado6);
					break;

				case 4: //Division
					System.out.println("Ingrese el primer numero");
					double num12 = sc.nextDouble();
					System.out.println("Ingrese el segundo numero");
					double num13 = sc.nextDouble();
					double resultado7 = division(num12, num13);
					System.out.println("El resultado es: " + resultado7);
					break;

				case 5: //Salir
					System.out.println("Saliendo de la calculadora...");
					break;

				default:
					System.out.println("Opción inválida. Por favor seleccione una opción válida.");
				}
			}
			break;

		default:
			System.out.println("Ejercicio inválido. Por favor seleccione un ejercicio válido.");
		}

	}
	
	

	public static int suma(int num1, int num2) {
		
		return num1 + num2;
	}
	

	public static void darBienvenida(String nombre) {
		
		System.out.println("¡Bienvenido/a, " + nombre + "!");
	}

	
	public static boolean comprobarParidad(int num) {
		
		return num % 2 == 0; //La expresion devuelve true o false
	}
	

	public static double potencia(int base, int exponente) {
		
		if(exponente==0) {
			//Todo numero elevado a la 0 es 1
			return 1;
		}else {
			
			int resultado=base;
			
			for(int i=1 ; i<exponente ; i++) {
				System.out.println(resultado);
				resultado=resultado*base;
			}
			return resultado;
		}
		
	}
	

	public static int resta(int num1, int num2) {
		
		return num1 - num2;
	}

	public static int multiplicacion(int num1, int num2) {
		
		return num1 * num2;
	}

	public static double division(double num1, double num2) {
		
		if (num2 == 0) {
			
			System.out.println("No se puede dividir por cero.");
			
			return 0;
		} else {
			
			return num1 / num2;
		}
	}

}
