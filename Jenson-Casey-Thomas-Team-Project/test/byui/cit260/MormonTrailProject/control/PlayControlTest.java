
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
        int playerHealth = 90;
        int playerStamina = 5;
        int pace = 0;
        int terrain = -2;
        int weather = -3;
        double expResult = 90;
        double result = PlayControl.calcDailyHealthDraw(playerHealth, playerStamina, pace, terrain, weather);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testCase2(){
        double result = PlayControl.calcDailyHealthDraw(15, 0, -5, -5, -5);
        assertEquals(-2, result, 0.0);
    }
    @Test
    public void testCase3(){
        double result = PlayControl.calcDailyHealthDraw(13, 1, -5, -5, -5);
        assertEquals(-1, result, 0.0);
    }
    @Test
    public void testCase4(){
        double result = PlayControl.calcDailyHealthDraw(100, 5, 0, -2, 2);
        assertEquals(-3, result, 0.0);
    }
    @Test
    public void testCase5(){
        double result = PlayControl.calcDailyHealthDraw(95, 5, 0, 0, 0);
        assertEquals(100, result, 0.0);
    }
    @Test
    public void testCase6(){
        double result = PlayControl.calcDailyHealthDraw(15, 1, -5, -5, -5);
        assertEquals(1, result, 0.0);
    }
    
}
