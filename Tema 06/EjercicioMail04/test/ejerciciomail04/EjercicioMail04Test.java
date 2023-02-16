/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomail04;

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
public class EjercicioMail04Test {
    
    public EjercicioMail04Test() {
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
     * Test of sonIguales method, of class EjercicioMail04.
     */
    @Test
    public void testSonIguales() {
        System.out.println("sonIguales");
        int[] vector = null;
        int[] vector2 = null;
        boolean expResult = false;
        boolean result = EjercicioMail04.sonIguales(vector, vector2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarIguales method, of class EjercicioMail04.
     */
    @Test
    public void testMostrarIguales() {
        System.out.println("mostrarIguales");
        boolean iguales = false;
        EjercicioMail04.mostrarIguales(iguales);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EjercicioMail04.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EjercicioMail04.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
