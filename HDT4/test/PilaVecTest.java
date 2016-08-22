/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;
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
public class PilaVecTest {
    
    public PilaVecTest() {
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
     * Test of setVec method, of class PilaVec.
     */
    @Test
    public void testSetVec() {
        System.out.println("setVec");
        Vector vecto = null;
        PilaVec instance = new PilaVec();
        instance.setVec(vecto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getVec method, of class PilaVec.
     */
    @Test
    public void testGetVec() {
        System.out.println("getVec");
        PilaVec instance = new PilaVec();
        Vector vect = new Vector(20,5);
        instance.setVec(vect);
        Vector expResult = vect;
        Vector result = instance.getVec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of push method, of class PilaVec.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object num = null;
        PilaVec instance = new PilaVec();
        instance.push(num);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class PilaVec.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        PilaVec instance = new PilaVec();
        instance.push(" ");
        Object expResult = " ";
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
