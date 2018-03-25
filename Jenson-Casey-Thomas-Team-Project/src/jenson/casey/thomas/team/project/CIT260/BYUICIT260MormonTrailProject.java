/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenson.casey.thomas.team.project.CIT260;

import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.model.Player;
import byui.cit260.MormonTrailProject.view.StartProgramView;
import java.io.PrintStream;

/**
 *
 * @author Jenson, Casey, and Thomas
 */
public class BYUICIT260MormonTrailProject {

    /**
     * @param args the command line arguments
     */
    private static Player player = null;

    private static Game currentGame = null;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        BYUICIT260MormonTrailProject.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        BYUICIT260MormonTrailProject.currentGame = currentGame;
    }

    public static void main(String[] args) {
        try{
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        } catch (Exception e) {
          
        System.out.println("Message from main() Exception occurred");
        e.printStackTrace(System.out);
        }
    }

}
