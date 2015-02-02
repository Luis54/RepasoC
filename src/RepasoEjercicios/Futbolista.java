package RepasoEjercicios;

public class Futbolista {
	//atributos
	private String nombre;
	private int numero;
	private String posicion;
	
	//constructor
	
	public Futbolista(String nombre, int numero, String posicion) {
		this.nombre = nombre;
		this.numero = numero;
		this.posicion = posicion;
	}
	
	//getter y setter
	
	public String getNombre() {
		return nombre;
	}

	public int getNumero() {
		return numero;
	}

	public String getPosicion() {
		return posicion;
	}

	@Override
	public String toString() {
		return "Futbolista [nombre=" + nombre + ", numero=" + numero
				+ ", posicion=" + posicion + "]";
	}
	
	
}
