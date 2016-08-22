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
public class LectorTest {
    
    public LectorTest() {
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
     * Test of setTexto method, of class Lector.
     */
    @Test
    public void testSetTexto() {
        System.out.println("setTexto");
        String texto = "";
        Lector instance = new Lector();
        instance.setTexto(texto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTexto method, of class Lector.
     */
    @Test
    public void testGetTexto() {
        System.out.println("getTexto");
        Lector instance = new Lector();
        instance.setTexto("");
        String expResult = "";
        String result = instance.getTexto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of leer method, of class Lector.
     */
    @Test
    public void testLeer() {
        System.out.println("leer");
        String direc = "";
        Lector instance = new Lector();
        String expResult = null;
        String result = instance.leer(direc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Lector.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Lector instance = new Lector();
        String expResult = "lector de archivos .text";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
