package clases;

public class Raton extends DispositivoEntrada{
	//Atributos
	private final int idRaton;
	private static int contadorRatones;
	
	
	//Constructor
	public Raton(String tipoEntrada, String marca, double precio) {
		super(tipoEntrada, marca, precio);
		this.idRaton = ++Raton.contadorRatones;
	}
	

	@Override
	public String toString() {
		return "Raton [ Marca= " + super.getMarca()+ ", Precio= "+ super.getPrecio()+ "]";
	}


	
	
}
