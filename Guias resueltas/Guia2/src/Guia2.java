import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Guia2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in).useLocale(Locale.US); //useLocale se utiliza para poder ingresar numeros decimales sin errores.

		String seguir;
		int ejercicio;

		do {
			System.out.println("Ingrese el ejercicio que desea ver [1-14]");
			ejercicio = teclado.nextInt();

			switch (ejercicio) {

			case 1: // Ejercicio 1
				System.out.println("Ingrese la calificación del primer examen: ");
				int calif1 = teclado.nextInt();

				System.out.println("Ingrese la calificación del segundo examen: ");
				int calif2 = teclado.nextInt();

				System.out.println("Ingrese la calificación del tercer examen: ");
				int calif3 = teclado.nextInt();

				int promedio = (calif1 + calif2 + calif3) / 3;

				if (promedio >= 6) {
					System.out.println("El alumno ha aprobado el curso con un promedio de " + promedio);
				} else {
					System.out.println("El alumno ha reprobado el curso con un promedio de " + promedio);
				}

				break;
				
			case 2: // Ejercicio 2

				System.out.println("Ingrese el monto de la compra: ");
				int monto = teclado.nextInt();

				double descuento = 0;

				if (monto > 5000) {
					descuento = monto * 0.20;
				}

				double precioFinal = monto - descuento;

				System.out.println("El precio final de la compra es: " + precioFinal);

				break;
				
			case 3: //Ejercicio 3

				System.out.println("Ingrese la cantidad de camisas que desea comprar: ");
				int cantidad = teclado.nextInt();

				System.out.println("Ingrese el precio unitario de las camisas: ");
				double precioUnitario = teclado.nextDouble();

				double descuento1 = 0;
				double subtotal = cantidad * precioUnitario;

				if (cantidad >= 3) {
					descuento1 = subtotal * 0.20;
				} else {
					descuento1 = subtotal * 0.10;
				}

				double total = subtotal - descuento1;

				System.out.println("El total a pagar por la compra de camisas es: " + total);

				break;
				
			case 4: //Ejercicio 4

				System.out.println("Ingrese el primer número: ");
				int num1 = teclado.nextInt();

				System.out.println("Ingrese el segundo número: ");
				int num2 = teclado.nextInt();

				int resultado = 0;

				if (num1 == num2) {
					resultado = num1 * num2;
				} else if (num1 > num2) {
					resultado = num1 - num2;
				} else {
					resultado = num1 + num2;
				}

				System.out.println("El resultado de la operación es: " + resultado);

				break;
				
			case 5: //Ejercicio 5

				System.out.println("Ingrese el primer número: ");
				int numero1 = teclado.nextInt();

				System.out.println("Ingrese el segundo número: ");
				int numero2 = teclado.nextInt();

				System.out.println("Ingrese el tercer número: ");
				int numero3 = teclado.nextInt();

				if (numero1 > numero2 && numero1 > numero3) {
					System.out.println("El número mayor es: " + numero1);
				} else if (numero2 > numero1 && numero2 > numero3) {
					System.out.println("El número mayor es: " + numero2);
				} else {
					System.out.println("El número mayor es: " + numero3);
				}

				break;

			case 6: //Ejercicio 6

				int num = 1;

				while (num <= 20) {

					if (num % 2 != 0) {
						System.out.print(num + " ");
					}

					num++;
				}

				break;
				
			case 7: //Ejercicio 7

				int suma = 0;
				int valor;
				int contador = 1;

				while (contador <= 10) {
					System.out.print("Ingrese un valor: ");
					valor = teclado.nextInt();
					suma += valor;
					contador++;
				}

				double prom = (double) suma / 10;

				System.out.println("La suma de los valores es: " + suma);
				System.out.println("El promedio de los valores es: " + prom);

				break;
				
			case 8: //Ejercicio 8

				System.out.print("Ingrese la cantidad de piezas a procesar: ");
				int n = teclado.nextInt();

				int cont = 0;

				while (n > 0) {
					System.out.print("Ingrese la longitud del perfil en metros: ");
					double longitud = teclado.nextDouble();

					if (longitud >= 1.20 && longitud <= 1.30) {
						cont++;
					}

					n--;
				}

				System.out.println("La cantidad de piezas aptas es: " + cont);

				break;
				
			case 9: //Ejercicio 9

				int varNum;
				int cantDigitos;

				do {
					System.out.print("Ingrese un número entre 0 y 999 (0 para salir): ");
					varNum = teclado.nextInt();

					if (varNum == 0) {
						System.out.println("¡Hasta pronto!");
						break;
					}

					if (varNum < 10) {
						cantDigitos = 1;
					} else if (varNum < 100) {
						cantDigitos = 2;
					} else if (varNum < 1000) {
						cantDigitos = 3;
					} else {
						continue;
					}

					System.out.println("El número ingresado tiene " + cantDigitos + " dígitos.");

				} while (varNum != 0);

				break;
				
			case 10: //Ejercicio 10
				
				 double peso;
			        int cantPiezasEntre98y102 = 0;
			        int cantPiezasMasDe102 = 0;
			        int cantPiezasMenosDe98 = 0;
			        int cantTotalPiezas = 0;

			        do {
			            System.out.print("Ingrese el peso de la pieza en Kg (0 para salir): ");
			            peso = teclado.nextDouble();

			            if (peso == 0) {
			                System.out.println("¡Hasta pronto!");
			                break;
			            }

			            cantTotalPiezas++;

			            if (peso >= 9.8 && peso <= 10.2) {
			                cantPiezasEntre98y102++;
			            } else if (peso > 10.2) {
			                cantPiezasMasDe102++;
			            } else {
			                cantPiezasMenosDe98++;
			            }

			        } while (peso != 0);

			        System.out.println("Cantidad de piezas con peso entre 9.8Kg y 10.2Kg: " + cantPiezasEntre98y102);
			        System.out.println("Cantidad de piezas con peso más de 10.2Kg: " + cantPiezasMasDe102);
			        System.out.println("Cantidad de piezas con peso menos de 9.8Kg: " + cantPiezasMenosDe98);
			        System.out.println("Cantidad total de piezas procesadas: " + cantTotalPiezas);
				
				break;
				
			case 11: //Ejercicio 11
				
				 int sum = 0;
			        int cant = 10; // cantidad de valores a ingresar
			        for (int i = 0; i < cant; i++) {
			            System.out.print("Ingrese un valor: ");
			            int value = teclado.nextInt();
			            sum += value;
			        }
			        double avg = (double) sum / cant;
			        System.out.println("La suma de los valores ingresados es: " + sum);
			        System.out.println("El promedio de los valores ingresados es: " + avg);
				
				break;
				
			case 12: //Ejercicio 12
				
				int numAlumnos = 10;
		        int nota;
		        int notasMayores = 0;
		        int notasMenores = 0;

		        for (int i = 1; i <= numAlumnos; i++) {
		            System.out.print("Ingrese la nota del alumno " + i + ": ");
		            nota = teclado.nextInt();

		            if (nota >= 7) {
		                notasMayores++;
		            } else {
		                notasMenores++;
		            }
		        }

		        System.out.println("Notas mayores o iguales a 7: " + notasMayores);
		        System.out.println("Notas menores a 7: " + notasMenores);
				
				break;
				
			case 13: //Ejercicio 13
				
				 int numMult;
			        
			        System.out.print("Ingrese el número a multiplicar: ");
			        numMult = teclado.nextInt();
			        
			        for(int i=1; i<=10; i++){
			            System.out.println(numMult + " x " + i + " = " + numMult*i);
			        }
				
				break;
				
			case 14: //Ejercicio 14 (Extra)
				
				Random rnd = new Random();
		        int numAdivinar = rnd.nextInt(100)+1; // número aleatorio entre 1 y 100
		        int numUsuario = 0;
		        int cantIntentos = 0;

		        while (numUsuario != numAdivinar) {
		            System.out.print("Ingresa un número entre 1 y 100: ");
		            numUsuario = teclado.nextInt();

		            if (numUsuario == numAdivinar) {
		                System.out.println("¡Felicitaciones! Adivinaste el número.");
		            } else if (numUsuario < numAdivinar) {
		                System.out.println("El número que buscas es mayor.");
		                cantIntentos++;
		            } else {
		                System.out.println("El número que buscas es menor.");
		                cantIntentos++;
		            }
		        }
		        
		        System.out.println("Acertaste en " + cantIntentos + " intentos");
				
				break;

			default:
				System.out.println("Numero de operacion incorrecto");
				break;
			}

			System.out.println("Desea ver otro ejercicio? [s/n]");
			teclado.nextLine();
			seguir = teclado.nextLine();

		} while (seguir.equals("s"));

	}

}
