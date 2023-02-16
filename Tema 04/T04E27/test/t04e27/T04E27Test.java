/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e27;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ross
 */
public class T04E27Test {
    
    public T04E27Test() {
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
     * Test of respuestaMoneda method, of class T04E27.
     */
    @Test
    public void testRespuestaMoneda() {
        System.out.println("respuestaMoneda");
        String expResult = "";
        String result = T04E27.respuestaMoneda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of monedaAleatoria method, of class T04E27.
     */
    @Test
    public void testMonedaAleatoria() {
        System.out.println("monedaAleatoria");
        String expResult = "";
        String result = T04E27.monedaAleatoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class T04E27.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        T04E27.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
