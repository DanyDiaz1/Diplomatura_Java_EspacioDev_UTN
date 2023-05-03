package clases;

public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	private char genero;
	private boolean isMarried;
	
	
	//Constructor
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad, char genero, boolean isMarried) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.isMarried = isMarried;
	}
	
	
	public void saludar() {
		System.out.println("Hola soy una persona");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", isMarried=" + isMarried + "]";
	}
	
	
	
}
