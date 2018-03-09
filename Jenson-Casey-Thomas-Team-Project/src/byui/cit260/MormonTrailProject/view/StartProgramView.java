/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.GameControl;
import byui.cit260.MormonTrailProject.model.Player;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author Jenson, Casey, and Thomas
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n*         Welcome to The Mormon Trail game!           *"
                + "\n*                                                     *"
                + "\n* If you think this game is hard, try coding it!      *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
                + "\nPlease, enter your name: ");

    }

    @Override

    public boolean doAction(String value) {
        if (value.length() < 2) {
            System.out.println("\nInvalid player name: " + "The name must be more than one character.");
            return false;
        }

        Player player = GameControl.createPlayer(value);
        if (player == null) {
            System.out.println("\nError creating the player");

        }
        this.displayNextView(player);
        return true;

    }

    private void displayNextView(Player player) {

        System.out.println("\n***************************************************"
                + "\nWelcome to the game " + player.getName()
                + "\n***************************************************");

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

    }

}
