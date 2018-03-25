package byui.cit260.MormonTrailProject.control;

import byui.cit260.MormonTrailProject.exceptions.PlayControlException;
import byui.cit260.MormonTrailProject.model.Pace;

/**
 *
 * @author tcasey, wthomas, ijenson
 */
public class PlayControl {

    public static double calcDailyHealthDraw(int playerHealth, int playerStamina,
            int pace, int terrain, int weather) throws PlayControlException {

        if (playerHealth > 100 || playerHealth < 1) { //playerHealth out of range
            throw new PlayControlException("playerHealth out of range.");
        }
        if (playerStamina <= 0) { // playerStamina must be higher than 0
            throw new PlayControlException("playerStamina must be higher than 0.");
        }
        if (playerHealth + playerStamina + pace + weather + terrain > 100) { //healthResult cannot exceed 100
            throw new PlayControlException("healthResult cannot exceed 100.");
        }
            
        double dailyHealthDraw = (playerHealth + playerStamina + pace + weather + terrain);
        return dailyHealthDraw;

    }

    // Author tcasey
    public static double calcRiverCrossingProbability(int riverHeight, int wagonWeight,
            int riverFlow, int oxenHealth, int weather) throws PlayControlException {

        if (wagonWeight > 3000) { // wagonWeight too heavy, must be less than 3001
           throw new PlayControlException("wagonWeight too heavy, must be less than 3001.");
        }
        if (riverFlow > 6) { // riverFlow too swift, must be less than 6
            throw new PlayControlException("riverFlow too swift, must be less than 6.");
        }
        if (riverHeight > 24) { // riverHeight too high, must not be hight than 24"
            throw new PlayControlException("riverHeight too high, must not be hight than 24.");
        }
        if (oxenHealth < 3) { // oxenHealth too low, oven must be 3 or higher
            throw new PlayControlException("oxenHealth too low, oven must be 3 or higher.");
        }
        if (riverHeight + wagonWeight + riverFlow + oxenHealth + weather >= 1300) {
            return 1;
        }
        double riverCrossingProbability = (riverHeight + wagonWeight + riverFlow + oxenHealth + weather);
        return riverCrossingProbability;
    }

//Author Wayne Thomas
    public static double calcDailyFoodSupplyDraw(int noPlayers, int weather, int pace, int waterSupply, int foodSupply) throws PlayControlException {
        if (noPlayers <= 0) { //noPlayers cannot be less than or equal to zero (0)
            throw new PlayControlException("noPlayers cannot be less than 1.");
        }
        double dailyFoodSupplyDraw = (weather + pace + (waterSupply * noPlayers) + (foodSupply * noPlayers));
        return dailyFoodSupplyDraw;
    }

    // Isabel Jenson
    public static double calcGatheringSuccess(int weather, int location, int localResources) throws PlayControlException {

        if (weather + location + localResources > 0) {
            return 2;
        }
        if (weather + location + localResources < 0) {
            throw new PlayControlException("Gathering was unsuccessful.");
        }
        double calcGatheringSuccess = (weather + location + localResources);
        return calcGatheringSuccess;
    }

    public static int calcDistanceTravelDay(int paceValue) {
        int distanceRemainingValue = 0;
        if (paceValue == 6) {
            distanceRemainingValue = paceValue;
            return distanceRemainingValue;
        } else if (paceValue == 10) {
            distanceRemainingValue = paceValue;
            return distanceRemainingValue;
        } else if (paceValue == 16) {
            distanceRemainingValue = paceValue;
            return distanceRemainingValue;
        } else {
            return distanceRemainingValue;
        }
    }
}
