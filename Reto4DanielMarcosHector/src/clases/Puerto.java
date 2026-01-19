package clases;
import java.util.ArrayList;

import clases.Barco;

public class Puerto {
protected ArrayList<Barco> barcos;

public Puerto() {
	super();
	this.barcos = new ArrayList<Barco>();
}

public ArrayList<Barco> getBarcos() {
	return barcos;
}
public void setBarcos(ArrayList<Barco> barcos) {
	this.barcos = barcos;
}
@Override
public String toString() {
	return "Puerto [barcos=" + barcos + "]";
}


public boolean entrarBarco(Barco b) {
	if(barcos.size()<6) {
		barcos.add(b);
		return true;
	}else {
		return false;
	
	}
	
}
public boolean salirBarco(String nombre) {
	if(barcos.contains(nombre)) {
		barcos.remove(nombre);
		return true;
	}
	else {
		return false;
	}
}
public double calcularPrecioViaje(Barco b, int horas, double precioCombustible) {
	if(horas<b.capacidadCombustible) {
		return -1;
	}else {
		return horas*b.getMotor().getConsumo()*precioCombustible;
	}
}

}
