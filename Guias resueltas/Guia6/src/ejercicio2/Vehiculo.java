package ejercicio2;

public class Vehiculo {

	private String marca;
    private String modelo;
    private int año;
    private double precio;

    public Vehiculo(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public void mostrarInformación() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Precio: $" + precio);
    }
}
