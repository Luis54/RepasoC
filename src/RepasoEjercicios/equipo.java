package RepasoEjercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class equipo {
	private List<Futbolista> listaEquipo;

	public equipo() {
		this.listaEquipo = new ArrayList<Futbolista>();
	}
	//getter array
	
	public List<Futbolista> getListaEquipo() {
		return listaEquipo;
	}

	public void setListaEquipo(List<Futbolista> listaEquipo) {
		this.listaEquipo = listaEquipo;
	}

	//añadimos metedos al array
	public void addFutbolista(Futbolista f){
		this.listaEquipo.add(f);
	}
	//borrar el equipo
	public void borrarFutbolista(Futbolista f){
		if(this.listaEquipo.contains(f))
			this.listaEquipo.remove(f);
	}
	//quien es el juegador con el numero 6
	public Futbolista elNumero(){
		int numeroSeis = 6;
		Futbolista dorsal=null;
		for(Futbolista futbo : listaEquipo){
			if(futbo.getNumero()==numeroSeis){
				numeroSeis=futbo.getNumero();
				dorsal=futbo;
				
						
			}
		}
		return dorsal;
	}
	//numero mayor 
	public Futbolista dorsalMayor(){
		Futbolista numeroMayor = listaEquipo.get(0);
		for (int i = 0; i < listaEquipo.size(); i++) {
			if(listaEquipo.get(i).getNumero() > numeroMayor.getNumero()){
				numeroMayor=listaEquipo.get(i);
			}
		}
		return numeroMayor;
		
	}

	//toString
	@Override
	public String toString() {
		return "equipo [listaEquipo=" + listaEquipo + "]";
	}
	
}
