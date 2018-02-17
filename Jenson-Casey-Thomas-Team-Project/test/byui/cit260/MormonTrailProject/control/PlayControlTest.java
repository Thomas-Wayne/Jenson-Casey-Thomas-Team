
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
    public void testCalcDailyHealthDraw1() {
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
    public void testCalcDailyHealthDraw2(){
        double result = PlayControl.calcDailyHealthDraw(15, 0, -5, -5, -5);
        assertEquals(-2, result, 0.0);
    }
    @Test
    public void testCalcDailyHealthDraw3(){
        double result = PlayControl.calcDailyHealthDraw(13, 1, -5, -5, -5);
        assertEquals(-1, result, 0.0);
    }
    @Test
    public void testCalcDailyHealthDraw4(){
        double result = PlayControl.calcDailyHealthDraw(100, 5, 0, -2, 2);
        assertEquals(-3, result, 0.0);
    }
    @Test
    public void testCalcDailyHealthDraw5(){
        double result = PlayControl.calcDailyHealthDraw(95, 5, 0, 0, 0);
        assertEquals(100, result, 0.0);
    }
    @Test
    public void testCalcDailyHealthDraw6(){
        double result = PlayControl.calcDailyHealthDraw(15, 1, -5, -5, -5);
        assertEquals(1, result, 0.0);
    }
    @Test
    public void testCalcRiverCrossingProbability1() {
        System.out.println("calcRiverCrossingProbability");
        int riverHeight = 12;
        int wagonWeight = 2800;
        int riverFlow = 3;
        int oxenHealth = 8;
        int weather = 2;
        double expResult = 1;
        double result = PlayControl.calcRiverCrossingProbability(riverHeight, wagonWeight, riverFlow, oxenHealth, weather);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testCalcRiverCrossingProbability2(){
        double result = PlayControl.calcRiverCrossingProbability(12, 3200, 5, 3, -5);
        assertEquals(-1, result, 0.0);
    }
    @Test
    public void testCalcRiverCrossingProbability3(){
        double result = PlayControl.calcRiverCrossingProbability(16, 2600, 8, 5, 0);
        assertEquals(-2, result, 0.0);
    }
    @Test
    public void testCalcRiverCrossingProbability4(){
        double result = PlayControl.calcRiverCrossingProbability(25, 2900, 6, 4, 2);
        assertEquals(-3, result, 0.0);
    }
    @Test
    public void testCalcRiverCrossingProbability5(){
        double result = PlayControl.calcRiverCrossingProbability(16, 2500, 3, 2, 0);
        assertEquals(-4, result, 0.0);
    }
    @Test
    public void testCalcRiverCrossingProbability6(){
        double result = PlayControl.calcRiverCrossingProbability(1, 1300, 1, 3, -5);
        assertEquals(1, result, 0.0);
    }
    @Test
    public void testCalcRiverCrossingProbability7(){
        double result = PlayControl.calcRiverCrossingProbability(24, 3000, 6, 10, 2);
        assertEquals(1, result, 0.0);
    }
    
}
