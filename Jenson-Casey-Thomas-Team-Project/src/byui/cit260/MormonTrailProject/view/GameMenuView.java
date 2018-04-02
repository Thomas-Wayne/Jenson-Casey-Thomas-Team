/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.GameControl;
import byui.cit260.MormonTrailProject.control.ReportControl;
import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.model.Location;
import byui.cit260.MormonTrailProject.model.Map;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
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
                + "\nR - Print Scenes"
                + "\nP - Set Team Pace"
                + "\nS - Scene menu"
                + "\nM - View the map"
                + "\nX - Daily Health Draw"
                + "\nD - Distance to Salt Lake Valley"
                + "\nH - Help menu"
                + "\nQ - Return to Previous Menu"
                + "\n********************************************"
                + "\nPlease choose an option: ");
        this.dateDayOfWeek = "";
        this.distanceRemaining = 1300;
        this.currentSurroundings = "You are in the middle of nowhere.";
        this.potentialIssues = "A racoon made off with your breakfast. Tough luck!";
        this.todaysWeather = "Partly cloudy skies. High 75 Low 65";

        /* System.out.println(
                "\n*******************************************************"
                + "\n Today's date is:\t\t" + this.dateDayOfWeek
                + "\n Distance traveled from Nauvoo:\t" + 0
                + "\n Distance to Salt Lake Valley:\t" + this.distanceRemaining
                + "\n Current surroundings:\t\t" + this.currentSurroundings
                + "\n Potential issues:\t\t" + this.potentialIssues
                + "\n Today's weather:\t\t" + this.todaysWeather
                + "\n*******************************************************"
        );*/
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
            
            case "R":
                this.printScenes();
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

            case "X":
                this.viewDailyHealthDraw();
                break;

            case "D":
                this.getRemainingDistance();
                break;

            case "H":
                this.getHelp();
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

    private void quitGame() {
        System.exit(0);
    }

    private void getHelp() {
        GameControl.getHelp(BYUICIT260MormonTrailProject.getPlayer());
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void viewMap() {
        Map map = BYUICIT260MormonTrailProject.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();

        for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[row].length; column++) {
                this.console.print(String.format("%3s ", locations[row][column].getMilepost()));
            }
            this.console.println();
        }
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
        TeamStatus teamStatus = new TeamStatus();
        teamStatus.display();

    }

    private void viewDailyHealthDraw() {
        CalcDailyHealthDrawView calcDailyHealthDrawView = new CalcDailyHealthDrawView();
        calcDailyHealthDrawView.display();

    }

    /*private long getRemainingDistance(int[] distance) {
        long total = 0;

        for (int i = 0; i < distance.length; i++) {
            total += -distance[i];
        }
        return total;

    }*/
    private void getRemainingDistance() {
        DistanceRemainingView view;
        view = new DistanceRemainingView();
        view.display();
    }
private void printScenes() {
        StringBuilder line;
        
        Game game = BYUICIT260MormonTrailProject.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
                       
        this.console.println("\n          LIST OF SCENES");
        line = new StringBuilder("                                                                                ");
        line.insert(0, "NAME");
        line.insert(30, "SYMBOL");
        line.insert(65, "DIST. FROM NAUVOO");
        this.console.println(line.toString());
        
       // for each scene
       for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[row].length; column++) {
                 if (locations[row][column].getScene() != null) {                      
                     line = new StringBuilder("                                                                                ");
                     line.insert(0, locations[row][column].getScene().getName());
                     line.insert(30, locations[row][column].getScene().getMapSymbol());
                     line.insert(40, String.valueOf(locations[row][column].getScene().getDistanceFromNauvoo()));
 
                     // Display the line
                     this.console.println(line.toString());
                 }
            }
       }
        String promptMessage = null;
       
         String savePrompt = promptMessage;
        
        // prompt for and get the name of the file to save the game in        
        promptMessage = "\n*** TO PRINT THIS REPORT, PLEASE ENTER A FILE NAME (or type 'Q' to Quit): ";
        
        String fileName = this.getInput();
        if (fileName.toUpperCase().equals("Q")) { // user wants to quit
            promptMessage = savePrompt;
            return; // exit the view
        }
        
        exportScenesToFile(map, fileName);

        promptMessage = savePrompt;        
      
    }

   
    private void exportScenesToFile(Map map, String fileName) {
        try {
            // save the game to the specified file
            boolean success = ReportControl.sceneReport(map, fileName); 
            if (success)
                this.console.println("\n     Your file was successfully saved.");
        } catch (Exception ex) {
            ErrorView.display("ReportsMenuView", ex.getMessage());
        }
   
    }

}

