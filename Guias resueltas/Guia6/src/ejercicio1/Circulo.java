package ejercicio1;

public class Circulo {
	private double radio;
	private String color;

	public Circulo() {
		this.radio = 1.0;
		this.color = "rojo";
	}

	public Circulo(double radio) {
		this.radio = radio;
		this.color = "rojo";
	}

	public double calcularArea() {
		return Math.PI * radio * radio;
	}

	public void imprimirCaracteristicas() {
		System.out.println("Radio del círculo: " + radio);
		System.out.println("Color del círculo: " + color);
		System.out.println("Área del círculo: " + calcularArea());
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Círculo: radio=" + radio + ", color=" + color;
	}

}
