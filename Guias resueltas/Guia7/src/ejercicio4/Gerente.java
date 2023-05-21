package ejercicio4;

public class Gerente extends Empleado{
	
	// Implementación del método calcularSalario para Gerente
    public double calcularSalario() {
        // Lógica de cálculo de salario para un Gerente
        return 5000.0;
    }

    // Implementación del método obtenerDetalles para Gerente
    public String obtenerDetalles() {
        // Detalles específicos para un Gerente
        return "Cargo: Gerente";
    }
}
