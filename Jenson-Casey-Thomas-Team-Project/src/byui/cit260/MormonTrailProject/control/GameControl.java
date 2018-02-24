/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.control;

import byui.cit260.MormonTrailProject.model.Player;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author tcasey
 */
public class GameControl {

    private static Player player;

    public static Player createPlayer(String inputs) {
        System.out.println("*** savePlayer() called ***");
        return new Player();
    }
    
    public static boolean savePlayer(String name){
    
        if (playerName.length() < 2){
        
            return false;
        }
        
        BYUICIT260MormonTrailProject.setPlayer(player);
        
        return true;
    }   
    
}
