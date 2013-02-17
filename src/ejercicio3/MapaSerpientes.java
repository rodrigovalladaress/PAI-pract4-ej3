/* Rodrigo Valladares Santana L1 
 * Programación de Aplicaciones Interactivas Práctica 4
 * 
 * Ejercicio 2.
 * 
 * */

package ejercicio3;
import java.util.*;

public class MapaSerpientes {
	
	private Map<String, Serpiente> mapa;
	public MapaSerpientes() {
		mapa = new HashMap<String, Serpiente>();
	}
	
	public void añadirSerpiente(String nombre, Serpiente serpiente) {
		mapa.put(nombre, serpiente);
	}
	
	public Serpiente consulta(String nombre) {
		return mapa.get(nombre);
	}
	
	public boolean estaIncluido(String nombre) {
		return mapa.containsKey(nombre);
	}
	
	//Itera por los elementos del hash mediante un Iterator
	public void mostrarSerpientes() {
		//Conjunto de entradas de mapa del tipo <String, Serpiente>
		Set<Map.Entry<String, Serpiente>> lista = mapa.entrySet();
		//Iterador de entradas de mapa del tipo <String, Serpiente>
		Iterator<Map.Entry<String, Serpiente>> iterador = lista.iterator();
		while(iterador.hasNext()) {
			Map.Entry<String, Serpiente> entradaActual = iterador.next();
			System.out.println("En " + entradaActual.getKey() + " reptan " + entradaActual.getValue().reptar() + " serpientes.");
		}
	}
}
