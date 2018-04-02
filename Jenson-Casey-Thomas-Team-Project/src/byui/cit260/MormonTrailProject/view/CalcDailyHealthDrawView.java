/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.PlayControl;
import byui.cit260.MormonTrailProject.exceptions.PlayControlException;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;

/**
 *
 * @author Jenson, Casey, Thomas
 */
public class CalcDailyHealthDrawView extends View {

    public CalcDailyHealthDrawView() {
        super(
                "\n********************************************"
                + "\n*          | Calc Daily Health Draw|       *"
                + "\n********************************************"
                + "\nH - Health "
                + "\nS - Stamina "
                + "\nQ - Return to Previous Menu"
                + "\n********************************************"
        );
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

            case "H": {

                try {
                    this.health();
                } catch (PlayControlException e) {

                }

            }
            break;

            case "S": {
                try {
                    this.stamina();
                } catch (PlayControlException e) {

                }
            }
            break;

            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again.");
                break;

        }
        return false;
    }

    private int health() throws PlayControlException {

        this.console.println("\nEnter current health (1-100): ");
        int playerHealth = 0;
        boolean valid = false;
        try {

            while (!valid) {

                String health = this.keyboard.readLine();
                playerHealth = Integer.parseInt(health);
                health = health.trim();

                if (health.length() < 1) {

                    ErrorView.display(this.getClass().getName(), "\nInvalid value: Value cannot be blank");
                    continue;
                }

                break;

            }
        } catch (Exception e) {

            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }

        try {

        } catch (NumberFormatException e) {

            this.console.println("Please enter a numerical value...");
            return playerHealth;
        }

        try {
            double result = PlayControl.calcDailyHealthDraw(playerHealth, 9, 0, 0, 0);
            //result cannot exceed 100 (playerHealth and playStamina combined) or it will throw an exception. 
            this.console.println("Good");
            return playerHealth;

        } catch (PlayControlException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
        return playerHealth;

    }
// author Thomas

    private int stamina() throws PlayControlException {
        this.console.println("\nEnter current stamina (1-15): ");
        int playerStamina = 0;
        boolean valid = false;

        try {

            while (!valid) {

                String stamina = this.keyboard.readLine();
                playerStamina = Integer.parseInt(stamina);
                stamina = stamina.trim();

                if (stamina.length() < 1) {

                    ErrorView.display(this.getClass().getName(), "\nInvalid value: Value cannot be blank");
                    continue;
                }

                break;

            }
        } catch (Exception e) {

            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        try {

        } catch (NumberFormatException e) {

            this.console.println("Please enter a numerical value...");
        }
        try {
            double result = PlayControl.calcDailyHealthDraw(85, playerStamina, 0, 0, 0);
            // Result cannot exceed 100 (playerHealth and playStamina combined)or it will throw an exception  
            this.console.println("Good");
            return playerStamina;
        } catch (PlayControlException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
        return playerStamina;

    }
}
