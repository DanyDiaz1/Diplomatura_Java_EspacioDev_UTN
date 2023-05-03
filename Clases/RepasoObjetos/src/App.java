import clases.*;
public class App {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		Empleado e1 = new Empleado();
		System.out.println(p1.getNombre());
		p1.setNombre("Jose");
		System.out.println(p1.getNombre());
		p1.saludar();
		
		System.out.println(p1);
	}

}
