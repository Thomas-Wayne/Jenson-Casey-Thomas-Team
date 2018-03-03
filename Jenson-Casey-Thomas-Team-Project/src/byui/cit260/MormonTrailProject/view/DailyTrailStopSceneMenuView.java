/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import java.util.Scanner;

/**
 *
 * @author WThomas
 */
public class DailyTrailStopSceneMenuView {

    private String promptMessage;
    private String menu;

    public DailyTrailStopSceneMenuView() {
        this.promptMessage = "\nPlease choose an option: ";
        this.menu = "\n"
                + "\n********************************************"
                + "\n| Daily Trail Stop Scene Menu |"
                + "\n********************************************"
                + "\nT - Visit the town"
                + "\nF - Visit the fort"
                + "\nC - Cross the River"
                + "\nR - Rest for the day"
                + "\nH - Go Hunting"
                + "\nG - Gather resources"
                + "\nQ - Quit"
                + "\n********************************************";
    }

    public void displayDailyTrailStopSceneMenuView() {
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
                this.visitTheTown();
                break;

            case "F":
                this.visitTheFort();
                break;

            case "C":
                this.crossTheRiver();
                break;

            case "R":
                this.restForTheDay();
                break;

            case "H":
                this.goHunting();
                break;

            case "G":
                this.gatherResources();
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

    private void gatherResources() {
        System.out.println("\n gatheringResources() has been called");
    }

    private void goHunting() {
        System.out.println("\n goHunting() has been called");
    }

    private void restForTheDay() {
        System.out.println("\n restForTheDay() has been called");
    }

    private void crossTheRiver() {
        System.out.println("\n crossTheRiver() has been called");
    }

    private void visitTheFort() {
        System.out.println("\n visitTheFort() has been called");
    }

    private void visitTheTown() {
        System.out.println("\n visitTheTown() has been called");
    }

    private void quitGame() {
        System.exit(0);
    }
}
