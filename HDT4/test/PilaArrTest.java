/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
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
public class PilaArrTest {
    
    public PilaArrTest() {
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
     * Test of setVec method, of class PilaArr.
     */
    @Test
    public void testSetVec() {
        System.out.println("setVec");
        ArrayList<String> vecto = null;
        PilaArr instance = new PilaArr();
        instance.setVec(vecto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getVec method, of class PilaArr.
     */
    @Test
    public void testGetVec() {
        System.out.println("getVec");
        PilaArr instance = new PilaArr();
        ArrayList<String> vect = new  ArrayList<String>();
        instance.setVec(vect);
        ArrayList<String> expResult =vect;
        ArrayList<String> result = instance.getVec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of push method, of class PilaArr.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object num = null;
        PilaArr instance = new PilaArr();
        instance.push(num);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class PilaArr.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        PilaArr instance = new PilaArr();
        instance.push(" ");
        Object expResult = " ";
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
