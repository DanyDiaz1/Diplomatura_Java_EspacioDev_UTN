package clases;

import excepciones.NotEnoughMoneyException;

public class Cliente {

	//Atributos
	private String nombre;
	private double monto;
	
	//Constructor
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
		this.monto = 0;
	}
	
	//Metodo para depositar
	
	public void depositar(double deposito) {
		this.monto+=deposito;
	}
	
	//Metodo para extraer
	public void extraer(double extraccion) throws NotEnoughMoneyException{
		if(this.monto-extraccion < 0) {
			throw new NotEnoughMoneyException("Error: no tenes suficiente dinero en tu cuenta");
		}else {
			this.monto-=extraccion;
		}
	}
	
	public void imprimir() {
		System.out.println("Bienvenido, "+ this.nombre + "!");
		System.out.println("Dinero disponible: "+ this.monto);
	}
	
	
	
}
