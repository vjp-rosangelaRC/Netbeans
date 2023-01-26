/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.perfectos;

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
public class NumerosPerfectosTest {
    
    public NumerosPerfectosTest() {
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
     * Test of esPercto method, of class NumerosPerfectos.
     */
    @Test
    public void testEsPerfecto() {
        System.out.println("esPercto");
        int j = 0;
        NumerosPerfectos instance = new NumerosPerfectos();
        boolean expResult = false;
        boolean result = instance.esPerfecto(j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class NumerosPerfectos.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NumerosPerfectos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
