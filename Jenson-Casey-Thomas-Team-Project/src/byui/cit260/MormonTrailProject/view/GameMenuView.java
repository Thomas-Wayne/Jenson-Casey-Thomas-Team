/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.GameControl;
import java.util.Scanner;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author Thomas
 */
class GameMenuView {

    private String promptMessage;
    private String menu;

    public GameMenuView() {
        this.promptMessage = "\nPlease choose an option: ";
        this.menu = "\n"
                + "\n********************************************"
                + "\n| Game Play Menu |"
                + "\n********************************************"
                + "\nT - View team status"
                + "\nV - View team supplies"
                + "\nP - Set Team Pace"
                + "\nS - Scene menu"
                + "\nM - View the map"
                + "\nH - Help menu"
                + "\nQ - Quit"
                + "\n********************************************";
    }

    public void displayGameMenuView() {
        boolean endOfView = false;

        do {
            String menuOption = this.getMenuOption();

            if (menuOption.toUpperCase().equals("Q")) {
                return;
            } else {
                endOfView = doAction(menuOption);
            }

        } while (endOfView != true);

    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "T";
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

            case "T":
                this.viewTeamStatus();
                break;

            case "V":
                this.viewTeamSupplies();
                break;

            case "P":
                this.setTeamPace();
                break;

            case "S":
                this.sceneMenu();
                break;

            case "M":
                this.viewMap();
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

    private void quitGame() {
        System.exit(0);
    }

    private void getHelp() {
        GameControl.getHelp(BYUICIT260MormonTrailProject.getPlayer());
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void viewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void sceneMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTeamPace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewTeamSupplies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewTeamStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
