package punto10;
import java.time.LocalDate;

public class Factura {
	
	//count: atributo estatico que se comparte entre todos los objetos de la clase Factura
	public static int count = 0;
    public int id;
    public LocalDate fecha;
    public double monto;
    public Cliente cliente;

    public Factura(double monto, Cliente cliente) {
        this.id = ++count;
        this.fecha = LocalDate.now();
        this.monto = monto;
        this.cliente = cliente;
    }
    
    public void mostrarDetalles() {
    	System.out.println("Factura[id= " + this.id + ", fecha= " + this.fecha + ", monto= "+ this.monto+ ", cliente= "+ this.cliente.nombre + "]");
    }
}
