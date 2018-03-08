/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.model.Pace;
import java.util.Scanner;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author Jenson, Casey, and Thomas
 */
public class SetPaceView {

    private String promptMessage;
    private String menu;

    public SetPaceView() {

        this.promptMessage = "\nPlease choose an option: ";
        this.menu = "\n"
                + "\n*******************************************"
                + "\n| Set Pace Menu |"
                + "\n*******************************************"
                + "\nS - Slow "
                + "\nA - Average"
                + "\nF - Fast"
                + "\nQ - Quit"
                + "\n*******************************************";
    }

    public void displaySetPaceView() {
        boolean endOfView = false;

        do {
            String menuOption = this.getMenuOption();

            if (menuOption.toUpperCase().equals("Q")) {

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

            case "S":
                this.slowPace();
                break;

            case "A":
                this.averagePace();
                break;

            case "F":
                this.fastPace();
                break;
                
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    private void slowPace() {
        BYUICIT260MormonTrailProject.getCurrentGame().setPace(Pace.slowSpeed);
        System.out.println("A nice leisurely stroll today huh?");
    }

    private void averagePace() {
        BYUICIT260MormonTrailProject.getCurrentGame().setPace(Pace.averageSpeed);
        System.out.println("Let's get a move on, time is a waisten!");
    }

    private void fastPace() {
        BYUICIT260MormonTrailProject.getCurrentGame().setPace(Pace.fastSpeed);
        System.out.println("At this pace we will be there in no time!");
    }
}
