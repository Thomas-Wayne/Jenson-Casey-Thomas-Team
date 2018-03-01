/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import java.util.Scanner;
import byui.cit260.MormonTrailProject.control.PlayControl;


/**
 *
 * @author tcasey
 */
public class RiverCrossingView {

        private String wagonWeightMessage;
        private String riverFlowMessage;
        private String riverHeightMessage;
        private String oxenHealthMessage;
        /*private String weatherConditionsMessage;*/
        private String wagonWeight;
        private String riverFlow;
        private String riverHeight;
        private String oxenHealth;
        /*private String weatherConditions;*/
    
    public RiverCrossingView() {
        
        this.wagonWeightMessage = "\nEnter the the weight of your wagon in LBS (>1300): ";
        this.riverFlowMessage = "\nEnter the flow of the river; slow to raging (1-10): ";
        this.riverHeightMessage = "\nEnter the height of the river in INCHES: ";
        this.oxenHealthMessage = "\nEnter the health of your oxen team bad to good(1-10): ";
       /* this.weatherConditions = "\nEnter the current weather conditions (-5 - 2): ";*/
        
        this.displayBanner(); // display this banner when creating the view
    }

    private void displayBanner() {
        System.out.println(
            "\n*******************************************************"
           +"\n*                                                     *"
           +"\n*       River Crossing Probability Calculation        *"
           +"\n*                                                     *"
           +"\n* With this tool, you will be able to determine if    *"
           +"\n* be successful in crossing the river you are facing  *"
           +"\n* or if you need to rest a while and wait for health, *"
           +"\n* river or weather conditions to improve, or maybe    *"
           +"\n* drop some provisions if your wagon is too heavy.    *"
           +"\n*                                                     *"
           +"\n* You can run the calculations as msny times as you   *"
           +"\n* like with different values until you determine you  *"
           +"\n* can to safely cross the river and continue on with  *"
           +"\n* your journey to the Salt Lake Valley.               *"
           +"\n*                                                     *"
           +"\n*******************************************************"
           );
    }

    public void displayRiverCrossingView() {
        boolean done = false;
        do {

            this.wagonWeight = this.getUserString(this.wagonWeightMessage);
            if (this.wagonWeight.toUpperCase().equals("Q")) // user is quitting
                return; // exit the game
            
            done = this.doNumericAction(this.wagonWeight);
        
        } while (!done);
        
        done = false; 
        do {
         
            this.riverFlow = this.getUserString(this.riverFlowMessage);
            if (this.riverFlow.toUpperCase().equals("Q")) // user is quitting
                return; // exit the game
            
            done = this.doNumericAction(this.riverFlow);
        
        } while (!done);
        
        done = false;
        do {

            this.riverHeight = this.getUserString(this.riverHeightMessage);
            if (this.riverHeight.toUpperCase().equals("Q")) // user is quitting
                return; // exit the game

            done = this.doNumericAction(this.riverHeight);
        
        } while (!done);

        done = false;
        
       /* do {

            this.weatherConditions = this.getUserString(this.weatherConditionsMessage);
            if (this.weatherConditions.toUpperCase().equals("Q")) // user is quitting
                return; // exit the game
            
            done = this.doNumericAction(this.weatherConditions);
        
        } while (!done);

        done = false;*/
        
        do {

            this.oxenHealth = this.getUserString(this.oxenHealthMessage);
            if (this.oxenHealth.toUpperCase().equals("Q")) // user is quitting
                return; // exit the game
            
            done = this.doNumericAction(this.oxenHealth);
        
        } while (!done);

        this.displayNextView();

    }

    private String getUserString(String promptMessage) {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; 
        }
        
        return value; // return the value entered
    }

    private boolean doNumericAction(String userInput) {
        
        if (userInput.contains("[a-zA-Z]+") == true) {        
            System.out.println("\nInvalid Value: "
                + "must be numeric only");
            return false;
        }
        
        if (userInput.length() < 1) {        
            System.out.println("\nInvalid Value: "
                + "value cannot be blank");
            return false;
        }
                
        return true;
    }

    private char getUserChar(String promptMessage) {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
                
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            if (value.length() > 1) { // value is too long
                System.out.println("\nInvalid value: value cannot be more than 1 character");
                continue;
            }
            
            break; // end the loop
        }
        
        return value.charAt(0); // return the value entered
    }



    private RiverCrossingView displayNextView() {
        // display a message showing user input
        System.out.println("\n***************************************"
                          + "\n* Weight of the Wagon: " + this.wagonWeight
                          + "\n* River flow rate: " + this.riverFlow
                          + "\n* Height of the river: " + this.riverHeight
                          + "\n* Health of the oxen team: " + this.oxenHealth
                         /* + "\n* Weather conditions: " + this.weatherConditions*/
                          + "\n***************************************"
                          );
        
        int wagonWeight = Integer.parseInt(this.wagonWeight);
        int riverFlow = Integer.parseInt(this.riverFlow);
        int riverHeight = Integer.parseInt(this.riverHeight);
        int oxenHealth = Integer.parseInt(this.oxenHealth);
      /*  int weather = Integer.parseInt(this.weatherConditions);*/

        // Create MainMenuView object
        RiverCrossingView probability  = new RiverCrossingView();
            double riverCrossing;
            int weather = 2;
            riverCrossing = PlayControl.calcRiverCrossingProbability(wagonWeight, riverFlow, riverHeight, oxenHealth, weather);
           
            return probability;
    }

    public void display() {
        
    }


   

   
}