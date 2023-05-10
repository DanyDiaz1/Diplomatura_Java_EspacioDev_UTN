package clases;

import interfaces.I_AccesoDatos;

public class PersistenciaArchivos implements I_AccesoDatos{

	@Override
	public void crear() {
		System.out.println("Crear un archivo");
		
	}

	@Override
	public void leer() {
		System.out.println("Leer un archivo");
		
	}

	@Override
	public void update() {
		System.out.println("Actualizar un archivo");
		
	}

	@Override
	public void delete() {
		System.out.println("Eliminar un archivo");
		
	}

}
