package ar.edu.unq.poo.Trabajador;

public class Ingreso {
	
	private String mes;
	private String concepto;
	private double montoPercibido;

	public Ingreso(String mes,String concepto, double montoPercibido) {
		this.mes= mes;
		this.concepto=concepto;
		this.montoPercibido= montoPercibido;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMontoPercibido() {
		return montoPercibido;
	}

	public void setMontoPercibido(double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}
	
	public double getMontoImponible() {
		return this.montoPercibido;
	}
}
