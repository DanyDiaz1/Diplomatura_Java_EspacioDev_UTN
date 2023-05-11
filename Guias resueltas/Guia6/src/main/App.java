package main;

import ejercicio1.*;
import ejercicio2.*;
import ejercicio3.*;
import ejercicio4.*;

public class App {

	public static void main(String[] args) {

		// Ejercicio 1
		Cilindro cilindro1 = new Cilindro();
		cilindro1.imprimirCaracteristicas();
		System.out.println("Altura del cilindro: " + cilindro1.getAltura());
		System.out.println("Volumen del cilindro: " + cilindro1.calcularVolumen());
		System.out.println();

		Cilindro cilindro2 = new Cilindro(2.5, 3.0);
		cilindro2.imprimirCaracteristicas();
		System.out.println("Altura del cilindro: " + cilindro2.getAltura());
		System.out.println("Volumen del cilindro: " + cilindro2.calcularVolumen());
		System.out.println();

		System.out.println("Área del cilindro (sobrescrito): " + cilindro2.calcularArea());
		System.out.println();

		System.out.println(cilindro2.toString());
		System.out.println("\n-----------------------------------------------------------\n");

		// Ejercicio 2

		Vehiculo vehículo = new Vehiculo("Toyota", "Corolla", 2022, 25000);
		vehículo.mostrarInformación();
		System.out.println();

		Auto auto = new Auto("Ford", "Mustang", 2021, 50000, 2);
		auto.mostrarInformación();
		System.out.println();

		Camion camión = new Camion("Volvo", "FH16", 2020, 100000, 20000);
		camión.mostrarInformación();
		System.out.println("\n-----------------------------------------------------------\n");

		// Ejercicio 3

		Producto producto = new Producto("Producto Genérico", 10.99, 50);
		producto.mostrarInformación();
		System.out.println();

		Electronico electrónico = new Electronico("Teléfono", 499.99, 10, "Samsung");
		electrónico.mostrarInformación();
		System.out.println();

		Alimenticio alimenticio = new Alimenticio("Leche", 2.99, 20, "25/05/2023");
		alimenticio.mostrarInformación();
		System.out.println("\n-----------------------------------------------------------\n");

		// Ejercicio 4
		Estudiante estudiante1 = new Estudiante("123456789", "Juan", "Pérez", "juan@example.com", "Av. Principal 123",
				2020, 1000, "Ingeniería");
		Estudiante estudiante2 = new Estudiante("987654321", "María", "Gómez", "maria@example.com",
				"Calle Secundaria 456", 2019, 900, "Arquitectura");
		Estudiante estudiante3 = new Estudiante("456789123", "Pedro", "López", "pedro@example.com", "Plaza Central 789",
				2021, 1100, "Medicina");
		Estudiante estudiante4 = new Estudiante("321654987", "Ana", "Torres", "ana@example.com", "Avenida Central 987",
				2020, 1000, "Derecho");
		MiembroStaff staff1 = new MiembroStaff("741852963", "Carlos", "García", "carlos@example.com",
				"Calle Principal 789", 25000, "Mañana");
		MiembroStaff staff2 = new MiembroStaff("963852741", "Laura", "Rodríguez", "laura@example.com",
				"Avenida Secundaria 456", 28000, "Noche");
		MiembroStaff staff3 = new MiembroStaff("258741963", "Mario", "Hernández", "mario@example.com",
				"Plaza Central 123", 30000, "Mañana");
		MiembroStaff staff4 = new MiembroStaff("369852147", "Sofía", "Martínez", "sofia@example.com",
				"Avenida Principal 654", 27000, "Noche");

		Persona[] personas = { estudiante1, estudiante2, estudiante3, estudiante4, staff1, staff2, staff3, staff4 };

		int cantidadEstudiantes = 0;
		int cantidadStaff = 0;
		double ingresosTotales = 0;

		for (Persona persona : personas) {
			if (persona instanceof Estudiante) {
				cantidadEstudiantes++;
				ingresosTotales += ((Estudiante) persona).getCuotaMensual();
			} else if (persona instanceof MiembroStaff) {
				cantidadStaff++;
			}
		}

		System.out.println("Cantidad de estudiantes: " + cantidadEstudiantes);
		System.out.println("Cantidad de miembros de staff: " + cantidadStaff);
		System.out.println("Ingresos totales por cuotas de estudiantes: $" + ingresosTotales);
	}

}
