package ejercicio3;

public class Electronico extends Producto {

	private String marca;

	public Electronico(String nombre, double precio, int cant_stock, String marca) {
		super(nombre, precio, cant_stock);
		this.marca = marca;
	}

	@Override
	public void mostrarInformación() {
		super.mostrarInformación();
		System.out.println("Marca: " + marca);
	}

}
