/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tcasey
 */
public class PlayControlTest {
    
    public PlayControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcDailyHealthDraw method, of class PlayControl.
     */
    @Test
    public void testCalcDailyHealthDraw() {
        System.out.println("calcDailyHealthDraw");
        int playerHealth = 15;
        int playerStamina = 1;
        int pace = -5;
        int terrain = -5;
        int weather = -5;
        double expResult = 1;
        double result = PlayControl.calcDailyHealthDraw(playerHealth, playerStamina, pace, terrain, weather);
        assertEquals(expResult, result, 1);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
