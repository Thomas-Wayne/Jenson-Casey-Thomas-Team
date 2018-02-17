/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public static double calcDailyFoodSupplyDraw (int noPlayers, int weather, int pace, int waterSupply, int foodSupply){
        if (noPlayers <= 0){ //noPlayers cannot be less than or equal to zero (0)
            return -999;
        }
            double dailyFoodSupplyDraw = (weather + pace + (waterSupply(-1)*noPlayers)+(foodSupply(-2)*noPlayers));//-1 represents waterSupply in gallons ; -2 represents foodSupply in pounds
            return dailyFoodSupplyDraw;
    }
}