package BC03.P1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import BC03.P1.Fecha.DatoInvalidoException;
import junit.framework.Assert;

public class FechaTest 
{
	
    @SuppressWarnings("deprecation")
	@Test
    public void test1() throws DatoInvalidoException {
    	// Test 1: Toma como entrada 1 1 0
    	// Para que el test no saliera como fallo 
    	// (porque salta la excepción) hemos puesto el Assert.fail
    	try {
    		Fecha fecha = new Fecha(1, 1, 0);
    		fecha.comprobarBisiesto();
    	} catch(Exception e) {
    		Assert.fail("Ha saltado una excepción");
    	}
    }
    
    @Test
    public void test2() throws DatoInvalidoException {
    	// Test 2: Toma como entrada 1 1 1
    	// debe dar que no es bisiesto
    	Fecha fecha = new Fecha(1, 1, 1);
    	assertEquals(false, fecha.comprobarBisiesto());
    }
    
    @SuppressWarnings("deprecation")
	@Test
    public void test3() throws DatoInvalidoException {
    	// Test 3: Toma como entrada 1 1 -100
    	// Para que el test no saliera como fallo 
    	// (porque salta la excepción) hemos puesto el Assert.fail
    	try {
    		Fecha fecha = new Fecha(1, 1, -100);
    		fecha.comprobarBisiesto();
    	} catch(Exception e) {
    		Assert.fail("Ha saltado una excepción");
    	}
    }
    
    @Test
    public void test4() throws DatoInvalidoException {
    	// Test 4: Toma como entrada 1 1 2012
    	// debe salir que es bisiesto
    	Fecha fecha = new Fecha(1, 1, 2012);
    	assertEquals(true, fecha.comprobarBisiesto());
    }    
}
