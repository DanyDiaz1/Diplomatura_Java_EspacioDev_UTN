package clases;

public class Monitor extends DispositivoSalida {
	// Atributos
	private final int idMonitor;
	private double tamanio;
	private static int contadorMonitores;

	public Monitor(String tipoSalida, String marca, double tamanio, double precio) {
		super(tipoSalida, marca, precio);
		this.idMonitor = ++Monitor.contadorMonitores;
		this.tamanio = tamanio;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Monitor [ Marca= " + super.getMarca() + ", tamanio= " + tamanio + ", Precio= "+ super.getPrecio()+"]";
	}

}
