import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		/*System.out.println("Ingrese el primer numero");
		int numero1 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int numero2 = teclado.nextInt();
		
		Calculadora calcu = new Calculadora();
		
		int resultado=calcu.multiplicar(numero1, numero2);
		
		System.out.println("El resultado es: " + resultado);*/
		
		Persona p1 = new Persona("Dany",22,451341,"M");
		
		
		p1.detallarInfo();
		
		Persona p2 = new Persona();
		p2.nombre="Mariano";
		p2.edad=23;
		p2.DNI=12341;
		p2.genero="M";
		
		p2.detallarInfo();
		
		Persona p3 = new Persona("Mai", 20);
		p3.detallarInfo();
		
	}


}
