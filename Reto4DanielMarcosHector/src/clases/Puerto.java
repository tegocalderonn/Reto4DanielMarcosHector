package clases;
import java.util.ArrayList;

import clases.Barco;

public class Puerto {
protected ArrayList<Barco> barcos;

public Puerto(ArrayList<Barco> barcos) {
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
}
