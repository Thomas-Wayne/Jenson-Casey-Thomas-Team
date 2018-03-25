/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.PlayControl;
import byui.cit260.MormonTrailProject.exceptions.PlayControlException;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.Scanner;

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
                System.out.println("\n*** Invalid selection *** Try again.");
                break;

        }
        return false;
    }

    private int health() throws PlayControlException {

        System.out.println("\nEnter current health (1-100): ");
        Scanner health = new Scanner(System.in);
        String strHealth = health.next();
        int playerHealth = Integer.parseInt(strHealth);

        try {
            int input = Integer.parseInt(strHealth);
        } catch (NumberFormatException e) {

            System.out.println("Please enter a numerical value...");
            return playerHealth;
        }

        try {
            double result = PlayControl.calcDailyHealthDraw(playerHealth, 9, 0, 0, 0);
            //result cannot exceed 100 (playerHealth and playStamina combined) or it will throw an exception. 
            System.out.println("Good");
            return playerHealth;

        } catch (PlayControlException e) {
            System.out.println(e.getMessage());
        }
        return playerHealth;

    }
// author Thomas

    private int stamina() throws PlayControlException {
        System.out.println("\nEnter current stamina (1-15): ");
        Scanner stamina = new Scanner(System.in);
        String strStamina = stamina.next();
        int playerStamina = Integer.parseInt(strStamina);
        try {

        } catch (NumberFormatException e) {

            System.out.println("Please enter a numerical value...");
        }
        try {
            double result = PlayControl.calcDailyHealthDraw(90, playerStamina, 0, 0, 0);
            // Result cannot exceed 100 (playerHealth and playStamina combined)or it will throw an exception  
            System.out.println("Good");
            return playerStamina;
        } catch (PlayControlException e) {
            System.out.println(e.getMessage());
        }
        return playerStamina;

    }
}
