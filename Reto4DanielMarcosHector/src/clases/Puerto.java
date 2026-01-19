package clases;

import java.util.ArrayList;

public class Puerto {

	protected ArrayList<Barco> barcos;
	
	public boolean entrarBarco(Barco b) {
		if(barcos.size<6) {
			barcos.add(b);
			return true;
		} else {
			System.out.println("Barco lleno.");
			return false;
		}
	}
	public boolean salirBarco(String nombre) {
		if(nombre)
	}
}
