/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import java.util.Scanner;


/**
 *
 * @author Jenson, Casey, and Thomas
 */
 
public class HelpMenuView {

    private String promptMessage;
    private String menu;

    public HelpMenuView() {

        this.promptMessage = "\nPlease choose an option: ";
        this.menu = "\n"
                + "\n*******************************************"
                + "\n| Help Menu |"
                + "\n*******************************************"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move"
                + "\nE - Estimate the number of resources"
                + "\nH - Harvest resources"
                + "\nD - Delivering resources to warehouse"
                + "\nQ - Quit"
                + "\n*******************************************";
    }

    public void displayHelpMenuView() {
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

            case "G":
                this.goalHelp();
                break;

            case "M":
                this.moveHelp();
                break;

            case "E":
                this.estimateHelp();
                break;

            case "H":
                this.harvestHelp();
                break;

            case "D":
                this.deliverHelp();
                break;

            default:
                System.out.println("\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    private void goalHelp() {
        System.out.println("\ngoalHelp() was called");
    }

    private void moveHelp() {
        System.out.println("\nmoveHelp() was called");
    }

    private void estimateHelp() {
        System.out.println("\nestimateHelp() was called");
    }

    private void harvestHelp() {
        System.out.println("\nharvestHelp() was called");
    }

    private void deliverHelp() {
        System.out.println("\ndeliverHelp() was called");
    }

}
