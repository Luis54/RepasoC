package RepasoEjercicios;

public class Productos {
	private int id;
	private String nombreProducto;
	private double precio;
	public Productos(int id, String nombreProducto, double precio) {
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public double getPrecio() {
		return precio;
	}
	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombreProducto=" + nombreProducto
				+ ", precio=" + precio + "]";
	}
}
