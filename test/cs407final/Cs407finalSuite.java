/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs407final;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Bear
 */
public class Cs407finalSuite extends TestCase {
    
    public Cs407finalSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("Cs407finalSuite");
        suite.addTest(new TestSuite(cs407final.AntelopeTest.class));
        suite.addTest(new TestSuite(cs407final.AnimalTest.class));
        suite.addTest(new TestSuite(cs407final.CS407FinalTest.class));
        suite.addTest(new TestSuite(cs407final.BearTest.class));
        suite.addTest(new TestSuite(cs407final.RandomMoveStrategyTest.class));
        suite.addTest(new TestSuite(cs407final.FlightMoveStrategyTest.class));
        suite.addTest(new TestSuite(cs407final.MovementStrategyTest.class));
        suite.addTest(new TestSuite(cs407final.AnimalFactoryTest.class));
        suite.addTest(new TestSuite(cs407final.FightMoveStrategyTest.class));
        suite.addTest(new TestSuite(cs407final.InvalidArgumentExceptionTest.class));
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
    
}
