/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.PlayControl;
import byui.cit260.MormonTrailProject.exceptions.GetFruitsException;
import byui.cit260.MormonTrailProject.exceptions.PlayControlException;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isabel Jenson
 */
public class GatheringSuccessMenuView extends View {

    public GatheringSuccessMenuView() {

        super(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* You are about to go gather some stuff to eat,       *"
                + "\n*                  good luck!                         *"
                + "\n*******************************************************"
                + "\n"
                + "\n**********************************************"
                + "\n*                 Gather:                    *"
                + "\n**********************************************"
                + "\nV - Vegetables                               *"
                + "\nF - Fruits                                   *"
                + "\nE - Edible plants                            *"
                + "\nQ - Go back to previous menu                 *"
                + "\n**********************************************");
    }

    @Override
    public boolean doAction(String value)  {
        try {
            PlayControl.calcGatheringSuccess(0, 0, 0);
            

        } catch (PlayControlException e) {
              System.out.println(e.getMessage());
            return false;
        }
        value = value.toUpperCase();
        switch (value) {

            case "V":
                this.getVegetables();
                
                break;

            case "F": {
                try {
                    this.getFruits();
                } catch (GetFruitsException ex) {
                    Logger.getLogger(GatheringSuccessMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            case "E":
                this.getEdiblePlants();
                break;

            case "Q":
                this.quitGame();

            default:
                System.out.println("Please, choose an option from the menu...");
               

        }

        return false;

    }

    private void getFruits() throws GetFruitsException {

        Scanner poundsGathered = new Scanner(System.in);
        boolean success = false;
        while (!success) {
            try {

                System.out.print("Enter the pounds of fruit you gathered: ");

                String whatYouGathered = poundsGathered.next();
                int youCanCarry = Integer.parseInt(whatYouGathered);

                if (youCanCarry < 1) {

                    System.out.println("That's not good. Better luck next time!");
                    success = true;
                }

                if (youCanCarry > 1 && youCanCarry < 100) {
                    System.out.println("Excellent job!");
                    success = true;
                } else if (youCanCarry > 100) {

                    System.out.println("You are only able to carry 100 punds...");
                    success = true;
                }

            } catch (NumberFormatException ex) {
                poundsGathered.next();
                System.out.println("Wrong input. Try a whole number...");
            }
            
        }

    }

    private void getEdiblePlants() {
        System.out.println("getEdiblePlants() was called");
    }

    private void getVegetables() {
        System.out.println("getVegetables() was called");
    }

    private void quitGame() {
        System.exit(0);
    }

}
