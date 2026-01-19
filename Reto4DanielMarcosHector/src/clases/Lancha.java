package clases;

public class Lancha extends Barco {

	//Creación variables.
	protected boolean cubierta;

	public Lancha(String nombre, Motor motor, int capacidadCombustible, boolean cubierta) {
		super(nombre, motor, capacidadCombustible);
		this.cubierta = cubierta;
	}

	public boolean isCubierta() {
		return cubierta;
	}

	public void setCubierta(boolean cubierta) {
		this.cubierta = cubierta;
	}

	@Override
	public String toString() {
		return "Lancha [cubierta=" + cubierta + ", toString()=" + super.toString() + "]";
	}
	
	public double calcularAutonomia() {
		return super.calcularAutonomia();
	}
	
	
	
	
}
