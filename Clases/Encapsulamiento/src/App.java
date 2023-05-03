
public class App {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Juan",18);
		
		Persona p2 = new Persona("Juancito",18);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.equals(p2));
		
		System.out.println(p1);
		
		p1.saludar("Leo");

	}

}
