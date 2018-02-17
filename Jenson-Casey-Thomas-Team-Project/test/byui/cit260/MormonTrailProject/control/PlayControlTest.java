
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
    
     /**
     * Test of calcDailyFoodSupplyDraw method, of class PlayControl.
     */
    @Test
    public void testCalcDailyFoodSupplyDraw() {
        System.out.println("calcDailyFoodSupplyDraw");
        int noPlayers = 4;
        int weather = -3;
        int pace = -2;
        int waterSupply = -1;
        int foodSupply = -2;
        double expResult = -17;
        double result = PlayControl.calcDailyFoodSupplyDraw(noPlayers, weather, pace, waterSupply, foodSupply);

        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testFoodDrawCase2(){
        double result = PlayControl.calcDailyFoodSupplyDraw(0, -5, 0, -1, -2);
        assertEquals(-999, result, 0.0);//returns error for noPlayers <= 0
    }
    @Test
    public void testFoodDrawCase3(){
        double result = PlayControl.calcDailyFoodSupplyDraw(1, -5, -5, -1, -2);
        assertEquals(-13, result, 0.0);
    }
    @Test
    public void testFoodDrawCase4(){
        double result = PlayControl.calcDailyFoodSupplyDraw(5, -5, -5, -1, -2);
        assertEquals(-25, result, 0.0);
    }
    @Test
    public void testFoodDrawCase5(){
        double result = PlayControl.calcDailyFoodSupplyDraw(1, 2, 0, -1, -2);
        assertEquals(-1, result, 0.0);
    }
    @Test
    public void testFoodDrawCase6(){
        double result = PlayControl.calcDailyFoodSupplyDraw(5, 2, 0, -1, -2);
        assertEquals(-13, result, 0.0);
    }
        
    
   
}
