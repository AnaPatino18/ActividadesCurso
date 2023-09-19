package methaporce.vista;

import methaporce.modelo.Pelicula;

public class Main {
	public static void main(String[] args) {
		
		Pelicula pelicula = new Pelicula(1, "Rapidos y Furiosos 1", true);
		System.out.println(pelicula.getId());
		System.out.println(pelicula.getNombre());
		
	}
	

}
