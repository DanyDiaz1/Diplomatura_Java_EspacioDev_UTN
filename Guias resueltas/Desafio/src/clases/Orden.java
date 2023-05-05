package clases;

public class Orden {
	//Atributos
	private final int idOrden;
	private static int contadorOrdenes;
	private Computadora computadoras[];
	private int contadorComputadoras;
	private final int MAX_COMPUTADORAS =3;
	
	//Constructor
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.computadoras = new Computadora [MAX_COMPUTADORAS];
	}
	
	public void agregarComputadora(Computadora compu) {
		if(contadorComputadoras<MAX_COMPUTADORAS) {
			this.computadoras[contadorComputadoras++] = compu;
		}else {
			System.out.println("Excediste la cantidad maxima por orden");
		}
	}
	
	public void mostrarOrden() {
		System.out.println("Nro. Orden: #"+ this.idOrden);
		
		/*for(int i = 0 ; i<this.computadoras.length; i++) {
			if(this.computadoras[i]!=null) {
				System.out.println(computadoras[i].toString());
			}
		}*/
		
		for(Computadora compu : this.computadoras) {
			if(compu!=null) {
				System.out.println(compu.toString());
			}
		}
		
	}
}
