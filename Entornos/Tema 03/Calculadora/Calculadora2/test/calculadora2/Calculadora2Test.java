/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

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
public class Calculadora2Test {
    
    public Calculadora2Test() {
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
     * Test of main method, of class Calculadora2.
     */
    /*
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of suma method, of class Calculadora2.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 2;
        int b = 2;
        Calculadora2 instance = new Calculadora2();
        int expResult = 4;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Error suma");
    }

    /**
     * Test of resta method, of class Calculadora2.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 2;
        int b = 2;
        Calculadora2 instance = new Calculadora2();
        int expResult = 0;
        int result = instance.resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Error resta");
    }

    /**
     * Test of division method, of class Calculadora2.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int a = 2;
        int b = 2;
        Calculadora2 instance = new Calculadora2();
        int expResult = 1;
        int result = instance.division(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Error división");
    }

    /**
     * Test of multiplicacion method, of class Calculadora2.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int a = 2;
        int b = 2;
        Calculadora2 instance = new Calculadora2();
        int expResult = 4;
        int result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Error multiplicación");
    }
    
}
