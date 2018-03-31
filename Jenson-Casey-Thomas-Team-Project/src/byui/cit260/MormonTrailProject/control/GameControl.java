/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.control;

import byui.cit260.MormonTrailProject.exceptions.GameControlException;
import byui.cit260.MormonTrailProject.model.Actor;
import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.model.Inventory;
import byui.cit260.MormonTrailProject.model.InventoryItem;
import byui.cit260.MormonTrailProject.model.Location;
import byui.cit260.MormonTrailProject.model.Map;
import byui.cit260.MormonTrailProject.model.Player;
import byui.cit260.MormonTrailProject.model.Scene;
import byui.cit260.MormonTrailProject.view.ErrorView;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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

    public static void createInventory(Player player) {
        System.out.println("*** Inventory()called ***");
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

        ArrayList<Actor> actors = GameControl.createActorList();
        game.setActor(actors);

        Inventory[] inventory = GameControl.createInventory();
        game.setInventory(inventory);

        Map map = MapControl.createMap();
        game.setMap(map);
        if (map == null) {
            return -1;
        }
        return 1;
    }

    public static ArrayList<Actor> createActorList() {
        ArrayList<Actor> actors = new ArrayList();

        actors.add(new Actor("William", 96, 8, "Carpenter"));
        actors.add(new Actor("Joseph", 92, 9, "Mason"));
        actors.add(new Actor("Willford", 95, 5, "Scribe"));
        actors.add(new Actor("Samuel", 93, 7, "Marshall"));
        actors.add(new Actor("Rebecca", 97, 6, "Nurse"));
        actors.add(new Actor("Eliza", 90, 8, "Metalsmith"));
        actors.add(new Actor("Mary", 97, 5, "Seamstress"));
        actors.add(new Actor("Laura", 99, 6, "Chef"));

        return actors;
    }

    public static Inventory[] createInventory() {
        Inventory[] inventory = new Inventory[9];

        inventory[0] = new Inventory(InventoryItem.lumber, 0, 0);
        inventory[1] = new Inventory(InventoryItem.wheel, 0, 0);
        inventory[2] = new Inventory(InventoryItem.food, 0, 0);
        inventory[3] = new Inventory(InventoryItem.water, 0, 0);
        inventory[4] = new Inventory(InventoryItem.tools, 0, 0);
        inventory[5] = new Inventory(InventoryItem.ammunition, 0, 0);
        inventory[6] = new Inventory(InventoryItem.grain, 0, 0);
        inventory[7] = new Inventory(InventoryItem.clothes, 0, 0);
        inventory[8] = new Inventory(InventoryItem.rope, 0, 0);

        return inventory;
    }

    public static Map createMap(int noOfRows, int noOfColumns, Inventory[] inventory) {
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

    public static void createItems(Player player) {
        System.out.println("*** createItems()called ***");
    }

    public Game loadGame(Game game, String filePath) throws FileNotFoundException, IOException {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(filePath))) {
            if (game == null | filePath == null | filePath.length() < 1);
            throw new GameControlException();
        } catch (GameControlException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
            return game;
        } finally {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
                in.readObject();
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), e.getMessage());
                return game;
            }
        }

    }

    public void saveGame(Game game, String filePath) throws Exception {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filePath))) {
            if (game == null | filePath == null | filePath.length() < 1);
            throw new GameControlException();
        } catch (GameControlException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
            return;
        } finally {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
                out.writeObject(filePath);
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), e.getMessage());
                return;
            }
        }
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

    private static void BuyMenuView(Player player) {

    }

}
