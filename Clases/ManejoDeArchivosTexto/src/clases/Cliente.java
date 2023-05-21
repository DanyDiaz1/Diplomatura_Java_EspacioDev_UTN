package clases;

public class Cliente {
	private String nombre;
	private double monto;
	
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
		this.monto = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
	
}
