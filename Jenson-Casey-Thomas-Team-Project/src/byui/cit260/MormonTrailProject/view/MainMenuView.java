/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.GameControl;
import static byui.cit260.MormonTrailProject.control.GameControl.riverCrossingView;
import java.util.Scanner;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author Jenson, Casey, and Thomas
 */
class MainMenuView {

    private String promptMessage;
    private String menu;

    public MainMenuView() {
        this.promptMessage = "\nPlease choose an option: ";
        this.menu = "\n"
                + "\n********************************************"
                + "\n| Main Menu |"
                + "\n********************************************"
                + "\nN - Start new game"
                + "\nL - Load and start a saved game"
                + "\nH - Get help on how to play the game"
                + "\nR - RIVERCROSSINGSCENEMENUVIEW"
                + "\nC - RIVERCROSSINGVIEW"
                + "\nG - GATHERINGSUCCESSMENUVIEW"
                + "\nA - GATHERINGSUCCESSVIEW"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n********************************************";
    }

    public void displayMainMenuView() {
        boolean endOfView = false;

        do {
            String menuOption = this.getMenuOption();

            if (menuOption.toUpperCase().equals("Q")) {
                System.out.println("Thanks for playing!");
                return;
            } else {
                endOfView = doAction(menuOption);
            }

        } while (endOfView != true);

    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        while (!valid) {

            System.out.println("\n" + this.menu);
            System.out.println("\n" + this.promptMessage);
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() < 1) {

                System.out.println("\nInvalid value: Value cannot be blank");
                continue;

            }
            break;
        }
        return value;

    }

    private boolean doAction(String menuOption) {

        menuOption = menuOption.toUpperCase();
        switch (menuOption) {

            case "N":
                this.startNewGame();
                break;

            case "L":
                this.loadGame();
                break;

            case "S":
                this.saveGame();
                break;
            
            case "R":
                this.riverCrossingSceneMenuView();
                break;
                
            case "C":
                this.riverCrossingView();
                break;
                
            case "G":
                this.gatheringSuccessMenuView();
                break;
                
            case "A":
                this.gatheringSuccessView();
                break;
                
            case "H":
                this.getHelp();
                break;

            case "Q":
                this.quitGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    private void startNewGame() {
        System.out.println("\nstartNewGame() was called");

    }

    private void loadGame() {
        System.out.println("\nloadGame() was called");
    }

    private void saveGame() {
        System.out.println("\nsaveGame() was called");
    }
    
    private void riverCrossingSceneMenuView(){
        GameControl.riverCrossingSceneMenuView(BYUICIT260MormonTrailProject.getPlayer());
        RiverCrossingSceneMenuView riverCrossingSceneMenuView = new RiverCrossingSceneMenuView();
        riverCrossingSceneMenuView.displayRiverCrossingSceneMenuView();
    }

    private void riverCrossingView(){
        GameControl.riverCrossingView(BYUICIT260MormonTrailProject.getPlayer());
        RiverCrossingView riverCrossingView = new RiverCrossingView();
        riverCrossingView.displayRiverCrossingView();
    }
    private void getHelp() {
        /*GameControl.getHelp(BYUICIT260MormonTrailProject.getPlayer());
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();*/
        System.out.println("\nsaveGame() was called");
    }

    private void quitGame() {
        System.exit(0);
    }

    private void gatheringSuccessMenuView() {
        GameControl.gatheringSuccessMenuView(BYUICIT260MormonTrailProject.getPlayer());
        GatheringSuccessMenuView gatheringSuccessMenuView = new GatheringSuccessMenuView();
        gatheringSuccessMenuView.displayGatheringSuccessMenuView();
    }

    private void gatheringSuccessView() {
        GameControl.gatheringSuccessView(BYUICIT260MormonTrailProject.getPlayer());
        GatheringSuccessView gatheringSuccessView = new GatheringSuccessView();
        gatheringSuccessView.displayGatheringSuccessView();
        
    }

}
