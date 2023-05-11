package clases;

public class Computadora {

	// Atributos
	private final int idComputadora;
	private static int contadorComputadoras;
	private int contadorMonitores;
	private String nombre;
	private Monitor monitores[];
	private Teclado teclado;
	private Raton raton;
	private Parlante parlante;

	// Constructor
	public Computadora() {
		this.idComputadora = ++Computadora.contadorComputadoras;
		this.monitores = new Monitor[3];
	}

	public Computadora(String nombre, Teclado teclado, Raton raton, Parlante parlante) {
		this.idComputadora = ++Computadora.contadorComputadoras;
		this.nombre = nombre;
		this.monitores = new Monitor[3];
		this.teclado = teclado;
		this.raton = raton;
		this.parlante = parlante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	public Parlante getParlante() {
		return parlante;
	}

	public void setParlante(Parlante parlante) {
		this.parlante = parlante;
	}

	public Monitor[] getMonitores() {
		return monitores;
	}

	public void setMonitores(Monitor[] monitores) {
		this.monitores = monitores;
	}

	public void agregarMonitor(Monitor monitor) {
		if (contadorMonitores < 3) {
			this.monitores[contadorMonitores++] = monitor;
		} else {
			System.out.println("Excediste la cantidad maxima por Computadora");
		}
	}

	public void mostrarComputadora() {
		System.out.println("Nombre: " + this.nombre);

		for (Monitor monitor : this.monitores) {
			if (monitor != null) {
				System.out.println(monitor);
			}
		}

		System.out.println(teclado);
		System.out.println(raton);
		System.out.println(parlante);
		System.out.println("-----");

	}

}
