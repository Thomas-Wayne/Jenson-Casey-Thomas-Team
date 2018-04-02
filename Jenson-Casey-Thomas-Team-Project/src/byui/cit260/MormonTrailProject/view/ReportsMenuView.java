package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.MapControl;
import byui.cit260.MormonTrailProject.control.ReportControl;
import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.model.Location;
import byui.cit260.MormonTrailProject.model.Map;
import byui.cit260.MormonTrailProject.model.Scene;
import byui.cit260.MormonTrailProject.model.SceneType;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author tcasey
 */
public class ReportsMenuView extends View {

    private String promptMessage;

   public ReportsMenuView() {            
        super("\n"
            + "\n------------------------------------------------"
            + "\n|    Reports Menu                              |"
            + "\n------------------------------------------------"
            + "\nS - Print Scenes"
            + "\nQ - Quit"
            + "\n------------------------------------------------"
            + "\nPlease choose an option: ");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "S":
                this.printScenes();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
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
        line.insert(40, "DIST. FROM NAUVOO");
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
