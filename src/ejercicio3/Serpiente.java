/* Rodrigo Valladares Santana L1 
 * Programación de Aplicaciones Interactivas Práctica 4
 * 
 * Ejercicio 2.
 * 
 * La clase Serpiente es la misma de los ejercicios anteriores.
 * La clase MapaSerpientes es un mapa con entradas <String, Serpiente>. En ella se encuentra el método que itera
 * por los elementos del mapa, llamado mostrarSerpientes()
 * 
 * */

package ejercicio3;

import java.util.*;
public class Serpiente {
	
	//Guarda el número de serpientes que se están moviendo
	private int numSerpientes;
	
	//Devuelve el número de serpientes que está reptando
	public int reptar() {
		return numSerpientes;
	}
	
	private void setNumSerpientes(int numSerpientes) {
		this.numSerpientes = numSerpientes;
	}
	
	Serpiente(int numSerpientes) {
		setNumSerpientes(numSerpientes);
	}
	
	public static void main(String[] args) {
	
		MapaSerpientes mapa = new MapaSerpientes();
	
	
		try {
			for(int i = 0; i < args.length; i = i + 2) {
				Serpiente auxiliar = new Serpiente(Integer.parseInt(args[i + 1]));
				mapa.añadirSerpiente(args[i], auxiliar);
			}
		}
		catch(NumberFormatException noNumero) { //Error porque no se ha pasado un número en los argumentos
			System.out.println("Error: los argumentos deben tener el formato: <Nombre serpiente> <Número>");
		}
		
		mapa.mostrarSerpientes();
	

	}

}