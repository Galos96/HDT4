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
public class PilaFactoryTest {
    
    public PilaFactoryTest() {
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
     * Test of crearInstancia method, of class PilaFactory.
     */
    @Test
    public void testCrearInstancia() {
        System.out.println("crearInstancia");
        String nombre = "";
        PilaFactory instance = new PilaFactory();
        aPila expResult = null;
        aPila result = instance.crearInstancia(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
