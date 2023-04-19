package punto2;

public class Rectangulo {
	//Atributos
	public int ancho;
	public int largo;
	
	//Constructor
	public Rectangulo() {
		
	}
	
	public Rectangulo(int ancho,int largo) {
		this.ancho=ancho;
		this.largo=largo;
	}
	
	//Metodos
	
	public void calcularArea() {
		System.out.println("El area de mi rectangulo es: " + this.ancho*this.largo);
	}
	
	public void calcularPerimetro() {
		System.out.println("El perimetro de mi rectangulo es: " + (this.ancho*2 + this.largo*2));
	}
}
