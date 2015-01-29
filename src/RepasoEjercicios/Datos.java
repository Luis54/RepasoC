package RepasoEjercicios;

import java.util.Arrays;

public class Datos {
	private double array[];

	public Datos(double[] array) {
		this.array = array;
	}
	public double valorMedio(){
		double devolver = 0;
		for (int i = 0; i < array.length; i++) {
			devolver+=array[i];
		}
		return devolver/array.length;	
	}
	public double valorMedioW(){
		double devolver = 0;
		int i = 0; 
		while (i < array.length) {
			devolver+=array[i];
			i++;
		}
		return devolver/array.length;	
	}
	public double desviacionTipica(){
		double devolver = 0;
		for (int i = 0; i < array.length; i++) {
			devolver+=Math.pow(array[i]-this.valorMedio(),2);
		}
		
		
		
		return Math.sqrt(devolver/this.array.length);
	}
	public double valorDebajoMedia(){
		double contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < valorMedio()) 
				contador++;
			
			
		}
		
		return contador;
	}
	public double valorMinimo(){
		double [] minimo = this.array;
		Arrays.sort(minimo); /*    */
		return minimo[0];
	}
	public double valorMaxima(){
		double [] maximo = this.array;
		Arrays.sort(maximo);
		return maximo[maximo.length-1];
	}
	public double minimo(){
		double minimo = array[0];
		for (int i = 0; i < array.length; i++) {
			if (minimo > array[i]) {
				minimo=array[i];
			}
			
		}
		return minimo;
	}
	public double maximo(){
		double maximo = array[0];
		for (int i = 0; i < array.length; i++) {
			if (maximo < array[i]) {
				maximo=array[i];
			}
			
		}
		return maximo;
	}
	
}
