/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author JavierSolís
 */
public class OperadoresTest {
    
    public OperadoresTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Operadores.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 10;
        int b = 5;
        Operadores instance = new Operadores();
        int expResult = 15;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
        if (result !=expResult){
            
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of resta method, of class Operadores.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 20;
        int b = 5;
        Operadores instance = new Operadores();
        int expResult = 15;
        int result = instance.resta(a, b);
        assertEquals(expResult, result);
        if (result !=expResult){
            
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of mult method, of class Operadores.
     */
    @Test
    public void testMult() {
        System.out.println("mult");
        int a = 10;
        int b = 9;
        Operadores instance = new Operadores();
        int expResult = 90;
        int result = instance.mult(a, b);
        assertEquals(expResult, result);
        if (result !=expResult){
            
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of div method, of class Operadores.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        int a = 4;
        int b = 2;
        Operadores instance = new Operadores();
        int expResult = 2;
        int result = instance.div(a, b);
        assertEquals(expResult, result);
        if (result !=expResult){
            
            fail("The test case is a prototype.");
        }
    }
    
}
