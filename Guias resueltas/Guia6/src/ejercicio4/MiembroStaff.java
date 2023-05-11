package ejercicio4;

public class MiembroStaff extends Persona {
	private double salario;
	private String turno;

	public MiembroStaff(String dni, String nombre, String apellido, String email, String direccion, double salario,
			String turno) {
		super(dni, nombre, apellido, email, direccion);
		this.salario = salario;
		this.turno = turno;
	}

	// Getters y setters

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	// Método para calcular el salario anual

	public double calcularSalarioAnual() {
		return salario * 12;
	}

	// Método toString()

	@Override
	public String toString() {
		return super.toString() + ", salario=" + salario + ", turno=" + turno;
	}
}
