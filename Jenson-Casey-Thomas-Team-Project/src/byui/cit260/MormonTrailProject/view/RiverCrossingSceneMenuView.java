/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import java.util.Scanner;

/**
 *
 * @author tcasey
 */
public class RiverCrossingSceneMenuView {

    private String promptMessage;
    private String menu;

    /**
     *
     */
    public RiverCrossingSceneMenuView() {

        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* You are at a rivers edge.  Your team needs to cross *"
                + "\n* this river in order to continue your journey.       *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );

        this.promptMessage = "\nPlease choose an option: ";
        this.menu = "\n"
                + "\n**********************************************"
                + "\n*          | River Crossing Menu |           *"
                + "\n**********************************************"
                + "\nA - Look around for bridges or ferry boats.  *"
                + "\nC - Look around for a place to camp          *"
                + "\nP - Prepare to cross the river               *"
                + "\nR - Rest at rivers edge                      *"
                + "\n**********************************************";
    }

    public void displayRiverCrossingSceneMenuView() {
        boolean endOfView = false;

        do {
            String menuOption = this.getMenuOption();

            if (menuOption.toUpperCase().equals("A")) {

                return;
            } else {
                endOfView = doAction(menuOption);
            }

        } while (endOfView != true);
        do {
            String menuOption = this.getMenuOption();

            if (menuOption.toUpperCase().equals("C")) {

                return;
            } else {
                endOfView = doAction(menuOption);
            }

        } while (endOfView != true);

        do {
            String menuOption = this.getMenuOption();

            if (menuOption.toUpperCase().equals("P")) {

                return;
            } else {
                endOfView = doAction(menuOption);
            }

        } while (endOfView != true);

        do {
            String menuOption = this.getMenuOption();

            if (menuOption.toUpperCase().equals("R")) {

                return;
            } else {
                endOfView = doAction(menuOption);
            }

        } while (endOfView != true);

    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "A";
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

            case "A":
                this.lookForCrossingAid();
                break;

            case "C":
                this.lookForCampsite();
                break;

            case "P":
                this.prepareCrossing();
                break;

            case "R":
                this.rest();
                break;
            case "Q":
                this.quitGame();
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    private void lookForCrossingAid() {
        System.out.println(
                "\nYou have looked around for a while, but there "
                + "are no ferry boats or bridges available here. Make another choice");
    }

    private void prepareCrossing() {
        System.out.println(
                "\nCheck your wagon weight, the weather conditions, "
                + "the swiftness and depth of the river to see if you "
                + "can safely cross at this time.");
    }

    private void lookForCampsite() {
        System.out.println(
                "\nIf you are planning to stay for a little while, you "
                + "will want to find a sufficient campsite to rest your "
                + "team until you are ready to cross.");
    }

    private void rest() {
        System.out.println(
                "\nFor whatever reason you have decided to rest, ENJOY! "
                + "This is a good time to rebuild your strength, both "
                + "physically and spiritually.");
    }
    private void quitGame() {
        System.exit(0);
    }

    public void display() {
        
    }


}
