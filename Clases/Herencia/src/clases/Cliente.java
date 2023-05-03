package clases;

public class Cliente extends Persona {
	private int idCliente;
	private boolean isVip;
	
	
	public Cliente(String nombre, int edad, char genero, boolean isMarried, int idCliente, boolean isVip) {
		super(nombre, edad, genero, isMarried);
		this.idCliente = idCliente;
		this.isVip = isVip;
	}
	
	public void realizarCompra() {
		System.out.println("Estoy realizando una compra");
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public boolean isVip() {
		return isVip;
	}


	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}


	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + " " + super.toString() + " isVip=" + isVip + "]";
	}
	
	
	
	
	
}
