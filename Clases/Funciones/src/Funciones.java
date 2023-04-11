
public class Funciones {

	public static void main(String[] args) {
		
		/*int resultado = sumar(7,4);
		
		sumarSinRetorno(9, 5);*/
		
		String nombre = "Matias";
		int edadUsuario = 15;
		
		/*boolean esMayor = validarEdad(edadUsuario);
		
		if(esMayor == true) {
			System.out.println("Bienvenido " + nombre);
		}else {
			System.out.println("No sos mayor de edad");
		}*/
		
		validarEdadSinRetorno(nombre, edadUsuario);
		
	}
	
	
	static void validarEdadSinRetorno(String nombreUsuario, int edad) {
		if(edad>=18) {
			System.out.println("Bienvenido " + nombreUsuario);
		}else {
			System.out.println("No sos mayor de edad");
		}
	}
	
	
	static boolean validarEdad(int edad) {
		if(edad>=18) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	static int sumar(int num1, int num2) {
		
		int resultado = num1 + num2;
		
		return resultado;
	}
	
	
	
	static void sumarSinRetorno (int num1, int num2) {
		
		int resultado =num1 + num2;
		
		System.out.println(resultado);
		
	}
	

}
