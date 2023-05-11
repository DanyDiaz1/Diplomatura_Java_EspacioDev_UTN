package ejercicio3;

public class Alimenticio extends Producto {

	private String fechaCaducidad;

	public Alimenticio(String nombre, double precio, int cant_stock, String fechaCaducidad) {
		super(nombre, precio, cant_stock);
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public void mostrarInformación() {
		super.mostrarInformación();
		System.out.println("Fecha de caducidad: " + fechaCaducidad);
	}
}
