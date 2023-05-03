package punto1;

public class Persona {
	
	//Atributos
	private String nombre;
	private String edad;
	private String genero;
	
	//Constructor
	
	//Metodos
	
	public void imprimirDetalles() {
		System.out.println("Nombre: "+ this.nombre+" Edad: " + this.edad + " Genero: "+this.genero);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}
