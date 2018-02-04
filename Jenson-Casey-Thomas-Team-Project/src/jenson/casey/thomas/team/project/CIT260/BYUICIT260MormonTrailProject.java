/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenson.casey.thomas.team.project.CIT260;

import byui.cit260.MormonTrailProject.model.FortScene;
import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.model.GeneralStoreScene;
import byui.cit260.MormonTrailProject.model.HotelScene;
import byui.cit260.MormonTrailProject.model.Location;
import byui.cit260.MormonTrailProject.model.LocationType;
import byui.cit260.MormonTrailProject.model.Map;
import byui.cit260.MormonTrailProject.model.Pace;
import byui.cit260.MormonTrailProject.model.Player;
import byui.cit260.MormonTrailProject.model.Inventory;
import byui.cit260.MormonTrailProject.model.Event;
import byui.cit260.MormonTrailProject.model.InventoryItemType;
//import java.util.HashSet;
//import java.util.Set;
import byui.cit260.MormonTrailProject.model.RiverCrossingScene;
import byui.cit260.MormonTrailProject.model.Scene;
import byui.cit260.MormonTrailProject.model.TownScene;
import byui.cit260.MormonTrailProject.model.TrailStopScene;

/**
 *
 * @author Jenson, Casey, and Thomas
 */
public class BYUICIT260MormonTrailProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Bob Freeber");
        playerOne.setMoney(1000);
        playerOne.setHuntingSkill(30);
        playerOne.setGatheringSkill(80);
        playerOne.setDailyStaminaDraw(5);
        playerOne.setCurrentHealth(100);
        
        String playerOneName = playerOne.getName();
        int playerOneMoney = playerOne.getMoney();
        int playerOneHuntingSkill = playerOne.getHuntingSkill();
        int playerOneGatheringSkill = playerOne.getGatheringSkill();
        int playerOneDailyStaminaDraw = playerOne.getDailyStaminaDraw();
        int playerOneCurrentHealth = playerOne.getCurrentHealth();
        
        System.out.println(playerOne.toString());
        
        Inventory newInventory = new Inventory();
        
        newInventory.setItemType("ox");
        newInventory.getCurrentStrength();
        newInventory.getCurrentWeight();
        
        System.out.println(newInventory.toString());
        
        Event newEvent = new Event();
        
        newEvent.setDescription("Snake Bite");
        newEvent.getHealthImpact();

        System.out.println(newEvent.toString());
        
      

        for (InventoryItemType s : InventoryItemType.values()) System.out.println(s);
        
        
       
        
  
        
        
        
        
        
        Game newGame = new Game();
        
        newGame.setDaysOnTrail(10);
        newGame.setPace("Slow speed");
        newGame.setMilesTraveled(120);
        newGame.setCurrentMoneyBalance(700);
        newGame.setPlayer(playerOne);
        
        int newGameDaysOnTrail = newGame.getDaysOnTrail();
        String newGamePace = newGame.getPace();
        int newGameMilesTraveled = newGame.getMilesTraveled();
        int newGameCurrentMoneyBalance = newGame.getCurrentMoneyBalance();
        Player newGamePlayer = newGame.getPlayer();
        
        System.out.println(newGame.toString());
        
     
        
        
  
        
        for(Pace s :Pace.values()){
            System.out.println(s);
        }  
        
        
        Scene newScene = new Scene();
        
        newScene.setDiscription("Winter Quarters");
        newScene.setFortScene("True");
        newScene.setGeneralStoreScene("Inventory Available");
        newScene.setHotelScene("Not Available");
        newScene.setRiverCrossingScene("Lets go fishing.");
        newScene.setTrailStopScene("other");
        
        String newSceneDiscription = newScene.getDiscription();
        String newSceneFortScene = newScene.getFortScene();
        String newSceneGeneralStoreScene = newScene.getGeneralStoreScene();
        String newSceneHotelScene = newScene.getHotelScene();
        String newSceneRiverCrossingScene = newScene.getRiverCrossingScene();
        String newSceneTrailStopScene = newScene.getTrailStopScene();
                
        System.out.println(newScene.toString());
        
        FortScene newFortScene = new FortScene();
      
        newFortScene.setGeneralStoreScene("Inventory");
        
        String newFortSceneGeneralStoreScene = newFortScene.getGeneralStoreScene();
        
        System.out.println(newFortScene.toString());
        
        GeneralStoreScene newGeneralStoreScene = new GeneralStoreScene();
        
        newGeneralStoreScene.setInventory("ox");
        
        String newGeneralStoreSceneInventory = newGeneralStoreScene.getInventory();
        
        System.out.println(newGeneralStoreScene.toString());
        
        HotelScene newHotelScene = new HotelScene();
        
        newHotelScene.setPlayer(playerOne);
        
        Player newHotelScenePlayer = newHotelScene.getPlayer();
        
        System.out.println(newHotelScene.toString());
        
        TownScene newTownScene = new TownScene();
      
        newTownScene.setGeneralStoreScene("wagon");
        newTownScene.setHotelScene("PlayerTwo");
        
        String newTownSceneGeneralStoreScene = newTownScene.getGeneralStoreScene();
        String newTownSceneHotelScenePlayer = newTownScene.getHotelScene();
        
        System.out.println(newTownScene.toString());
        
        RiverCrossingScene newRiverCrossingScene = new RiverCrossingScene();
        
        System.out.println(newRiverCrossingScene.toString());
        
        TrailStopScene newTrailStopScene = new TrailStopScene();
      
        newTrailStopScene.setHasNearByTown(true);
        newTrailStopScene.setNearbyTownName("Winter Quarters");
        newTrailStopScene.setHasNearbyFort(true);
        newTrailStopScene.setNearbyFortName("Fort Kearny");
        
        boolean newTrailStopSceneHasNearByTown = newTrailStopScene.isHasNearByTown();
        String newTrailStopSceneNearbyTownName = newTrailStopScene.getNearbyTownName();
        boolean newTrailStopSceneHasNearByFort = newTrailStopScene.isHasNearbyFort();
        String newTrailStopSceneNearbyFortName = newTrailStopScene.getNearbyFortName();                   
        
        System.out.println(newTrailStopScene.toString());
         
        
        Map newMap = new Map();
        
        newMap.setCurrentLocation("Winter Quarters");
        
        String newMapCurrentLocation = newMap.getCurrentLocation();
        
        System.out.println(newMap.toString());
        
        
        Location newLocation = new Location();
        
        
        newLocation.setType("Chimney Rock");
        newLocation.setMilepost("NW 989");
        
        
        String newLocationType = newLocation.getType();
        String newLocationMilepost = newLocation.getMilepost();
        
        System.out.println(newLocation.toString());


        for (LocationType s : LocationType.values()){
        System.out.print(s);
        }
        
    }
}


