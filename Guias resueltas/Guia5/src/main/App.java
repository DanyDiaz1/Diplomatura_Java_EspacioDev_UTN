package main;

import java.util.Scanner;
import java.util.Arrays;
import clases.*;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("---------------EJERCICIO 1---------------");

		/*
		 * 1. Crea un programa que declare un array estático de enteros y luego lo
		 * inicialice con los valores del 1 al 10. Luego, utiliza un bucle for para
		 * imprimir cada valor del array en una línea separada.
		 */

		// Declarar y inicializar el array
		int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Imprimir los valores del array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		System.out.println("---------------EJERCICIO 2---------------");

		/*
		 * 2. Crea un programa que declare un array estático de strings y luego lo
		 * inicialice con algunos nombres de frutas. Luego, utiliza un bucle for para
		 * imprimir cada valor del array en una línea separada.
		 */

		// Declarar y inicializar el array
		String frutas[] = { "Manzana", "Banana", "Naranja", "Pera" };

		// Imprimir los valores del array
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}

		System.out.println("---------------EJERCICIO 3---------------");

		/*
		 * 3. Crea un programa que declare un array estático de doubles y luego lo
		 * inicialice con 5 valores. Luego, utiliza un bucle for para calcular la suma
		 * de todos los valores del array.
		 */

		// Declarar y inicializar el array
		double numerosDoubles[] = { 1.5, 2.7, 3.2, 4.8, 5.1 };

		// Calcular la suma de los valores del array
		double suma = 0;
		for (int i = 0; i < numerosDoubles.length; i++) {
			suma += numerosDoubles[i];
		}

		// Imprimir la suma de los valores del array
		System.out.println("La suma de los valores del array es: " + suma);

		System.out.println("---------------EJERCICIO 4---------------");
		/*
		 * 4. Crea un programa que declare un array estático de objetos de tipo
		 * "Persona" (una clase que has creado previamente con propiedades como nombre,
		 * edad, etc.). Luego, inicializa el array con algunas instancias de "Persona".
		 * Luego, utiliza un bucle for para imprimir los detalles de cada persona en el
		 * array.
		 */

		// Declarar y inicializar el array
		Persona personas[] = { new Persona("Juan", 25), new Persona("María", 30), new Persona("Pedro", 40) };

		// Imprimir los detalles de cada persona en el array
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Nombre: " + personas[i].nombre + ", Edad: " + personas[i].edad);
		}

		System.out.println("---------------EJERCICIO 5---------------");
		/*
		 * 5. Crea un programa que declare un array estático de enteros y luego lo
		 * inicialice con algunos valores. Luego, utiliza un bucle for para encontrar el
		 * valor máximo del array. (Sin utilizar la clase Math)
		 */

		int numeros3[] = { 6, 3, 9, 8, 2, 4 };

		for (int i = 0; i < numeros3.length; i++) {
			System.out.println(numeros3[i]);
		}

		int numeroMayor = numeros3[0];

		for (int i = 1; i < numeros3.length; i++) {

			if (numeros3[i] > numeroMayor) {
				numeroMayor = numeros3[i];
			}
		}

		System.out.println("El numero mayor del arreglo es: " + numeroMayor);

		System.out.println("---------------EJERCICIO 6---------------");
		/*
		 * 6. Crea un programa que declare un array estático de strings y luego lo
		 * inicialice con algunas palabras. Luego, utiliza un bucle for para encontrar
		 * la palabra más larga en el array. (Utilizar el método length() de la clase
		 * String)
		 */

		// Declarar y inicializar el array
		String[] palabras = { "Hola", "Mundo", "Programación", "Java", "Lenguaje", "Computadora" };

		// Encontrar la palabra más larga en el array
		String palabraMasLarga = "";
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].length() > palabraMasLarga.length()) {
				palabraMasLarga = palabras[i];
			}
		}

		// Imprimir la palabra más larga en el array
		System.out.println("La palabra más larga en el array es: " + palabraMasLarga);

		System.out.println("---------------EJERCICIO 7---------------");
		/*
		 * 7. Crea un programa que declare dos arrays estáticos de enteros del mismo
		 * tamaño y luego los inicialice con 5 valores a cada uno. Luego, utiliza un
		 * bucle for para calcular la suma de los valores en cada posición de los dos
		 * arrays y almacenar los resultados en un tercer array estático.
		 */
		// Declarar y inicializar los arrays
		int numeros1[] = { 1, 2, 3, 4, 5 };
		int numeros2[] = { 6, 7, 8, 9, 10 };
		int sumas[] = new int[5];

		// Calcular la suma de los valores en cada posición de los dos arrays
		for (int i = 0; i < sumas.length; i++) {
			sumas[i] = numeros1[i] + numeros2[i];
		}

		// Imprimir el array de sumas
		System.out.println("Array de suma:");
		for (int i = 0; i < sumas.length; i++) {
			System.out.print(sumas[i] + " ");
		}

		System.out.println("---------------EJERCICIO 8---------------");
		/*
		 * 8. Crea un programa que declare un array estático de objetos de tipo "Coche"
		 * (una clase que has creado previamente con propiedades como marca, modelo,
		 * etc.). Luego, inicializa el array con algunas instancias de "Coche". Luego,
		 * utiliza un bucle for para imprimir los detalles de cada coche en el array,
		 * pero solo aquellos que tienen una marca determinada. (Utilizar método
		 * equals() de la clase String)
		 */

		// Declarar y inicializar el array de Coches
		Coche coches[] = { new Coche("Ford", "Fiesta", 2018), new Coche("Renault", "Clio", 2017),
				new Coche("Ford", "Focus", 2020), new Coche("Peugeot", "308", 2019), new Coche("Audi", "A3", 2022) };

		// Marca determinada
		String marcaBuscada = "Ford";

		// Imprimir los detalles de cada coche que tenga la marca determinada
		for (int i = 0; i < coches.length; i++) {
			Coche cocheActual = coches[i];

			if (cocheActual.marca.equals(marcaBuscada)) {
				System.out.println("Marca: " + cocheActual.marca + ", Modelo: " + cocheActual.modelo + ", Año: "
						+ cocheActual.anio);
			}
		}

		System.out.println("---------------EJERCICIO 9---------------");

		/*
		 * 9. Escribe un programa que solicite al usuario que ingrese una cadena de
		 * caracteres y luego imprima en pantalla la misma cadena, pero en orden
		 * inverso. Por ejemplo, si el usuario ingresa la cadena "Hola, mundo!", el
		 * programa deberá imprimir "!odnum ,aloH". (Investigar y utilizar el método
		 * toCharArray() de la clase String)
		 */

		System.out.print("Ingrese una cadena de caracteres: ");
		String cadena = scanner.nextLine();

		char caracteres[] = cadena.toCharArray();

		System.out.print("Cadena invertida: ");
		for (int i = caracteres.length - 1; i >= 0; i--) {
			System.out.print(caracteres[i]);
		}

		System.out.println("---------------EJERCICIO 10---------------");
		/*
		 * 10. Crea un programa que declare dos arrays estáticos de enteros del mismo
		 * tamaño y luego los inicialice con algunos valores. Luego, utiliza un bucle
		 * for para calcular el producto de los valores en cada posición de los dos
		 * arrays y almacenar los resultados en un tercer array estático.
		 */

		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = { 6, 7, 8, 9, 10 };
		int resultado[] = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			resultado[i] = array1[i] * array2[i];
		}

		System.out.println("El resultado es: ");
		for (int i = 0; i < resultado.length; i++) {
			System.out.print(resultado[i] + " ");
		}

		System.out.println("---------------EJERCICIO 11---------------");
		/*
		 * 11. Crea un programa que declare un array estático de objetos de tipo
		 * "Animal" (una clase que has creado previamente con propiedades como especie,
		 * tamaño, etc.). Luego, inicializa el array con algunas instancias de "Animal".
		 * Luego, utiliza un bucle for para imprimir los detalles de cada animal en el
		 * array, pero solo aquellos que son de una especie determinada.
		 */

		Animal animales[] = { new Animal("Perro", "Mediano"), new Animal("Gato", "Pequeño"),
				new Animal("Loro", "Pequeño"), new Animal("Caballo", "Grande") };

		String especieBuscada = "Gato";
		System.out.println("Los animales de la especie " + especieBuscada + " son:");
		for (Animal animal : animales) {
			if (animal.especie.equals(especieBuscada)) {
				System.out.println(animal.toString());
			}
		}

		System.out.println("---------------EJERCICIO 12---------------");
		/*
		 * 12. Crea un programa que declare un array estático de enteros y luego lo
		 * inicialice con 5 valores. Luego, utiliza un bucle for para calcular el
		 * promedio de los valores en el array
		 */

		int numeros4[] = { 10, 20, 30, 40, 50 };
		double promedio = 0.0;
		for (int i = 0; i < numeros4.length; i++) {
			promedio += numeros4[i];
		}
		promedio /= numeros4.length;
		System.out.println("El promedio es: " + promedio);

		System.out.println("---------------EJERCICIO 13---------------");
		/*
		 * 13. Crea un programa que declare un array estático de objetos de tipo "Libro"
		 * (una clase que has creado previamente con propiedades como título, autor,
		 * etc.). Luego, inicializa el array con algunas instancias de "Libro". Luego,
		 * utiliza un bucle for para imprimir los detalles de cada libro en el array,
		 * pero solo aquellos cuyo autor es de un país determinado.
		 */
		// Crear algunos autores
		Autor autor1 = new Autor("Gabriel Garcia Marquez", "Colombia");
		Autor autor2 = new Autor("Jorge Luis Borges", "Argentina");
		Autor autor3 = new Autor("Pablo Neruda", "Chile");

		// Crear algunos libros
		Libro libro1 = new Libro("Cien años de soledad", autor1);
		Libro libro2 = new Libro("El Aleph", autor2);
		Libro libro3 = new Libro("Veinte poemas de amor y una cancion desesperada", autor3);
		Libro libro4 = new Libro("El coronel no tiene quien le escriba", autor1);

		Libro biblioteca[] = { libro1, libro2, libro3, libro4 };

		String paisBuscado = "Colombia";

		for (Libro libro : biblioteca) {
			Autor autor = libro.autor;
			if (autor.pais.equals(paisBuscado)) {
				System.out.println(libro.titulo + " - " + autor.nombre);
			}
		}

		System.out.println("---------------EJERCICIO 14---------------");
		/*
		 * 14. Crea un programa que declare un array estático de strings y luego lo
		 * inicialice con algunas palabras. Luego, utiliza un bucle for para eliminar
		 * todas las palabras que tienen menos de cuatro letras del array y luego
		 * imprime el nuevo array resultante.
		 */
		String[] palabras1 = {"Hola", "mundo", "de", "programación", "en", "Java"};
        int nuevoTamano = 0;
        
        for (int i = 0; i < palabras1.length; i++) {
            if (palabras1[i].length() >= 4) {
                nuevoTamano++;
            }
        }
        
        String[] nuevoArray = new String[nuevoTamano];
        int j = 0;
        
        for (int i = 0; i < palabras1.length; i++) {
            if (palabras1[i].length() >= 4) {
                nuevoArray[j] = palabras1[i];
                j++;
            }
        }
        
        // Imprimir el nuevo array
        for (int i = 0; i < nuevoArray.length; i++) {
            System.out.println(nuevoArray[i]);
        }
	}

}
