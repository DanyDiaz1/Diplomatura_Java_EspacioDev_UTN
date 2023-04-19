package punto8;

public class ItemVenta {
	public int identificador;
    public String descripcion;
    public int cantidad;
    public double precioUnitario;

    public ItemVenta(int identificador, String descripcion, int cantidad, double precioUnitario) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularPrecioTotal() {
        return cantidad * precioUnitario;
    }

    public void imprimirAtributos() {
        System.out.println("ItemVenta[id=" + identificador + ", descripción=" + descripcion + ", cantidad=" + cantidad + ", pUnitario=" + precioUnitario + ", pTotal=" + calcularPrecioTotal() + "]");
    }
}
