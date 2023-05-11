package ejercicio1;

public class Cilindro extends Circulo{
	private double altura;

    public Cilindro() {
        super();
        this.altura = 1.0;
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double calcularVolumen() {
        return super.calcularArea() * altura;
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * super.getRadio() * altura + 2 * super.calcularArea();
    }

    public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
    public String toString() {
        return "Cilindro: subclase de " + super.toString() + ", altura=" + altura;
    }
    
    
}
