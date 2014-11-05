/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs407final;

import junit.framework.TestCase;

/**
 *
 * @author Bear
 */
public class AntelopeTest extends TestCase {
    
    public AntelopeTest(String testName) {
        super(testName);
    }

    public static junit.framework.Test suite() {
        junit.framework.TestSuite suite = new junit.framework.TestSuite(AntelopeTest.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of move method, of class Antelope.
     */
    public void testMove() {
        System.out.println("move");
        Antelope instance = new Antelope();
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eat method, of class Antelope.
     */
    public void testEat() {
        System.out.println("eat");
        Antelope instance = new Antelope();
        instance.eat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
