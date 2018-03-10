/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.GameControl;
import byui.cit260.MormonTrailProject.control.PlayControl;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.Scanner;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author Wayne Thomas
 */
public class GameMenuView extends View {

    private String dateDayOfWeek;
    private int distanceTraveled;
    private int distanceRemaining;
    private String currentSurroundings;
    private String potentialIssues;
    private String todaysWeather;
    private int distanceRemainingValue;

    public GameMenuView() {

        super(
                "\n"
                + "\n********************************************"
                + "\n| Game Play Menu |"
                + "\n********************************************"
                + "\nT - View team status"
                + "\nV - View team supplies"
                + "\nP - Set Team Pace"
                + "\nS - Scene menu"
                + "\nM - View the map"
                + "\nH - Help menu"
                + "\nQ - Return to Previous Menu"
                + "\n********************************************"
                + "\nPlease choose an option: ");
        this.dateDayOfWeek = "";
        this.distanceRemaining = 1300;
        this.currentSurroundings = "You are in the middle of nowhere.";
        this.potentialIssues = "A racoon made off with your breakfast. Tough luck!";
        this.todaysWeather = "Partly cloudy skies. High 75 Low 65";

        System.out.println(
                "\n*******************************************************"
                + "\n Today's date is:\t\t" + this.dateDayOfWeek
                + "\n Distance traveled from Nauvoo:\t" + 0
                + "\n Distance to Salt Lake Valley:\t" + this.distanceRemaining
                + "\n Current surroundings:\t\t" + this.currentSurroundings
                + "\n Potential issues:\t\t" + this.potentialIssues
                + "\n Today's weather:\t\t" + this.todaysWeather
                + "\n*******************************************************"
        );
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

            case "T":
                this.viewTeamStatus();
                break;

            case "V":
                this.viewTeamSupplies();
                break;

            case "P":
                this.TeamPace();
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
        helpMenu.display();
    }

    private void viewMap() {
        System.out.println("viewMap() has been called");
    }

    private void sceneMenu() {
        DailyTrailStopSceneMenuView view = new DailyTrailStopSceneMenuView();
        view.display();
    }

    private void TeamPace() {
        SetPaceView view = new SetPaceView();
        view.display();
    }

    private void viewTeamSupplies() {
        CurrentSuppliesView view = new CurrentSuppliesView();
        view.display();
    }

    private void viewTeamStatus() {
        System.out.println("viewTeamStatus() has been called");
    }

}
