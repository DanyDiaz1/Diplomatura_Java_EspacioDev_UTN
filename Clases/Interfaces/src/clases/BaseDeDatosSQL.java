package clases;

import interfaces.I_AccesoDatos;

public class BaseDeDatosSQL implements I_AccesoDatos{

	@Override
	public void crear() {
		
		System.out.println("Crear base de datos");
		
	}

	@Override
	public void leer() {
		System.out.println("Leer base de datos");
		
	}

	@Override
	public void update() {
		System.out.println("Actualizar base de datos");
		
	}

	@Override
	public void delete() {
		System.out.println("Eliminar base de datos");
		
	}
	
}
