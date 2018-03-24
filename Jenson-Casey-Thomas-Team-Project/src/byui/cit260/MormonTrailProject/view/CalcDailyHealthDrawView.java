/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.PlayControl;
import byui.cit260.MormonTrailProject.exceptions.PlayControlException;
import byui.cit260.MormonTrailProject.model.Actor;
import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.InputMismatchException;
import java.util.Scanner;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author Thomas'
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

            case "H":
                this.health();
                break;

            case "S":
                this.stamina();
                break;

            case "Q":
                this.quitGame();

            default:
                System.out.println("\n*** Invalid selection *** Try again.");
                break;

        }
        return false;
    }
    //private String playerHealthMessage;
    //private String playerStaminaMessage;

    // public CalcDailyHealthDrawView(String message) {
    //     super(message);
    //     this.playerHealthMessage = "\nEnter current health (1-100): ";
    //     this.playerStaminaMessage = "\nEnter your stamina (0-5): ";
    // }

    /*@Override
    public boolean doAction(String value) {

        try {

            int pace = 0;
            int terrain = -2;
            int weather = -3;
            int playerStamina = 1;
            int playerHealth = 0;

            double result = PlayControl.calcDailyHealthDraw(playerHealth, playerStamina, pace, terrain, weather);

            try {
                if (playerHealth > 100);
                throw new PlayControlException("Player health cannot be less that 100%");
            } catch (PlayControlException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();

                try {
                    if (playerHealth < 15);
                    throw new PlayControlException("Player health cannot be less that 15%");
                } catch (PlayControlException ex) {
                    System.out.println(ex.getMessage());
                    ex.printStackTrace();

                }
                try {
                    if (playerStamina < 1);
                    throw new PlayControlException("Player stamina cannot be 0");
                } catch (PlayControlException exc) {
                    System.out.println(exc.getMessage());
                    exc.printStackTrace();
                }

                return false;
            }

        } catch (PlayControlException except) {

        }
        return false;

    }*/
    private int health() {
               
        System.out.println("\nEnter current health (1-100): ");
        Scanner playerHealth = new Scanner(System.in);
        try {
            return playerHealth.nextInt();
        } catch(InputMismatchException e){
            return 0;
        }        
       
    }

    private void stamina() {
    }

    private void quitGame() {
        System.exit(0);
    }

   
}
