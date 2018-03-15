/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.control;

import byui.cit260.MormonTrailProject.model.Actor;
import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.model.Map;
import byui.cit260.MormonTrailProject.model.Player;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author tcasey
 */
public class GameControl {

    private static Player player;

    public static Player createPlayer(String playerName) {
        Player player = new Player();
        player.setName(playerName);
        return player;

    }

    public static boolean savePlayer(String name) {

        if (playerName.length() < 2) {

            return false;
        }

        BYUICIT260MormonTrailProject.setPlayer(player);

        return true;
    }

    public static void generalStoreMenuView(Player player) {

    }

    public void dailyMiles() {
        int distance = PlayControl.calcDistanceTravelDay(BYUICIT260MormonTrailProject.getCurrentGame().getPace().ordinal());
        BYUICIT260MormonTrailProject.getCurrentGame().addMilesTraveled(distance);
    }

    public static Player createNewGame(Player player) {
        if (player == null) {
            return null;
        }
        Game game = new Game();
        game.setPlayer(player);
        BYUICIT260MormonTrailProject.setCurrentGame(game);
        return player;
    }

    private static class Actor {

        private Actor(String name, int stamina, String ability) {
        }
    }

    public static Actor[] createActorList() {
        Actor[] actor = new Actor[8];

        actor[0] = new Actor("William", 8, "Carpenter");
        actor[1] = new Actor("Joseph", 9, "Mason");
        actor[2] = new Actor("Willford", 5, "Scribe");
        actor[3] = new Actor("Samuel", 7, "Marshall");
        actor[4] = new Actor("Rebecca", 6, "Nurse");
        actor[5] = new Actor("Eliza", 8, "Metalsmith");
        actor[6] = new Actor("Mary", 5, "Seamstress");
        actor[7] = new Actor("Laura", 6, "Chef");

        return null;
    }

    public static InventoryItem[] createItems() {
        InventoryItem[] inventory = new InventoryItem[9];

        inventory[0] = new InventoryItem("lumber", 0);
        inventory[1] = new InventoryItem("wheel", 0);
        inventory[2] = new InventoryItem("food", 0);
        inventory[3] = new InventoryItem("water", 0);
        inventory[4] = new InventoryItem("tools", 0);
        inventory[5] = new InventoryItem("ammunition", 0);
        inventory[6] = new InventoryItem("grain", 0);
        inventory[7] = new InventoryItem("clothes", 0);
        inventory[8] = new InventoryItem("rope", 0);

        return null;
    }

    public static Map createMap(int noOfRows, int noOfColumns) {
 //       if (map == null) {

  //      }
        return null;
    }

    private static class InventoryItem {

        private InventoryItem(String description, int quantity) {

        }
    }

    public static void createItems(Player player) {

    }

    public static void loadGame(Player player) {

    }

    public static void saveGame(Player player) {

    }

    public static void getHelp(Player player) {

    }

    public static void riverCrossing(Player player) {

    }

    public static void riverCrossingSceneMenuView(Player player) {

    }

    public static void riverCrossingView(Player player) {

    }

    public static void DailyTrailStopSceneMenuView(Player player) {

    }

    public static void GameMenuView(Player player) {

    }

    public static void getVegetablesView(Player player) {

    }

    public static void gatheringSuccessMenuView(Player player) {

    }

    public static void goHuntingView(Player player) {

    }

    public static void goHuntingSceneMenuView(Player player) {

    }

    public static void handleObstacleView(Player player) {

    }
}
