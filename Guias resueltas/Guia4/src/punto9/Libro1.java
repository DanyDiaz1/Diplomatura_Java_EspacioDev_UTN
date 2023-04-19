package punto9;

public class Libro1 {
	
	 	public String titulo;
	    public double precio;
	    public int stock;
	    public Autor autor;

	    public Libro1(String titulo, double precio, int stock, Autor autor) {
	        this.titulo = titulo;
	        this.precio = precio;
	        this.stock = stock;
	        this.autor = autor;
	    }

	    public void modificarPrecioYStock(double precio, int cantidad) {
	        this.precio = precio;
	        this.stock += cantidad;
	    }

	    public void imprimirLibro() {
	        System.out.println("El libro, " + titulo + " de " + autor.nombre + " " + autor.apellido + ". Se vende a " + precio + " pesos.");
	    }

}
