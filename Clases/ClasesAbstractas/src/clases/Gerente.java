package clases;

public class Gerente extends Empleado {
	
	private double sueldoMensual;

	public Gerente(String nombre, String dni, double sueldoMensual) {
		super(nombre, dni);
		this.sueldoMensual = sueldoMensual;
	}

	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return this.sueldoMensual*12;
	}
	
	public void gerenciar() {
		System.out.println("Gerenciando");
	}
	
}
