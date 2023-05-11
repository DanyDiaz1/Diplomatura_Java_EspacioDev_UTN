package ejercicio2;

public class Auto extends Vehiculo {

	private int cantidadPuertas;

	public Auto(String marca, String modelo, int año, double precio, int cantidadPuertas) {
		super(marca, modelo, año, precio);
		this.cantidadPuertas = cantidadPuertas;
	}

	@Override
	public void mostrarInformación() {
		super.mostrarInformación();
		System.out.println("Cantidad de puertas: " + cantidadPuertas);
	}
}
