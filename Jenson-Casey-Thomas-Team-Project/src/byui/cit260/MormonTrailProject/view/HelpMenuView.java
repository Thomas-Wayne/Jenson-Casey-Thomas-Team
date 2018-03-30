/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.view.ViewInterface.View;

/**
 *
 * @author Jenson, Casey, and Thomas
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n*******************************************"
                + "\n| Help Menu |"
                + "\n*******************************************"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move"
                + "\nE - Estimate the number of resources"
                + "\nH - Harvest resources"
                + "\nD - Delivering resources to warehouse"
                + "\nQ - Return to Previous Menu"
                + "\n*******************************************");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

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
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    private void goalHelp() {
        this.console.println("\ngoalHelp() was called");
    }

    private void moveHelp() {
        this.console.println("\nmoveHelp() was called");
    }

    private void estimateHelp() {
        this.console.println("\nestimateHelp() was called");
    }

    private void harvestHelp() {
        this.console.println("\nharvestHelp() was called");
    }

    private void deliverHelp() {
        this.console.println("\ndeliverHelp() was called");
    }

}
