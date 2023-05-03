package clases;

public class Autor {
	public String nombre;
    public String pais;
    
    public Autor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", pais=" + pais + "]";
	}
    
    
}
