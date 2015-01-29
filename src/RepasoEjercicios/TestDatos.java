package RepasoEjercicios;

import java.util.ArrayList;


public class TestDatos {
	public static void main(String[] args) {
		ArrayList <Double> temperatura = new ArrayList <Double>();
		for (int i = 0; i < 10; i++) {
			temperatura.add((double) i);	
		}
		double [] t = new double[temperatura.size()];
		for (int i = 0; i < temperatura.size(); i++) {
			t[i] = temperatura.get(i);
			
		}
		Datos datos = new Datos(t);
		System.out.println("Valor medio " +datos.valorMedio());
		System.out.println("Valor medio2 " +datos.valorMedioW());
		System.out.printf("%.2f",datos.desviacionTipica());
		System.out.println();
		System.out.println("Valor por debajo de la media " +datos.valorDebajoMedia());
		System.out.println("Valor minimo " +datos.valorMinimo());
		System.out.println("Valor minimo2 " +datos.minimo());
		System.out.println("Valor maximo " +datos.valorMaxima());
		System.out.println("Valor maximo2 " +datos.maximo());
	}
}
