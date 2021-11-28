package ar.edu.unq.poo.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private ArrayList <Ingreso> ingreso = new ArrayList <Ingreso>() ;
	
	
	
	public Trabajador() {
		
	}



	public List <Ingreso> getIngreso() {
		return ingreso;
	}



	public void setIngreso(ArrayList <Ingreso> ingreso) {
		this.ingreso = ingreso;
	}
	
	public double getTotalPercibido() {
	    double total=0;
		for (Ingreso ingreso:this.getIngreso()) {
			total= total + ingreso.getMontoPercibido();
		}
		return total;
	}
		
	public double getMontoImponible() {
		 double total=0;
			for (Ingreso ingreso:this.getIngreso()) {
				total= total + ingreso.getMontoImponible();
			}
			return total;
		
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		this.getIngreso().add(ingreso);
	}
	

}
