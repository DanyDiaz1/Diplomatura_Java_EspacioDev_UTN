package punto9;

public class Autor {

	 	public String nombre;
	    public String apellido;
	    public String email;
	    public char genero;

	    public Autor(String nombre, String apellido, String email, char genero) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.email = email;
	        this.genero = genero;
	    }


	    public void imprimirAutor() {
	        System.out.println("Autor[nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", género=" + genero + "]");
	    }
}

