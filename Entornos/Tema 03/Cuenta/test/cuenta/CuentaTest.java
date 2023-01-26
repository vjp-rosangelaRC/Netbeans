/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rdlrosac01
 */
public class CuentaTest {
    
    public CuentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitular method, of class Cuenta.
     */
    @Test
    public void testGetTitular() {
        System.out.println("getTitular");
        Cuenta instance = new Cuenta();
        String expResult = "";
        String result = instance.getTitular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTitular method, of class Cuenta.
     */
    @Test
    public void testSetTitular() {
        System.out.println("setTitular");
        String titular = "";
        Cuenta instance = new Cuenta();
        instance.setTitular(titular);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class Cuenta.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Cuenta instance = new Cuenta();
        double expResult = 0.0;
        double result = instance.getCantidad();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class Cuenta.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        double cantidad = 0.0;
        Cuenta instance = new Cuenta();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Cuenta.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cuenta instance = new Cuenta();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class Cuenta.
     */
    @Test
    public void testIngresar() {
        System.out.println("ingresar");
        double cantidad = 0.0;
        double expResult = 0.0;
        double result = Cuenta.ingresar(cantidad);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class Cuenta.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        double cantidad = 0.0;
        double expResult = 0.0;
        double result = Cuenta.retirar(cantidad);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Cuenta.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Cuenta.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
