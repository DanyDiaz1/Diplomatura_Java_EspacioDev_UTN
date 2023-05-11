package clases;

public class Periferico {
	private double precio;
	private String marca;
	
	public Periferico(String marca, double precio) {
		this.marca = marca;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
}
