package adminArchivos;

import java.io.*;

public class ManejoArchivos {

	// CREAR ARCHIVO
	public static void crearArchivo(String nombreArchivo) {

		File archivo = new File(nombreArchivo);

		try {
			if (!archivo.exists()) {
				PrintWriter escritura = new PrintWriter(archivo);
				escritura.close();
				System.out.println("El archivo fue creado con exito");
			} else {
				System.out.println("El archivo " + nombreArchivo + " ya existe!");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	// ESCRIBIR ARCHIVO

	public static void escribirArchivo(String nombreArchivo, String contenido) {
		File archivo = new File(nombreArchivo);

		try {
			PrintWriter escritura = new PrintWriter(archivo);
			escritura.println(contenido);
			escritura.close();
			System.out.println("El archivo fue escrito con exito");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// AGREGAR INFORMACION

	public static void agregarInformacion(String nombreArchivo, String contenido) {
		File archivo = new File(nombreArchivo);

		try {
			PrintWriter escritura = new PrintWriter(new FileWriter(archivo, true));
			escritura.println(contenido);
			escritura.close();
			System.out.println("El archivo fue escrito con exito");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//LEER ARCHIVO
	
	public static void leerArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		
		try {
			BufferedReader lectura = new BufferedReader(new FileReader(archivo));
			String lineaActual = lectura.readLine();
			
			while(lineaActual!=null) {
				System.out.println(lineaActual);
				lineaActual=lectura.readLine();
			}
			
			lectura.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
