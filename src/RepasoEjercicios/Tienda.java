package RepasoEjercicios;

import java.util.ArrayList;
import java.util.List;


public class Tienda {
	private List <Productos> lista;

	public Tienda() {
		this.lista = new ArrayList <Productos> ();
	}
	public void addProducto(Productos p){
		this.lista.add(p);
	}
	public List<Productos> getLista() {
		return lista;
	}
	public void eliminarProducto(Productos p){
		if (lista.contains(p)) {
			this.lista.remove(p);
		}
	}
	public Productos productoMasCaro(){
		Productos p = lista.get(0);
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getPrecio() > p.getPrecio() ) {
				p=lista.get(i);
			}
			
		}
		return p;
	}
	public Productos productoMasCaroMejorado(){
		Productos p = lista.get(0);
		for (Productos p1 : lista) {
			if (p1.getPrecio() > p.getPrecio() ) {
				p=p1;
			}
			
		}
		return p;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public Productos productoMasbarato(){
		Productos p = lista.get(0);
		for (Productos productos : lista) {
			if (p.getPrecio() > productos.getPrecio()) {
				p=productos;
			}
			
		}
		return p;
	}
}
