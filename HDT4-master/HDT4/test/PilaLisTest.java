/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
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
public class PilaLisTest {
    
    public PilaLisTest() {
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
     * Test of setVec method, of class PilaLis.
     */
    @Test
    public void testSetVec() {
        System.out.println("setVec");
        LinkedList<String> vecto = null;
        PilaLis instance = new PilaLis();
        instance.setVec(vecto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getVec method, of class PilaLis.
     */
    @Test
    public void testGetVec() {
        System.out.println("getVec");
        PilaLis instance = new PilaLis();
        LinkedList<String> vect = new  LinkedList<String>();
        instance.setVec(vect);
        LinkedList<String> expResult =vect;
        LinkedList<String> result = instance.getVec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of push method, of class PilaLis.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object num = null;
        PilaLis instance = new PilaLis();
        instance.push(num);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class PilaLis.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        PilaLis instance = new PilaLis();
        instance.push(" ");
        Object expResult = " ";
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
