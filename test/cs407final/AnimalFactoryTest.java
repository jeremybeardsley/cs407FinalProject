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
public class AnimalFactoryTest extends TestCase {
    
    public AnimalFactoryTest(String testName) {
        super(testName);
    }

    public static junit.framework.Test suite() {
        junit.framework.TestSuite suite = new junit.framework.TestSuite(AnimalFactoryTest.class);
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
     * Test of createAnimal method, of class AnimalFactory.
     */
    public void testCreateAnimal() throws Exception {
        System.out.println("createAnimal");
        char animalType = ' ';
        Animal expResult = null;
        Animal result = AnimalFactory.createAnimal(animalType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnimalFactory method, of class AnimalFactory.
     */
    public void testGetAnimalFactory() {
        System.out.println("getAnimalFactory");
        AnimalFactory expResult = null;
        AnimalFactory result = AnimalFactory.getAnimalFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnimal method, of class AnimalFactory.
     */
    public void testGetAnimal() {
        System.out.println("getAnimal");
        AnimalFactory instance = new AnimalFactory();
        Animal expResult = null;
        Animal result = instance.getAnimal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
