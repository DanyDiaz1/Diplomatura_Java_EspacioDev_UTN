package clases;
import java.time.LocalDateTime;

public class Factura {
	
	//Atributos
	public static int cantFacturas=0;
	public int id;
	public double monto;
	public LocalDateTime fechaYHora;
	public Cliente cliente;
	
	//Constructor
	public Factura(double monto,Cliente cliente) {
		this.id = ++cantFacturas;
		this.monto=monto;
		this.cliente=cliente;
		this.fechaYHora=LocalDateTime.now();
	}
	
	public void calcularMontoConDescuento() {
		
		 this.monto = this.monto-(this.monto*this.cliente.descuento);
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", monto=" + monto + ", fechaYHora=" + fechaYHora + ", cliente=" + cliente + "]";
	}
	
	
	
	
}
