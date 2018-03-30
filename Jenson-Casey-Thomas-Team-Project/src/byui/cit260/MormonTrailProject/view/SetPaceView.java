/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.model.Pace;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.Scanner;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author Jenson, Casey, and Thomas
 */
public class SetPaceView extends View {

    public SetPaceView() {

        super("\n"
                + "\n*******************************************"
                + "\n| Set Pace Menu |"
                + "\n*******************************************"
                + "\nS - Slow "
                + "\nA - Average"
                + "\nF - Fast"
                + "\nQ - Return to Previous Menu"
                + "\n*******************************************"
                + "\nPlease choose an option: ");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

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
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    private void slowPace() {
        BYUICIT260MormonTrailProject.getCurrentGame().setPace(Pace.slowSpeed);
        this.console.println("A nice leisurely stroll today huh?");
    }

    private void averagePace() {
        BYUICIT260MormonTrailProject.getCurrentGame().setPace(Pace.averageSpeed);
        this.console.println("Let's get a move on, time is a waisten!");
    }

    private void fastPace() {
        BYUICIT260MormonTrailProject.getCurrentGame().setPace(Pace.fastSpeed);
        this.console.println("At this pace we will be there in no time!");
    }
}
