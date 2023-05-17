package main;

import clases.Persona;
import java.util.*;

public class App {

	public static void main(String[] args) {
		
		//MAIN
		
		
		Persona persona1 = new Persona("Juan", 31, "Programador");
		Persona persona2 = new Persona("Nahuel", 19, "Cartonero");
		Persona persona3 = new Persona("Maria", 25, "Panadera");
		List<Persona> personas = new ArrayList<>();

		// Ejercicio 2
		agregarPersona(personas, persona1);
		agregarPersona(personas, persona2);
		agregarPersona(personas, persona3);
		// mostrarLista(personas);

		// Ejercicio 3
		Persona personaEncontrada = buscarPorNombre(personas, "Nahuel");
		if (personaEncontrada != null) {
			// System.out.println(personaEncontrada);
		}

		// Ejercicio 4
		actualizarProfesion(personas, "Nahuel", "Programador");
		// System.out.println(persona2);
		//mostrarLista(personas);
		
		// Ejercicio 5
		//eliminarPersona(personas, "Juan");
		//mostrarLista(personas);
		
		//Ejercicio 6
		System.out.println("La cantidad de personas es: " + contarPersonas(personas));
		
		//Ejercicio 7
		ordenarPorEdades(personas);
		//mostrarLista(personas);
		
		//Ejercicio 8
		List <Persona> listaFiltrada = filtrarPorProfesion(personas, "Panadera");
		//mostrarLista(listaFiltrada);
		
		//Ejercicio 9
		List<Persona> otrasPersonas = new ArrayList<>();
		Persona persona4 = new Persona("Daniel", 39, "Electricista");
		Persona persona5 = new Persona("Jose", 19, "Plomero");
		Persona persona6 = new Persona("Leo", 25, "Ingeniero");
		
		agregarPersona(otrasPersonas, persona4);
		agregarPersona(otrasPersonas, persona5);
		agregarPersona(otrasPersonas, persona6);
		
		List <Persona>listasUnidas = concatenarArrayLists(personas, otrasPersonas);
		mostrarLista(listasUnidas);
		
		//Ejercicio 10
		limpiarArrayList(listasUnidas);
		//mostrarLista(listasUnidas);
	}
	
	
	//METODOS
	
	

	// Ejercicio 2
	public static void agregarPersona(List<Persona> personas, Persona p) {
		personas.add(p);
	}

	public static void mostrarLista(List<Persona> personas) {
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}

	// Ejercicio 3
	public static Persona buscarPorNombre(List<Persona> personas, String nombreBuscado) {

		for (Persona p : personas) {
			if (p.getNombre().equals(nombreBuscado)) {
				return p;
			}
		}

		return null;
	}

	// Ejercicio 4

	public static void actualizarProfesion(List<Persona> personas, String nombreActualizar, String nuevaProfesion) {
		for (Persona p : personas) {
			if (p.getNombre().equals(nombreActualizar)) {
				p.setProfesion(nuevaProfesion);
			}
		}
	}

	// Ejercicio 5

	public static void eliminarPersona(List<Persona> personas, String nombre) {

		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getNombre().equals(nombre)) {
				personas.remove(i);
			}
		}
	}

	// Ejercicio 6

	public static int contarPersonas(List<Persona> personas) {
		return personas.size();
	}

	// Ejercicio 7

	public static void ordenarPorEdades(List<Persona> personas) {

		Collections.sort(personas, new Comparator<Persona>() {
			@Override
			public int compare(Persona persona1, Persona persona2) {
				return Integer.compare(persona1.getEdad(), persona2.getEdad());
			}
		});

	}

	// Ejercicio 8
	public static List<Persona> filtrarPorProfesion(List<Persona> personas, String profesion) {
		ArrayList<Persona> personasFiltradas = new ArrayList<>();

		for (Persona persona : personas) {
			if (persona.getProfesion().equals(profesion)) {
				personasFiltradas.add(persona);
			}
		}

		return personasFiltradas;
	}

	// Ejercicio 9

	public static List<Persona> concatenarArrayLists(List<Persona> arrayList1, List<Persona> arrayList2) {
		ArrayList<Persona> arrayListConcatenado = new ArrayList<>();

		// Agregar elementos del arrayList1 al arrayListConcatenado
		for (Persona persona : arrayList1) {
			arrayListConcatenado.add(persona);
		}

		// Agregar elementos del arrayList2 al arrayListConcatenado
		for (Persona persona : arrayList2) {
			arrayListConcatenado.add(persona);
		}

		return arrayListConcatenado;
	}

	// Ejercicio 10

	public static void limpiarArrayList(List<Persona> personas) {
		personas.clear();
	}

}
