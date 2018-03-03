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
 * @author WThomas
 */
public class GameMenuView {

    private String promptMessage;
    private String menu;
    private String dateDayOfWeek;
    private int distanceTraveled;
    private int distanceRemaining;
    private int miles = 1300;
    private String currentSurroundings;
    private String potentialIssues;
    private String todaysWeather;
    private int distanceRemainingValue;

    public GameMenuView() {
        this.dateDayOfWeek = "";
        this.distanceTraveled = distanceTraveled;
        this.distanceRemaining = distanceRemainingValue;
        this.currentSurroundings = "You are in the middle of nowhere.";
        this.potentialIssues = "A racoon made off with your breakfast. Tough luck!";
        this.todaysWeather = "Partly cloudy skies. High 75 Low 65";

        System.out.println(
                "\n*******************************************************"
                + "\n Today's date is:\t\t" + this.dateDayOfWeek
                + "\n Distance traveled from Nauvoo:\t" + this.distanceTraveled
                + "\n Distance to Salt Lake Valley:\t" + this.distanceRemaining
                + "\n Current surroundings:\t\t" + this.currentSurroundings
                + "\n Potential issues:\t\t" + this.potentialIssues
                + "\n Today's weather:\t\t" + this.todaysWeather
                + "\n*******************************************************"
        );

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
        helpMenu.displayHelpMenuView();
    }

    private void viewMap() {
        System.out.println("viewMap() has been called");
    }

    private void sceneMenu() {
        System.out.println("sceneMenu() has been called");
    }

    private void TeamPace() {
        System.out.println("teamPace() has been called");
    }

    private void viewTeamSupplies() {
        System.out.println("viewTeamSupplies() has been called");
    }

    private void viewTeamStatus() {
        System.out.println("viewTeamStatus() has been called");
    }
      
}
