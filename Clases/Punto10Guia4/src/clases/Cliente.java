package clases;

public class Cliente {
	
	//Atributos
	public static int cantClientes=0;
	public int id;
	public String nombre;
	public String mail;
	public double descuento;
	
	//Constructor
	
	public Cliente(String nombre,String mail,double descuento){
		
		this.id = ++cantClientes;
		this.nombre=nombre;
		this.mail=mail;
		this.descuento=descuento;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", mail=" + mail + ", descuento=" + descuento + "]";
	}
	
}
