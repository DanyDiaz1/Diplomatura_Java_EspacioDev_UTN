package main;
import punto1.Persona;
import punto2.Rectangulo;
import punto3.Libro;
import punto4.Jugador;
import punto5.Pais;
import punto6.Vehiculo;
import punto7.Empleado;
import punto8.ItemVenta;
import punto9.*;
import punto10.*;


public class App {

	public static void main(String[] args) {
		
		//Ejercicio 1
		Persona persona1 = new Persona();
		
		persona1.nombre="Leo";
		persona1.edad="22";
		persona1.genero="M";
		
		persona1.imprimirDetalles();
		
		
		//Ejercicio 2
		Rectangulo rec= new Rectangulo(5,2);
		rec.calcularArea();
		rec.calcularPerimetro();
		
		
		//Ejercicio 3
		Libro unLibro = new Libro("El principito","Jose","2006");
		unLibro.mostrarDetalles();
		
		
		//Ejercicio 4
		Jugador unJugador = new Jugador();
		unJugador.nombre="Messi";
		unJugador.edad=36;
		unJugador.deporte="Futbol";
		
		unJugador.mostrarDetalles();
		
		
		//Ejercicio 5
		Pais unPais = new Pais("Argentina","Buenos Aires",48000000);
		unPais.mostrarDetalles();
		
		
		//Ejercicio 6
		Vehiculo v1 = new Vehiculo("Ford","Focus", 2012);
		v1.imprimirDetalles();
		v1.determinarAntiguedad();
		
		
		//Ejercicio 7
		Empleado carlos = new Empleado(23456345, "Carlos", "Gutiérrez", 25000);
        Empleado ana = new Empleado(34234123, "Ana", "Sánchez", 27500);

        carlos.imprimirCaracteristicas();
        ana.imprimirCaracteristicas();

        carlos.aumentarSalario(15);
        System.out.println("El salario anual de Carlos es: " + carlos.calcularSalarioAnual());
        
        
        //Ejercicio 8
        ItemVenta item = new ItemVenta(1, "Producto 1", 2, 10.5);
        item.imprimirAtributos();
        
        
        //Ejercicio 9
        Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        autor.imprimirAutor();

        Libro1 libro = new Libro1("Effective Java", 450, 150, autor);
        libro.imprimirLibro();

        libro.modificarPrecioYStock(500, 50);

        libro.imprimirLibro();
        autor.imprimirAutor();
        
        
        //Ejercicio 10
        
        Cliente cliente1 = new Cliente("Juan Perez", "juan@gmail.com", 0.1);
        cliente1.mostrarDetalles();

        Factura factura1 = new Factura(1000, cliente1);
        System.out.println("Monto total de la factura: " + factura1.monto);
        System.out.println("Monto total con descuento: " + (factura1.monto - (factura1.monto * factura1.cliente.descuento)));
        factura1.mostrarDetalles();

        factura1.monto=1500;
        factura1.cliente.descuento=0.2;
        System.out.println("Monto total de la factura: " + factura1.monto);
        System.out.println("Monto total con descuento: " + factura1.calcularMontoDescuento());
        factura1.mostrarDetalles();	
	}

}







