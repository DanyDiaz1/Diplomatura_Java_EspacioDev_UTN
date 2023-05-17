package ejercicio5;

public class Truco extends JuegoCartas {

	private int cantPuntos;

	public Truco(String nombre, int cantPuntos) {
		super(nombre);
		this.cantPuntos = cantPuntos;
	}

	@Override
	public void iniciarJuego() {
		System.out.println("Iniciar Ronda de Truco");
	}

	@Override
	public void pausarJuego() {
		System.out.println("Pausar Juego");

	}

	@Override
	public void terminarJuego() {
		System.out.println("Rendirse");

	}

}
