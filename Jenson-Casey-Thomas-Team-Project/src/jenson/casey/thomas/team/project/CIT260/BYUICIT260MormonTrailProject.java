/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenson.casey.thomas.team.project.CIT260;

import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.model.Pace;
import byui.cit260.MormonTrailProject.model.Player;
import byui.cit260.MormonTrailProject.model.Inventory;
import byui.cit260.MormonTrailProject.model.Event;
import byui.cit260.MormonTrailProject.model.InventoryItemType;
//import java.util.HashSet;
//import java.util.Set;

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
        
     
        
        
  
        
    }
    
}
