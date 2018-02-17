
package byui.cit260.MormonTrailProject.control;

/**
 *
 * @author tcasey, wthomas, ijenson
 */
public class PlayControl {
    public static double calcDailyHealthDraw (int playerHealth, int playerStamina, 
        int pace, int terrain, int weather){
        
        if (playerHealth > 100 || playerHealth < 15){ //playerHealth out of range
            return -1;
        }
	if (playerStamina <= 0){ // playerStamina must be higher than 0
            return -2;
        }
        if (playerHealth + playerStamina + pace + weather + terrain  > 100){ //healthResult cannot exceed 100
            return -3;
        }
       
        double dailyHealthDraw = (playerHealth + playerStamina + pace + weather + terrain);   
            return dailyHealthDraw;
	
    }
 /**
 * @author tcasey
 */
    public static double calcRiverCrossingProbability (int riverHeight, int wagonWeight, 
        int riverFlow, int oxenHealth, int weather){
        
        if (wagonWeight > 3000){ // riverHeight too high for wagon
            return -1;
        }
	if (riverFlow > 6){ // playerStamina must be higher than 0
            return -2;
        }
        if (riverHeight > 24){ // playerStamina must be higher than 0
            return -3;
        }
        if (oxenHealth < 3){ // playerStamina must be higher than 0
            return -4;
        }
        if (riverHeight + wagonWeight + riverFlow + oxenHealth + weather > 1299){
            return 1;       
	} 
        double riverCrossingProbability = (riverHeight + wagonWeight + riverFlow + oxenHealth + weather);   
            return riverCrossingProbability;
    }
}
