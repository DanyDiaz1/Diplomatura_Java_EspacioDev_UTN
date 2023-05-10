package clases;

public class Vendedor extends Empleado{

	private int cantVentas;

	public Vendedor(String nombre, String dni, int cantVentas) {
		super(nombre, dni);
		this.cantVentas = cantVentas;
	}

	@Override
	public double calcularSueldo() {
		
		return this.cantVentas*500;
	}
	
	public void saludar() {
		System.out.println("Hola soy un vendedor");
	}
	
	public void irAVender() {
		System.out.println("Yendo a vender");
	}
}
