package punto5;

public class Pais {
	public String nombre;
	public String capital;
	public int poblacion;
	
	public Pais() {
		
	}
	
	public Pais(String nombre,String capital,int poblacion) {
		this.nombre=nombre;
		this.capital=capital;
		this.poblacion=poblacion;
	}
	
	public void mostrarDetalles() {
		
		System.out.println("Nombre: "+this.nombre+"\nCapital: "+this.capital+"\nPoblacion: "+this.poblacion);

	}
}
