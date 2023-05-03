package clases;

public class Empleado extends Persona{
	
	//atributos propios
	private int idEmpleado;
	private double sueldoXHora;
	
	
	//Constructor
	public Empleado(String nombre, int edad, char genero, boolean isMarried, int idEmpleado, double sueldoXHora) {
		super(nombre, edad, genero, isMarried);
		this.idEmpleado = idEmpleado;
		this.sueldoXHora = sueldoXHora;
	}
	
	public void saludar() {
		System.out.println("Hola, soy un empleado");
	}
	
	public void calcularSueldo() {
		System.out.println("Mi sueldo anual es: "+ sueldoXHora*40);
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public double getSueldoXHora() {
		return sueldoXHora;
	}


	public void setSueldoXHora(double sueldoXHora) {
		this.sueldoXHora = sueldoXHora;
	}


	@Override
	public String toString() {
		return "Empleado [idEmpleado= " + idEmpleado + " " +super.toString()+ " sueldoXHora=" + sueldoXHora + "]";
	}
	
	
	
	
}
