/**
 * Class AnimalFactoryTest which represents a test class for functionality 
 * related to the AnimalFactory and Animal Creation
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-4-2014
 */
package cs407final.Test;

import cs407final.creatures.Animal;
import cs407final.creatures.AnimalFactory;
import cs407final.creatures.InvalidArgumentException;
import junit.framework.TestCase;

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
    public void testCreateAnimalFailure() throws Exception {
        System.out.println("Testing of createAnimal, forcing an exception:");
        try{
        char animalType = ' ';
        Animal result = AnimalFactory.createAnimal(animalType);
        fail("Exception was not thrown, CreatAnimalFailure Test Failed!");
        }
        catch (InvalidArgumentException ex){
            System.out.println("Exception Caught correctly for CreateAnimalFailure!");
        }
            
    }

    /**
     * Test of createAnimal method, of class AnimalFactory.
     */
    public void testCreateAnimalAntelope() throws Exception {
        System.out.println("Testing of createAnimal for type Antelope:");
        char animalType = 'a';
        Animal testAnimal = AnimalFactory.createAnimal(animalType);
        assertNotNull(testAnimal);
        System.out.println("Animal Antelope Created Correctly!");
    }

    /**
     * Test of createAnimal method, of class AnimalFactory.
     */
    public void testCreateAnimalBear() throws Exception {
        System.out.println("Testing of createAnimal for type Bear:");
        char animalType = 'b';
        Animal result = AnimalFactory.createAnimal(animalType);
        assertNotNull(result);
        System.out.println("Animal Bear Created Correctly!");
     
    }
    public void testSingletonFunctionality() throws Exception{
        System.out.println("Singleton Functionality Test:");
        AnimalFactory case2 = AnimalFactory.getAnimalFactory();
        AnimalFactory case1 = AnimalFactory.getAnimalFactory();
        assertEquals(case1, case2);
        System.out.println("Singleton implementation of AnimalFactory is working as expected!");
    }
    }
