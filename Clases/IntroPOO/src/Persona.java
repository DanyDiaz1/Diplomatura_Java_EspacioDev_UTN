
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

	// Metodos
	public void saludar() {
		System.out.println("Hola soy una persona y me llamo " + nombre);
	}
}
