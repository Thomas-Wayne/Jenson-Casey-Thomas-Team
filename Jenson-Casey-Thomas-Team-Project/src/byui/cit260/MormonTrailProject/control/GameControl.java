/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.control;

import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.model.Location;
import byui.cit260.MormonTrailProject.model.Map;
import byui.cit260.MormonTrailProject.model.Player;
import byui.cit260.MormonTrailProject.model.Scene;
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

    private static void assignScenesToLocations() {

    }

    private static void assignInventoryToScenes() {
    }

    private static void assignQuestionsToScenes() {

    }

    public static void createActorList(Player player) {
        System.out.println("*** createActorList()called ***");
    }

    public static void createInventoryItem(Player player) {
        System.out.println("*** InventoryItem()called ***");
    }

    public static void createMap(Player player) {
        System.out.println("*** createMap()called ***");
    }

    private static Scene createScenes() {
        System.out.println("*** createScenes()called ***");
        return null;
    }

    public void dailyMiles() {
        int distance = PlayControl.calcDistanceTravelDay(BYUICIT260MormonTrailProject.getCurrentGame().getPace().ordinal());
        BYUICIT260MormonTrailProject.getCurrentGame().addMilesTraveled(distance);
    }

    public static int createNewGame(Player player) {
        if (player == null) {
            return -1;
        }
        Game game = new Game();
        game.setPlayer(player);
        BYUICIT260MormonTrailProject.setCurrentGame(game);

        Actor[] actor = GameControl.createActorList();
        game.setActor(actor);

        InventoryItem[] inventory = GameControl.createInventoryItem();
        game.setInventory(inventory);

        Map map = MapControl.createMap();
        game.setMap(map);
        if (map == null) {
            return -1;
        }
        return 1;
    }

    public static class Actor {

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

        return actor;
    }

    public static InventoryItem[] createInventoryItem() {
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

        return inventory;
    }

    public static Map createMap(int noOfRows, int noOfColumns, InventoryItem[] inventory) {
        if (noOfRows < 0 | noOfColumns < 0) {
            return null;
        }
        if (inventory == null | inventory.length < 1) {
        }
        Map map = new Map();
        noOfRows = 8;
        noOfColumns = 10;
        Location[][] locationsInMap = new Location[noOfRows][noOfColumns];
        Scene scenes = createScenes();
        //questions = createQuestions();
        //assignQuestionsToScenes();
        assignInventoryToScenes();
        assignScenesToLocations();

        return map;
    }

    public static class InventoryItem {

        private InventoryItem(String description, int quantity) {

        }
    }

    public static void createItems(Player player) {
        System.out.println("*** createItems()called ***");
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

    private static class Question {

        public Question() {
        }
    }
}
