/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego Valdez
 */
public class CalculadorTest {
    
    public CalculadorTest() {
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
     * Test of calculo method, of class Calculador.
     */
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        String sn1 = "1";
        String sn2 = "2";
        String sgn = "+";
        Calculador instance = new Calculador();
        String expResult = "3";
        String result = instance.calculo(sn1, sn2, sgn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
