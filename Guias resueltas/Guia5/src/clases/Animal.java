package clases;

public class Animal {
	public String especie;
    public String tamanio;
   
    
    public Animal(String especie, String tamanio) {
        this.especie = especie;
        this.tamanio = tamanio;
    }


	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", tamanio=" + tamanio + "]";
	}
    
    
}
