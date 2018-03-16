/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.control;

import byui.cit260.MormonTrailProject.model.InventoryItem;
import byui.cit260.MormonTrailProject.model.Location;
import byui.cit260.MormonTrailProject.model.Scene;

/**
 *
 * @author tcasey
 */
public class MapControl {
  private static Location[][] createLocations(int rows, int columns){
        System.out.println("*** createLocations()called ***");
        return null;
    }
    private static Scene[] createScenes(){
        System.out.println("*** createScenes()called ***");
        return null;
    }
    private static Question[] createQuestions(){
        System.out.println("*** createQuestions()called ***");
        return null;
    }
    private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes){
        System.out.println("*** assignQuestionsToScenes()called ***");
    }
    private static void assignInventoryToScenes(InventoryItem[] inventory, Scene[] scenes){
        System.out.println("*** assignInventoryToScenes()called ***");
    }
    private static void assignScenesToLocations(Scene[] scenes, Location[][] locations){
        System.out.println("*** assignScenesToLocations()called ***");
    }

    private static class Question {

        public Question() {
        }
    }
}
