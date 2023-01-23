/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario_;

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
public class Salario_Test {
    
    public Salario_Test() {
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
     * Test of calcularSalarioBruto method, of class Salario_.
     */
    @Test
    public void testCalcularSalarioBruto() {
        System.out.println("calcularSalarioBruto");
        String tipo = "";
        float ventasMes = 0.0F;
        float horasExtra = 0.0F;
        float expResult = 0.0F;
        float result = Salario_.calcularSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSalarioNeto method, of class Salario_.
     */
    @Test
    public void testCalcularSalarioNeto() {
        System.out.println("calcularSalarioNeto");
        float salarioBruto = 2000F;
        float expResult = 1640F;
        float result = Salario_.calcularSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Salario_.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Salario_.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
