package ejercicio4;

public class Estudiante extends Persona {

	private int anioIngreso;
	private double cuotaMensual;
	private String carrera;

	public Estudiante(String dni, String nombre, String apellido, String email, String direccion, int anioIngreso,
			double cuotaMensual, String carrera) {
		super(dni, nombre, apellido, email, direccion);
		this.anioIngreso = anioIngreso;
		this.cuotaMensual = cuotaMensual;
		this.carrera = carrera;
	}

	// Getters y setters

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	public double getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	// Método toString()

	@Override
	public String toString() {
		return super.toString() + ", anioIngreso=" + anioIngreso + ", cuotaMensual=" + cuotaMensual + ", carrera="
				+ carrera;
	}
}
