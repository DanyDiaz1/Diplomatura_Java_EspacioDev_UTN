package ejercicio2;

public class Camion extends Vehiculo {

	private double capacidadCarga;

	public Camion(String marca, String modelo, int año, double precio, double capacidadCarga) {
        super(marca, modelo, año, precio);
        this.capacidadCarga = capacidadCarga;
    }

	@Override
	public void mostrarInformación() {
		super.mostrarInformación();
		System.out.println("Capacidad de carga: " + capacidadCarga + " kg");
	}
}
