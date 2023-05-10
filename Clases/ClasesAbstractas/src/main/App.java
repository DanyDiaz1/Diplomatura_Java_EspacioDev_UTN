package main;
import clases.*;

public class App {

	public static void main(String[] args) {
		
		Empleado e1 = new Vendedor("Jose","59483782",5);
		Empleado e2 = new Gerente("Diego","78373948",1000);
		Empleado e3 = new Vendedor("Jorge","13434332",10);
	
		Empleado empleados []= new Empleado [3];
		
		empleados[0]=e1;
		empleados[1]=e2;
		empleados[2]=e3;
		
		System.out.println(empleados[0].calcularSueldo());
		System.out.println(empleados[1].calcularSueldo());
		
		empleados[0].saludar();
		empleados[1].saludar();
		
		for(int i =0 ; i<empleados.length; i++) {
			if(empleados[i] instanceof Vendedor) {
				Vendedor v1 = (Vendedor) empleados[i];
				v1.irAVender();
			}else {
				Gerente g1 = (Gerente) empleados[i];
				g1.gerenciar();
			}
		}
		

	}

}
