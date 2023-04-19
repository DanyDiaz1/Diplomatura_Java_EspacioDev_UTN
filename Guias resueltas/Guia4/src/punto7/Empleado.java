package punto7;

public class Empleado {

	public int dni;
    public String nombre;
    public String apellido;
    public double salario;

    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public void aumentarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    public void imprimirCaracteristicas() {
        System.out.println("Empleado[dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + "]");
    }

}
