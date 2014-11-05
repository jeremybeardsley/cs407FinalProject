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
public class MovementStrategyTest extends TestCase {
    
    public MovementStrategyTest(String testName) {
        super(testName);
    }

    public static junit.framework.Test suite() {
        junit.framework.TestSuite suite = new junit.framework.TestSuite(MovementStrategyTest.class);
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
     * Test of move method, of class MovementStrategy.
     */
    public void testMove() {
        System.out.println("move");
        String movementType = "";
        MovementStrategy instance = new MovementStrategyImpl();
        instance.move(movementType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MovementStrategyImpl implements MovementStrategy {

        public void move(String movementType) {
        }
    }
    
}
