
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
        
        if (wagonWeight > 3000){ // wagonWeight too heavy, must be less than 3001
            return -1;
        }
	if (riverFlow > 6){ // riverFlow too swift, must be less than 6
            return -2;
        }
        if (riverHeight > 24){ // riverHeight too high, must not be hight than 24"
            return -3;
        }
        if (oxenHealth < 3){ // oxenHealth too low, oven must be 3 or higher
            return -4;
        }
        if (riverHeight + wagonWeight + riverFlow + oxenHealth + weather >= 1300){
            return 1;       
	} 
        double riverCrossingProbability = (riverHeight + wagonWeight + riverFlow + oxenHealth + weather);   
            return riverCrossingProbability;
    }


    public static double calcDailyFoodSupplyDraw (int noPlayers, int weather, int pace, int waterSupply, int foodSupply){
        if (noPlayers <= 0){ //noPlayers cannot be less than or equal to zero (0)
            return -999;
        }
            double dailyFoodSupplyDraw = (weather + pace + (waterSupply*noPlayers)+(foodSupply*noPlayers));//-1 represents waterSupply in gallons ; -2 represents foodSupply in pounds
            return dailyFoodSupplyDraw;
    }
}
