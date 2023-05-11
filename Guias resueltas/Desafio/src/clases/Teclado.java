package clases;

public class Teclado extends DispositivoEntrada{
	//Atributos
	private final int idTeclado;
	private static int contadorTeclados;
	
	
	//Constructor
	public Teclado(String tipoEntrada, String marca, double precio) {
		super(tipoEntrada, marca, precio);
		this.idTeclado= ++Teclado.contadorTeclados;
	}
	
	
	@Override
	public String toString() {
		return "Teclado [ Marca= " + super.getMarca()+ ", Precio= "+ super.getPrecio()+ "]";
	}


	
}
