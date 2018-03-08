/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import java.util.Scanner;

/**
 *
 * @author Isabel Jenson 
 */
public class GatheringSuccessMenuView {
    
    private String promptMessage;
    private String menu;

    

    public GatheringSuccessMenuView() {

        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* You are about to go gather some stuff to eat,       *"
                + "\n*                  good luck!                         *"
                + "\n*******************************************************"
        );

        this.promptMessage = "\nPlease choose an option: ";
        this.menu = "\n"
                + "\n**********************************************"
                + "\n*                 Gather:                    *"
                + "\n**********************************************"
                + "\nV - Vegetables                               *"
                + "\nF - Fruits                                   *"
                + "\nE - Edible plants                            *"
                + "\nB - Go back to previous menu                 *"
                + "\n**********************************************";
    }

    public void displayRiverCrossingSceneMenuView() {
        boolean endOfView = false;

        do {
            String menuOption = this.getMenuOption();

            if (menuOption.toUpperCase().equals("V")) {

                return;
            } else {
                endOfView = doAction(menuOption);
            }

        } while (endOfView != true);
        do {
            String menuOption = this.getMenuOption();

            if (menuOption.toUpperCase().equals("B")) {

                return;
            } else {
                endOfView = doAction(menuOption);
            }

        } while (endOfView != true);

        do {
            String menuOption = this.getMenuOption();

            if (menuOption.toUpperCase().equals("E")) {

                return;
            } else {
                endOfView = doAction(menuOption);
            }

        } while (endOfView != true);

        do {
            String menuOption = this.getMenuOption();

            if (menuOption.toUpperCase().equals("B")) {

                return;
            } else {
                endOfView = doAction(menuOption);
            }

        } while (endOfView != true);

    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        while (!valid) {

            System.out.println("\n" + this.menu);
            System.out.println("\n" + this.promptMessage);
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() < 1) {

                System.out.println("\nInvalid value: Value cannot be blank");
                continue;

            }
            break;
        }
        return value;

    }

    private boolean doAction(String menuOption) {

        menuOption = menuOption.toUpperCase();
        switch (menuOption) {

            case "V":
                this.getVegetables();
                break;

            case "F":
                this.getFruits();
                break;

            case "E":
                this.getEdiblePlants();
                break;

            case "B":
                this.quitGame();
            
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

  
 

    public void display() {
        
    }

    private void getVegetables() {
        System.out.println("\n getVetables() was called.");
    }

    private void getFruits() {
        System.out.println("\n getFruits() was called.");
    }

    private void getEdiblePlants() {
        System.out.println("\n getEdiblePlants() was called.");
    }

    private void quitGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayGatheringSuccessMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
