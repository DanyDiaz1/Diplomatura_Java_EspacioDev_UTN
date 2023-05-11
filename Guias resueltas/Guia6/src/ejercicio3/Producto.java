package ejercicio3;

public class Producto {
	private String nombre;
	private double precio;
	private int cant_stock;

	public Producto(String nombre, double precio, int cant_stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.cant_stock = cant_stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCant_stock() {
		return cant_stock;
	}

	public void setCant_stock(int cant_stock) {
		this.cant_stock = cant_stock;
	}

	public void mostrarInformación() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Precio: $" + precio);
		System.out.println("Cantidad en stock: " + cant_stock);
	}
}
