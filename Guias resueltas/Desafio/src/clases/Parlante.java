package clases;

public class Parlante extends DispositivoSalida {
	private final int idParlante;
	private double dB;
	private static int contadorParlantes;

	public Parlante(String tipoSalida, String marca, double dB, double precio) {
		super(tipoSalida, marca, precio);
		this.idParlante = ++Parlante.contadorParlantes;
		this.dB = dB;
	}

	public double getdB() {
		return dB;
	}

	public void setdB(double dB) {
		this.dB = dB;
	}

	@Override
	public String toString() {
		return "Parlante [ Marca= " + super.getMarca() + ", dB:  " + this.dB + ", Precio= "+ super.getPrecio()+ "]";
	}

}
