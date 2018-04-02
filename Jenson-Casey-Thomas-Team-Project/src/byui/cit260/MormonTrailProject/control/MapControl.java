/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.control;

import byui.cit260.MormonTrailProject.exceptions.MapControlException;
import byui.cit260.MormonTrailProject.model.InventoryItem;
import byui.cit260.MormonTrailProject.model.Location;
import byui.cit260.MormonTrailProject.model.LocationType;
import byui.cit260.MormonTrailProject.model.Map;
import byui.cit260.MormonTrailProject.model.Scene;
import byui.cit260.MormonTrailProject.model.SceneType;
import byui.cit260.MormonTrailProject.model.TrailStopScene;

/**
 *
 * @author tcasey
 */
public class MapControl {

    public static Location[][] createLocations(int rows, int columns) {

        if ((rows < 1) || (columns < 1)) {
            return null;
        }

        Location[][] locations = new Location[rows][columns];
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                String milepost = new Integer((i + 1) * (j + 1)).toString();
                locations[i][j] = new Location(
                        LocationType.trailStop, milepost,
                        new TrailStopScene("TrailStop " + milepost,
                                true, "SomeTown", true, "SomeFort"));
            }
        }

        //locations[2][5].setScene(new TownScene());
        return locations;
    }

    public enum SceneType {
        start,
        grove,
        pisgah,
        kanesville,
        quarters,
        chimney,
        laramie,
        martins,
        kearny,
        rock,
        bridger,
        salt;
    }

    static Map createMap() {
        // create the map
        Map map = new Map(2, 13);

        // create the scenes for the game
        Scene[] scenes = createScenes();

        // assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);

        return map;
    }

    static void moveActorsToStartingLocation(Map map)
            throws MapControlException {
        // Set starting location to 0,0
        movePlayer(map, 0, 0);
    }

    public static void movePlayer(Map map, int row, int column)
            throws MapControlException {
        if (map == null) {
            throw new MapControlException("Invalid, map cannot be null.");
        }
        map.setCurrentLocation(map.getLocations()[row][column]);

        if (row < 0 || row >= map.getLocations().length
                || column < 0 || column >= map.getLocations()[row].length) {
            throw new MapControlException("Invalid, coordinates are outside map boundaries.");
        }

        map.setCurrentRow(row);
        map.setCurrentColumn(column);
    }

    public static Scene[] getLocations() {
        return null;

    }

    public long getRemainingDistance(int[] distance) {
        long total = 0;

        for (int i = 0; i < distance.length; i++) {
            total += -distance[i];
        }
        return total;
    }

    public static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];

        // Starting - Nauvoo
        Scene startingScene = new Scene();
        startingScene.setName("Nauvoo");
        startingScene.setDescription(
                "");
        startingScene.setMapSymbol("ST");
        startingScene.setDistanceFromNauvoo(0);
        scenes[SceneType.start.ordinal()] = startingScene;

        // Garden Grove, Iowa
        Scene groveScene = new Scene();
        groveScene.setName("Garden Grove");
        groveScene.setDescription(
                "");
        groveScene.setMapSymbol("GG");
        groveScene.setDistanceFromNauvoo(130);
        scenes[SceneType.grove.ordinal()] = groveScene;

        // Mount Pisgah, Iowa
        Scene pisgahScene = new Scene();
        pisgahScene.setName("Mount Pisgah");
        pisgahScene.setDescription(
                "");
        pisgahScene.setMapSymbol("MP");
        pisgahScene.setDistanceFromNauvoo(153);
        scenes[SceneType.pisgah.ordinal()] = pisgahScene;

        // Kanesville (Council Bluffs), Iowa
        Scene kanesvilleScene = new Scene();
        kanesvilleScene.setName("Kanesville (Council Bluffs)");
        kanesvilleScene.setDescription(
                "");
        kanesvilleScene.setMapSymbol("KV");
        kanesvilleScene.setDistanceFromNauvoo(300);
        scenes[SceneType.kanesville.ordinal()] = kanesvilleScene;

        // Winter Quarters (Omaha), Nebraska
        Scene winterQuartersScene = new Scene();
        winterQuartersScene.setName("Winter Quarters");
        winterQuartersScene.setDescription(
                "");
        winterQuartersScene.setMapSymbol("WQ");
        winterQuartersScene.setDistanceFromNauvoo(318);
        scenes[SceneType.quarters.ordinal()] = kanesvilleScene;

        // Chimney Rock, Nebraska
        Scene chimneyScene = new Scene();
        chimneyScene.setName("Chimney Rock");
        chimneyScene.setDescription(
                "");
        chimneyScene.setMapSymbol("CR");
        chimneyScene.setDistanceFromNauvoo(718);
        scenes[SceneType.chimney.ordinal()] = chimneyScene;

        // Fort Laramie, Wyoming. 
        Scene fortLaramieScene = new Scene();
        fortLaramieScene.setName("Fort Laramie");
        fortLaramieScene.setDescription(
                "");
        fortLaramieScene.setMapSymbol("FL");
        fortLaramieScene.setDistanceFromNauvoo(788);
        scenes[SceneType.laramie.ordinal()] = fortLaramieScene;

        // Martin's Cove, Wyoming. 
        Scene martinsCoveScene = new Scene();
        martinsCoveScene.setName("Martin's Cove");
        martinsCoveScene.setDescription(
                "");
        martinsCoveScene.setMapSymbol("MC");
        martinsCoveScene.setDistanceFromNauvoo(964);
        scenes[SceneType.martins.ordinal()] = martinsCoveScene;

        // Fort Kearny, Wyoming. 
        Scene fortKearnyScene = new Scene();
        fortKearnyScene.setName("Fort Kearny");
        fortKearnyScene.setDescription(
                "");
        fortKearnyScene.setMapSymbol("FK");
        fortKearnyScene.setDistanceFromNauvoo(1083);
        scenes[SceneType.kearny.ordinal()] = fortKearnyScene;

        // Independence Rock
        Scene independenceRockScene = new Scene();
        independenceRockScene.setName("Independence Rock");
        independenceRockScene.setDescription(
                "");
        independenceRockScene.setMapSymbol("IR");
        independenceRockScene.setDistanceFromNauvoo(1183);
        scenes[SceneType.rock.ordinal()] = independenceRockScene;

        // Fort Bridger, Wyoming. 
        Scene fortBridgerScene = new Scene();
        fortBridgerScene.setName("Fort Bridger");
        fortBridgerScene.setDescription(
                "");
        fortBridgerScene.setMapSymbol("FB");
        fortBridgerScene.setDistanceFromNauvoo(1236);
        scenes[SceneType.bridger.ordinal()] = fortBridgerScene;

        // Finish Point - The Great Salt Lake Valley
        Scene saltLakeValleyScene = new Scene();
        saltLakeValleyScene.setName("Salt Lake Valley");
        saltLakeValleyScene.setDescription(
                "");
        saltLakeValleyScene.setMapSymbol("SL");
        saltLakeValleyScene.setDistanceFromNauvoo(1302);
        scenes[SceneType.salt.ordinal()] = saltLakeValleyScene;

        return scenes;
    }

    /*public static Question[] createQuestions() {
        System.out.println("*** createQuestions()called ***");
        return null;
    }

    public static void assignQuestionsToScenes() {
        System.out.println("*** assignQuestionsToScenes()called ***");
    }*/

 /* private static void assignInventoryToScenes(InventoryItem[][]inventory) {
        itemsInScene.add(inventory[InventoryItem.lumber.ordinal()]);
        itemsInScene.add(inventory[InventoryItem.wheel.ordinal()]);
        itemsInScene.add(inventory[InventoryItem.food.ordinal()]);
        itemsInScene.add(inventory[InventoryItem.water.ordinal()]);
        itemsInScene.add(inventory[InventoryItem.tools.ordinal()]);
        itemsInScene.add(inventory[InventoryItem.ammunition.ordinal()]);
        itemsInScene.add(inventory[InventoryItem.grain.ordinal()]);
        itemsInScene.add(inventory[InventoryItem.clothes.ordinal()]);
        itemsInScene.add(inventory[InventoryItem.rope.ordinal()]);
        
    }*/
 /* static Map createMap() {
        Map map = new Map();
        Location[][] locations = createLocations(8, 10);
        map.setLocations(locations);
        MapControl.createScenes();
        MapControl.assignInventoryToScenes();
        //MapControl.assignQuestionsToScenes();

        return map;

    }*/
    private static void assignInventoryToScenes() {
        System.out.println("*** assignInventoryToScenes()called ***");
    }

    private static class Question {

        public Question() {
        }
    }

}
