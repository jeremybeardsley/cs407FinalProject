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
public class AnimalTest extends TestCase {
    
    public AnimalTest(String testName) {
        super(testName);
    }

    public static junit.framework.Test suite() {
        junit.framework.TestSuite suite = new junit.framework.TestSuite(AnimalTest.class);
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
     * Test of move method, of class Animal.
     */
    public void testMove() {
        System.out.println("move");
        Animal instance = new AnimalImpl();
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eat method, of class Animal.
     */
    public void testEat() {
        System.out.println("eat");
        Animal instance = new AnimalImpl();
        instance.eat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sound method, of class Animal.
     */
    public void testSound() {
        System.out.println("sound");
        Animal.sound();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AnimalImpl extends Animal {

        public void move() {
        }

        public void eat() {
        }
    }
    
}
