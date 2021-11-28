package ar.edu.unq.poo.Trabajador;

public class IngresoPorHoras extends Ingreso {
	
	private int  horasCant;

	public IngresoPorHoras(String mes,String concepto, double montoPercibido, int horasCant) {
		super(mes,concepto,montoPercibido);
		this.horasCant= horasCant;
	}

	public int getHorasCant() {
		return horasCant;
	}

	public void setHorasCant(int horasCant) {
		this.horasCant = horasCant;
	}
	
	@Override
	
	public double getMontoImponible() {
		return 0;
	}

}
