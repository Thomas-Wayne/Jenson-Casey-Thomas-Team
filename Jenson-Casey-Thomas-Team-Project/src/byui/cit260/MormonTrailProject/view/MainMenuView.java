/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.GameControl;
import byui.cit260.MormonTrailProject.exceptions.GameControlException;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.logging.Level;
import java.util.logging.Logger;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author Jenson, Casey, and Thomas
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\nPlease choose an option: "
                + "\n********************************************"
                + "\n| Main Menu |"
                + "\n********************************************"
                + "\nN - Start new game"
                + "\nL - Load and start a saved game"
                + "\nH - Get help on how to play the game"
                + "\nO - HandleObstacleView"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n********************************************");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

            case "N":
                this.startNewGame();
                break;

            case "L":
                this.loadGame();
                break;

            case "S": {
                try {
                    this.saveGame();
                } catch (GameControlException ex) {

                }
            }
            break;

            case "H":
                this.getHelp();
                break;

            case "O":
                this.handleObstacleView();
                break;

            case "Q":
                this.quitGame();
                break;

            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    private void startNewGame() {
        GameControl.createNewGame(BYUICIT260MormonTrailProject.getPlayer());
        GameControl.GameMenuView(BYUICIT260MormonTrailProject.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void loadGame() {
        this.console.println("\nloadGame() was called");
    }

    private void saveGame() throws GameControlException {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }

    private void getHelp() {
        GameControl.getHelp(BYUICIT260MormonTrailProject.getPlayer());
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void quitGame() {
        System.exit(0);
    }

    private void handleObstacleView() {
        GameControl.handleObstacleView(BYUICIT260MormonTrailProject.getPlayer());
        GameControl.GameMenuView(BYUICIT260MormonTrailProject.getPlayer());
        HandleObstacleView handleObstacleView = new HandleObstacleView();
        handleObstacleView.display();
    }

}
