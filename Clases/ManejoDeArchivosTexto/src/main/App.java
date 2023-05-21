package main;

import java.util.*;
import clases.Cliente;

import adminArchivos.ManejoArchivos;

public class App {

	public static void main(String[] args) {
		String nombreArchivo = "lista-clientes.txt";
		Cliente c1 = new Cliente("Mariano");
		Cliente c2 = new Cliente("Leo");
		Cliente c3 = new Cliente("Mati");
		Cliente c4 = new Cliente("Leonela");
		
		
		List <Cliente> clientes = new ArrayList<>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		
		ManejoArchivos.crearArchivo(nombreArchivo);
		
		for(Cliente c : clientes) {
			ManejoArchivos.agregarInformacion(nombreArchivo,c.getNombre());
		}
		
		ManejoArchivos.leerArchivo(nombreArchivo);

	}

}
