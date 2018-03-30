/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.view.ViewInterface.View;

/**
 *
 * @author Isabel Jenson
 */
public class CurrentSuppliesView extends View {

    public CurrentSuppliesView() {
        super(
                "\n**********************************************"
                + "\n*          Current Supplies Menu             *"
                + "\n**********************************************"
                + "\nO - Oxen                                     *"
                + "\nW - Wagons                                   *"
                + "\nF - Food                                     *"
                + "\nS - Spare Wagon Wheels                       *"
                + "\nA - Ammunition                               *"
                + "\nQ - Return to Previous Menu                  *"
                + "\n**********************************************");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

            case "O":
                this.buyOxen();
                break;

            case "W":
                this.buyWagon();
                break;

            case "F":
                this.buyFood();
                break;

            case "S":
                this.buySpareWagonWheel();
                break;

            case "A":
                this.buyAmmo();
                break;

            case "Q":
                this.quitGame();

            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    private void buyOxen() {
        this.console.println("buyOxen() was called");
    }

    private void buyWagon() {
        this.console.println("buyWagon() was called");
    }

    private void buyFood() {
        this.console.println("buyFood() was called");
    }

    private void buySpareWagonWheel() {
        this.console.println("buySpareWagonWheel() was called");
    }

    private void buyAmmo() {
        this.console.println("buyAmmo() was called");
    }

    private void quitGame() {
        System.exit(0);
    }

    private boolean doNumericAction(String userInput) {

        if (userInput.contains("[a-zA-Z]+") == true) {
            System.out.println("\nInvalid Value: "
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
        // get infile for keyboard
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

}
