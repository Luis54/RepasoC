package RepasoEjercicios;

import java.util.Arrays;

public class TestColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//asignar el valor 5 a la ultima posicion
		Colecciones1 v = new Colecciones1();
		v.setPosiciondelNumero(v.getArray().length-1,5);
		System.out.println(v);
		//Asigna el resto de valores con un bucle que el primer elemento sea 3 y los
		//restantes el doble del anterior.
		int contador = 3;
		for (int i = 0; i < v.getArray().length-1; i++) {
			v.setPosiciondelNumero(i, contador);
			contador=contador*2;
			
			
			}System.out.println(v);
			//Mediante un bucle calcula la suma de todos los elementos del array
			int suma=0;
			for (int i = 0; i < v.getArray().length-1; i++) {
				suma=suma+v.getArray()[i];
				
				
			}System.out.println(suma); 
			System.out.println("La media de los numeros del Array es : "+suma/v.getArray().length);
		//Cambia el valor del array y divide por 3 todos los ultimo cinco valores	
			if(v.getArray().length >=5){
			for (int i = 0; i < v.getArray().length-1; i++) {
				v.setPosiciondelNumero(i, v.getArray()[i]/3);
				
			}	
			}System.out.println(v);
			//Calcula ahora el valor mas pequeño almacenado en el array
			Arrays.sort(v.getArray());
			System.out.println("El valor mas pequeño es : "+v.getArray()[0]);
			
	}

}
