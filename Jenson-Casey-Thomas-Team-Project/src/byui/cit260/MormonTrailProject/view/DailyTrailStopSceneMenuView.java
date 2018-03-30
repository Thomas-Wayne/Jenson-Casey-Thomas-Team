/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author Wayne Thomas
 */
public class DailyTrailStopSceneMenuView extends View {

    public DailyTrailStopSceneMenuView() {

        super("\n"
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
                + "\n********************************************"
                + "\nPlease choose an option: ");
    }

    @Override

    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

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
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again.");
                break;
        }

        return false;

    }

    private void gatherResources() {
        GatheringSuccessMenuView view = new GatheringSuccessMenuView();
        view.display();
    }

    private void goHunting() {
        GoHuntingSceneMenuView view = new GoHuntingSceneMenuView();
        view.display();
    }

    private void restForTheDay() {
        this.console.println("\n restForTheDay() has been called");
    }

    private void crossTheRiver() {
        RiverCrossingSceneMenuView view = new RiverCrossingSceneMenuView();
        view.display();
    }

    private void visitTheFort() {
        FortSceneMenuView view = new FortSceneMenuView();
        view.display();
    }

    private void visitTheTown() {
        TownSceneMenuView view = new TownSceneMenuView();
        view.display();
    }

    private void quitGame() {
        System.exit(0);
    }
}
