package RepasoEjercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;



public class TestEquipo {
	public static void main(String[] args) {
		equipo f = new equipo();
		
		//añadir furbolistas
		f.addFutbolista(new Futbolista("Luis",1,"Delantero"));
		f.addFutbolista(new Futbolista("Matin",55,"Delantero"));
		f.addFutbolista(new Futbolista("Andres",9,"Delantero"));
		System.out.println(f);
		//f.borrarFutbolista(f.getListaEquipo().get(1));
		System.out.println(f);
		System.out.println("El futbolista con el numero 6 se llama: "+f.elNumero());
		System.out.println("El futbolista con el numero 6 se llama: "+f.dorsalMayor());
		Scanner in = new Scanner(System.in);
		//String jugador = in.next();
		//int numeroj = in.nextInt();
		//String posicion = in.next();
		//f.addFutbolista(new Futbolista(jugador,numeroj,posicion));
		//System.out.println(f);
		//in.close();
		while(true){
			System.out.println("Introduce el nombre del jugador y Salir para salir");
			String jugador = in.next();
			if (jugador.equalsIgnoreCase("Salir")) {
				break;
			}
			System.out.println("Introduce el numero del jugador");
			int numeroj = in.nextInt();
			System.out.println("Introduce la posicion del jugador");
			String posicion = in.next();
			f.addFutbolista(new Futbolista(jugador,numeroj,posicion));
			
		}
		System.out.println(f);
		in.close();
		//String nombre2 = JOptionPane.showInputDialog("introduce el nombre del Jugador");
		//String numeroo = JOptionPane.showInputDialog("introduce el numero del jugador");
		//int numero2 = Integer.parseInt(numeroo);
		//String posicion2 = JOptionPane.showInputDialog("introduce la posicion del Jugador");
		//f.addFutbolista(new Futbolista(nombre2,numero2,posicion2));
		//System.out.println(f);
		while(true){
			String nombre2 = JOptionPane.showInputDialog("introduce el nombre del Jugador y Salir para cerrar");
			if (nombre2.equalsIgnoreCase("Salir")) {
				break;
			}
			String numeroo = JOptionPane.showInputDialog("introduce el numero del jugador");
			int numero2 = Integer.parseInt(numeroo);
			String posicion2 = JOptionPane.showInputDialog("introduce la posicion del Jugador");
			f.addFutbolista(new Futbolista(nombre2,numero2,posicion2));
		
		}
		System.out.println(f);
	}
}	
