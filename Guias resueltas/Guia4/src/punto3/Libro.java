package punto3;

public class Libro {
	public String titulo;
	public String autor;
	public String anio;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, String anio) {
		this.titulo=titulo;
		this.autor=autor;
		this.anio=anio;
	}
	
	public void mostrarDetalles() {
		System.out.println("Nombre: "+ this.titulo + "\nAutor: "+ this.autor + "\nAño: "+this.anio);
	}
}
