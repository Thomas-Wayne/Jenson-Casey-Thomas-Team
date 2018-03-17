/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.control;

import byui.cit260.MormonTrailProject.model.InventoryItem;
import byui.cit260.MormonTrailProject.model.Location;
import byui.cit260.MormonTrailProject.model.Map;
import byui.cit260.MormonTrailProject.model.Scene;

/**
 *
 * @author tcasey
 */
public class MapControl {
  public static Location[][] createLocations(int rows, int columns){
        /*public static Location[][] createLocations(int rows,
                                                        int columns) {
        IF rows < 1 OR columns < 1 THEN
            RETURN null
        ENDIF
      
        locations = new two-dimensional Location array
        FOR every row in the locations array
            FOR every column in the locations array
            location = create a new Location object
            set the row, and column attributes in the location
            set visited attribute to false
            Assign location to the row, and column in array
        ENDFOR
      
        RETURN locations
}*/
        if (rows < 1 | columns < 1){
          return null;  
        }
      
       
        Location[][] locations = new Location[noOfRows][noOfColumns];
        for (int i = 0; i < noOfRows.length; i++){
            
            for (int j = 0; j < noOfColumns[i].length; j++){
                locations += Location[i][j];
            }
        }
        return locations;
    }
    public static Scene[] createScenes(){
        System.out.println("*** createScenes()called ***");
        return null;
    }
    public static Question[] createQuestions(){
        System.out.println("*** createQuestions()called ***");
        return null;
    }
    public static void assignQuestionsToScenes(){
        System.out.println("*** assignQuestionsToScenes()called ***");
    }
    public static void assignInventoryToScenes(){
        System.out.println("*** assignInventoryToScenes()called ***");
    }
    public static void assignScenesToLocations(){
        System.out.println("*** assignScenesToLocations()called ***");
    }

    static Map createMap() {
      return null;
        
    }

    private static class Question {

        public Question() {
        }
    }
}
