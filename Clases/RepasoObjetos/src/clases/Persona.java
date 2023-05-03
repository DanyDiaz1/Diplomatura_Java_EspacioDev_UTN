package clases;

public class Persona {
	//Atributos
	private String nombre;
	private String apellido;
	private String dni;
	private String edad;
	
	//Constructores
	public Persona() {
		this.nombre="Juan";
		this.apellido="Perez";
		this.dni="1111111";
		this.edad="18";
	}
	
	
	public Persona(String nombre, String apellido, String dni, String edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	//Metodos propios
	
	public void saludar() {
		System.out.println("Hola soy una persona y me llamo "+ this.nombre);
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
	
}
