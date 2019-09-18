package com.chitkara;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static App ab;
    /**
     * Rigorous Test :-)
     */


    @BeforeClass
    public static void first(){
        System.out.println("In before class");
    }
    @Before
    public  void second(){
        System.out.println("In before");
        ab = new App();
    }
    @Test
    public void addTest(){
        assertEquals("Test going",12,ab.add(6,6));
    }
    @Test
    public void getUpperCaseTest(){
        assertEquals("WIPRO",ab.getUpperCase("wipro"));
    }
    @Test
    public void checkTest(){
        assertFalse(ab.check());
    }
    @Test
    public void multiplyTest()
    {
        assertNotEquals(122,ab.multiply(3,3));
    }
}
