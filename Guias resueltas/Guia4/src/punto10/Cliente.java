package punto10;

public class Cliente {
	
	//count: atributo estatico que se comparte entre todos los objetos de la clase Cliente
	public static int count = 0; 
    public int id;
    public String nombre;
    public String email;
    public double descuento;

    public Cliente(String nombre, String email, double descuento) {
        this.id = ++count;
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public void mostrarDetalles() {
    	System.out.println("Cliente[id= " + this.id + ", nombre= " + this.nombre + ", email= "+ this.email+ ", descuento= "+ this.descuento + "]");
    }
    
}
