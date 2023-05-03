package main;

import clases.*;

public class App {

	public static void main(String[] args) {

		Persona p1 = new Empleado("Juan", 22, 'm', true, 1, 250.50);
		Persona p2 = new Cliente("Nahuel", 19, 'm', false, 1, true);
		Persona p3 = new Empleado("Roberto", 21, 'm', false, 2, 5000);

		Persona personas[] = { p1, p2, p3 };

		/*
		 * personas[0]=p1; personas[1]=p2; personas[2]=p3;
		 */

		for (int i = 0; i < personas.length; i++) {

			if (personas[i] instanceof Empleado) {
				Empleado empleado = (Empleado) personas[i];
				empleado.calcularSueldo();
			}
			if (personas[i] instanceof Cliente) {
				Cliente cliente = (Cliente) personas[i];
				cliente.realizarCompra();
			}
		}

		Empleado e2 = new Empleado("Juan", 22, 'm', true, 1, 240.00);

		p1.setNombre("Pedro");
		// System.out.println(p1.toString());

		if (p2 instanceof Cliente) {

			Cliente cliente = (Cliente) p2;
			// cliente.realizarCompra();
		}

		// Down casting
		if (p1 instanceof Empleado) {
			Empleado empleado = (Empleado) p1;
			// empleado.calcularSueldo();
		}

		// e2.calcularSueldo();
	}

}
