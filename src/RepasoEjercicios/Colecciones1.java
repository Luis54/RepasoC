package RepasoEjercicios;

import java.util.Arrays;

public class Colecciones1 {

	private int [] array;

	/**
	 * @param constructor que inicializa el array
	 */
	public Colecciones1() {
		this.array = new int [12];
	}

	public int[] getArray() {
		return array;
	}
	public void setPosiciondelNumero(int posicion,int valor){
		this.array[posicion]=valor;
	}

	@Override
	public String toString() {
		return "Mi Array contiene =" + Arrays.toString(array);
	}
	
}
