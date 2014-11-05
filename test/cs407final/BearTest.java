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
public class BearTest extends TestCase {
    
    public BearTest(String testName) {
        super(testName);
    }

    public static junit.framework.Test suite() {
        junit.framework.TestSuite suite = new junit.framework.TestSuite(BearTest.class);
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
     * Test of move method, of class Bear.
     */
    public void testMove() {
        System.out.println("move");
        Bear instance = new Bear();
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eat method, of class Bear.
     */
    public void testEat() {
        System.out.println("eat");
        Bear instance = new Bear();
        instance.eat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
