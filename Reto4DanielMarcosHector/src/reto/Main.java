package reto;

import java.util.ArrayList;

import clases.Catamaran;
import clases.Lancha;
import clases.Motor;
import clases.Yate;
import clases.Puerto;

public class Main {

	public static void main(String[] args) {
	
		Puerto marina = new Puerto();

		// Motor
			Motor m1 = new Motor("Modelo", 100, 50);	
			Motor m2 = new Motor("Modelo", 100, 50);	
			Motor m3 = new Motor("Modelo", 100, 50);	
			Motor m4 = new Motor("Modelo", 100, 50);	
			Motor m5 = new Motor("Modelo", 100, 50);	

			Lancha l1 = new Lancha("Lancha", m1, 50, true);
			Lancha l2 = new Lancha("Lancha", m1, 50, false);
			
		// Yates
			
			Yate y1 = new Yate("Nombre", m5, 50, 100);
			Yate y2 = new Yate("Nombre", m5, 50, 100);
			
			// Catamaran
			
			Catamaran c1 = new Catamaran("Nombre", m5, 50, m2);
			Catamaran c2 = new Catamaran("Nombre", m1, 40, m4);



		
	}

}
