/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.GameControl;
import byui.cit260.MormonTrailProject.model.Player;
import java.util.Scanner;

/**
 *
 * @author Isabel Jenson
 */
public class GatheringSuccessView {

    
    



    

    public GatheringSuccessView() {

        
        this.displayBanner();

    }

    private void displayBanner() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                      *"
                + "\n*         Are you ready to attempt gathering?          *"
                + "\n*                                                      *"
                + "\n*Your success will depend on the weather and location! *"
                + "\n*                                                      *"
                + "\n*                                                      *"
                + "\n*******************************************************"
        );

    }

    public void displayGatheringSuccessView() {
        boolean endOfView = false;

        do {
            String inputs = this.getInputs();

            if (inputs == null) {
                
                System.out.println("Please enter a valid choice to continue.");
            } 
            
            else if ("V".equals(inputs)) {
                System.out.println("Thanks for playing!");
                break;
            }
            
            else if ("F".equals(inputs)) {
                System.out.println("Thanks for playing!");
                break;
              
            }
            
            else if ("E".equals(inputs)) {
                System.out.println("Thanks for playing!");
                break;
            }
            
            else {
                endOfView = doAction(inputs);
            }

        } while (endOfView != true);

       }

    private String getInputs() {
        System.out.println("Please, make a choice for gathering.");
        Scanner userInput = new Scanner(System.in);
        String inputs = userInput.nextLine();
        inputs = inputs.trim();

        return inputs;
    }

    private boolean doAction(String inputs) {
        if (inputs.length() < 2) {
            System.out.println("\nInvalid player name: " + "The name must be more than one character.");
            return false;
        }

        Player player = GameControl.createPlayer(inputs);
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
        mainMenuView.displayMainMenuView();

    }

    public void display() {

        displayGatheringSuccessView();

    }
}
