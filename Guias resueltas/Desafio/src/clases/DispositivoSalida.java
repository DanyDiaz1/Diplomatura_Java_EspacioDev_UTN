package clases;

public class DispositivoSalida extends Periferico {
	private String tipoSalida;

	public DispositivoSalida(String tipoSalida, String marca, double precio) {
		super(marca, precio);
		this.tipoSalida = tipoSalida;
	}

	public String getTipoSalida() {
		return tipoSalida;
	}

	public void setTipoSalida(String tipoSalida) {
		this.tipoSalida = tipoSalida;
	}

}
