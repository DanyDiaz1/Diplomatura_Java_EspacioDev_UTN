package clases;

public class DispositivoEntrada extends Periferico {
	
	//Atributos
	private String tipoEntrada;
	
	//Constructor
	public DispositivoEntrada(String tipoEntrada, String marca, double precio) {
		super(marca,precio);
		this.tipoEntrada = tipoEntrada;
	}


	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}
	
}
