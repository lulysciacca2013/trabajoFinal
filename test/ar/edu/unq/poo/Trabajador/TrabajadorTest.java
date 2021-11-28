package ar.edu.unq.poo.Trabajador;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {

	private Trabajador trabajador;
	private Ingreso enero;
	private Ingreso junio;
    private Ingreso diciembre;
    private IngresoPorHoras horasExtras;
	

    @BeforeEach
    void setUp() {
	
    	trabajador = new Trabajador();
    	enero = new Ingreso("Enero", "Sueldo", 25000);
    	junio = new Ingreso("Junio", "Sueldo + Bono", 30000);
    	diciembre = new Ingreso("Diciembre", "Aguinaldo", 15000);
    	horasExtras = new IngresoPorHoras("Noviembre", "Horas extras", 4000, 20);
	
    	trabajador.agregarIngreso(enero);
    	trabajador.agregarIngreso(junio);
    	trabajador.agregarIngreso(diciembre);
    	trabajador.agregarIngreso(horasExtras);
	
    }

    @Test
    public void testGetTotalPercibido() {
	
    	double total = trabajador.getTotalPercibido();
    	assertEquals(total,74000);
    }

    @Test
    public void testGetMontoImponible() {
	
    	double total = trabajador.getMontoImponible();
    	assertEquals(total,70000);
    }

    @Test
    public void testGetImpuestoAPagar() {
	
    	double total = trabajador.getImpuestoAPagar();
    	assertEquals(total,1400);
    }


}


