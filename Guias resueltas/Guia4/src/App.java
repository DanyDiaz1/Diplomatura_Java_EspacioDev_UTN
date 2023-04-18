
public class App {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		
		persona1.nombre="Leo";
		persona1.edad="22";
		persona1.genero="M";
		
		persona1.imprimirDetalles();
		
		Rectangulo rec= new Rectangulo(5,2);
		rec.calcularArea();
		rec.calcularPerimetro();
		
		Vehiculo v1 = new Vehiculo("Ford","Focus", 2015);
		v1.imprimirDetalles();
		v1.determinarAntiguedad();
		
	}

}
