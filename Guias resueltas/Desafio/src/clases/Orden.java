package clases;

public class Orden {
	// Atributos
	private final int idOrden;
	private static int contadorOrdenes;
	private Computadora computadoras[];
	private int contadorComputadoras;
	private final int MAX_COMPUTADORAS = 3;

	// Constructor
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.computadoras = new Computadora[MAX_COMPUTADORAS];
	}

	public void agregarComputadora(Computadora compu) {
		if (contadorComputadoras < MAX_COMPUTADORAS) {
			this.computadoras[contadorComputadoras++] = compu;
		} else {
			System.out.println("Excediste la cantidad maxima por orden");
		}
	}

	public void mostrarOrden() {
		System.out.println("Nro. Orden: #" + this.idOrden);

		for (Computadora compu : this.computadoras) {
			if (compu != null) {
				compu.mostrarComputadora();
			}
		}
		
		System.out.println("TOTAL DE LA ORDEN = "+ calcularTotalOrden());
		System.out.println("--------------------------------------------");
	}

	public double calcularTotalOrden() {
		double suma = 0;

		for (Computadora compu : this.computadoras) {
			if (compu != null) {
				suma += compu.getRaton().getPrecio() + compu.getTeclado().getPrecio() + compu.getParlante().getPrecio();
				for (Monitor monitor : compu.getMonitores()) {
					if(monitor!=null)
					suma += monitor.getPrecio();
				}
			}
		}

		return suma;
	}
}
