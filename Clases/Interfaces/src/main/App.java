package main;

import clases.BaseDeDatosSQL;
import clases.PersistenciaArchivos;
import interfaces.I_AccesoDatos;

public class App {

	public static void main(String[] args) {
		
		I_AccesoDatos persistencia1 = new BaseDeDatosSQL();
		I_AccesoDatos persistencia2 = new PersistenciaArchivos();
		
		persistencia1.crear();
		persistencia2.crear();
	}

}
