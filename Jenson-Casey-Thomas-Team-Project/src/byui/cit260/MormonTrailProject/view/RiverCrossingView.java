/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import java.util.Scanner;
import byui.cit260.MormonTrailProject.control.PlayControl;
import byui.cit260.MormonTrailProject.exceptions.PlayControlException;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;

/**
 *
 * @author tcasey
 */
public class RiverCrossingView extends View {

    private String wagonWeightMessage;
    private String riverFlowMessage;
    private String riverHeightMessage;
    private String oxenHealthMessage;
    private String wagonWeight;
    private String riverFlow;
    private String riverHeight;
    private String oxenHealth;

    public RiverCrossingView() {

        this.wagonWeightMessage = "\nEnter the the weight of your wagon in LBS (>1300): ";
        this.riverFlowMessage = "\nEnter the flow of the river; slow to raging (1-10): ";
        this.riverHeightMessage = "\nEnter the height of the river in INCHES: ";
        this.oxenHealthMessage = "\nEnter the health of your oxen team bad to good(1-10): ";

        this.displayBanner(); // display this banner when creating the view
    }

    private void displayBanner() {
        this.console.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n*       River Crossing Probability Calculation        *"
                + "\n*                                                     *"
                + "\n* With this tool, you will be able to determine if    *"
                + "\n* be successful in crossing the river you are facing  *"
                + "\n* or if you need to rest a while and wait for health, *"
                + "\n* river or weather conditions to improve, or maybe    *"
                + "\n* drop some provisions if your wagon is too heavy.    *"
                + "\n*                                                     *"
                + "\n* You can run the calculations as msny times as you   *"
                + "\n* like with different values until you determine you  *"
                + "\n* can to safely cross the river and continue on with  *"
                + "\n* your journey to the Salt Lake Valley.               *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    public void displayRiverCrossingView() throws PlayControlException {
        boolean done = false;
        do {

            this.wagonWeight = this.getUserString(this.wagonWeightMessage);
            if (this.wagonWeight.toUpperCase().equals("Q")) // user is quitting
            {
                return; // exit the game
            }
            done = this.doNumericAction(this.wagonWeight);

        } while (!done);

        done = false;
        do {

            this.riverFlow = this.getUserString(this.riverFlowMessage);
            if (this.riverFlow.toUpperCase().equals("Q")) // user is quitting
            {
                return; // exit the game
            }
            done = this.doNumericAction(this.riverFlow);

        } while (!done);

        done = false;
        do {

            this.riverHeight = this.getUserString(this.riverHeightMessage);
            if (this.riverHeight.toUpperCase().equals("Q")) // user is quitting
            {
                return; // exit the game
            }
            done = this.doNumericAction(this.riverHeight);

        } while (!done);

        done = false;

        do {

            this.oxenHealth = this.getUserString(this.oxenHealthMessage);
            if (this.oxenHealth.toUpperCase().equals("Q")) // user is quitting
            {
                return; // exit the game
            }
            done = this.doNumericAction(this.oxenHealth);

        } while (!done);

        this.displayNextView();

    }

    private String getUserString(String promptMessage) {
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            this.console.println("\n" + promptMessage);

            try {
                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks
                if (value.length() < 1) {

                    ErrorView.display(this.getClass().getName(), "\nInvalid value: Value cannot be blank");
                    continue;
                }

                break;
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }

            try {
                if (value.length() > 1) { // value is too long
                    ErrorView.display(this.getClass().getName(), "\nInvalid value: value cannot be more than 1 character");
                    continue;
                }
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }

            break; // end the loop
        }

        return value; // return the value entered
    }

    private boolean doNumericAction(String userInput) {

        if (userInput.contains("[a-zA-Z]+") == true) {
            ErrorView.display(this.getClass().getName(), "\nInvalid Value: "
                    + "must be numeric only");
            return false;
        }

        if (userInput.length() < 1) {
            ErrorView.display(this.getClass().getName(), "\nInvalid Value: "
                    + "value cannot be blank");
            return false;
        }

        return true;
    }

    private char getUserChar(String promptMessage) {
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            this.console.println("\n" + promptMessage);

            try {
                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks
                if (value.length() < 1) {

                    ErrorView.display(this.getClass().getName(), "\nInvalid value: Value cannot be blank");
                    continue;
                }

                break;
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }

            try {
                if (value.length() > 1) { // value is too long
                    ErrorView.display(this.getClass().getName(), "\nInvalid value: value cannot be more than 1 character");
                    continue;
                }
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }

            break; // end the loop
        }

        return value.charAt(0); // return the value entered
    }

    private RiverCrossingView displayNextView() throws PlayControlException {
        // display a message showing user input
        System.out.println("\n***************************************"
                + "\n* Weight of the Wagon: " + this.wagonWeight
                + "\n* River flow rate: " + this.riverFlow
                + "\n* Height of the river: " + this.riverHeight
                + "\n* Health of the oxen team: " + this.oxenHealth
                + "\n***************************************"
        );

        int wagonWeight = Integer.parseInt(this.wagonWeight);
        int riverFlow = Integer.parseInt(this.riverFlow);
        int riverHeight = Integer.parseInt(this.riverHeight);
        int oxenHealth = Integer.parseInt(this.oxenHealth);

        this.console.println(PlayControl.calcRiverCrossingProbability(riverHeight, wagonWeight, riverFlow, oxenHealth, oxenHealth));

        return null;
    }

    public void display() {

    }

    @Override
    public boolean doAction(String value) {
        return false;
    }

}
