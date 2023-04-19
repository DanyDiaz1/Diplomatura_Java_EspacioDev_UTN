package punto6;
import java.util.Calendar;

public class Vehiculo {
	//Atributos
	String marca;
	String modelo;
	int anio;
	 
	//Constructores
	public Vehiculo() {
		
	}
	
	public Vehiculo(String marca, String modelo, int anio) {
		this.marca=marca;
		this.modelo=modelo;
		this.anio=anio;
	}
	
	//Metodos
	
	public void imprimirDetalles() {
		System.out.println("Marca: "+ this.marca + "\nModelo: "+ this.modelo + "\nAnio: " + this.anio);
	}
	
	public void determinarAntiguedad() {
		
		Calendar fechaActual = Calendar.getInstance();
		int year = fechaActual.get(Calendar.YEAR);
		
		if(year-this.anio > 10) {
			System.out.println("Es antiguo");
		}else {
			System.out.println("Es nuevo");
		}
		
	}
	
	
}
