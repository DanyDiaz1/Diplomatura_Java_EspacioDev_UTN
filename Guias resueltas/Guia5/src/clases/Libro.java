package clases;

public class Libro {
	public String titulo;
	public Autor autor;

	public Libro(String titulo, Autor autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + "]";
	}

}
