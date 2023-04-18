

public class Persona {

	// Atributos

	String nombre;
	int edad;
	int DNI;
	String genero;

	public Persona() {
		
	}

	public Persona(String nombre, int edad, int DNI, String genero) {
		this.nombre=nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.genero= genero;
	}
	
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad = edad;
	}

	// Metodos
	public void saludar() {
		System.out.println("Hola soy una persona y me llamo " + nombre);
	}
	
	
	public void detallarInfo() {
		System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nDNI: " + this.DNI + "\nGenero :" + this.genero);
	}

	
	
}
