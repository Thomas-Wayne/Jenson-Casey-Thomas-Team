/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.GameControl;
import byui.cit260.MormonTrailProject.model.Actor;
import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.ArrayList;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author Thomas
 */
public class TeamStatus extends View {

    public TeamStatus() {
        super("\n"
                + "\n*******************************************"
                + "\n| Team Status Menu |"
                + "\n*******************************************"
                + "\nN - Name "
                + "\nH - Health "
                + "\nS - Stamina "
                + "\nA - Ability "
                + "\nQ - Return to Previous Menu"
                + "\n*******************************************"
                + "\nPlease choose an option: ");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {

            case "N":
                this.name();
                break;

            case "H":
                this.health();
                break;

            case "S":
                this.stamina();
                break;

            case "A":
                this.ability();
                break;

            case "Q":
                this.quitGame();

            default:
                System.out.println("\n*** Invalid selection *** Try again.");
                break;

        }
        return false;
    }

    private void name() {
        Game game = BYUICIT260MormonTrailProject.getCurrentGame();
        for (Actor actor : game.getActors()) {
            System.out.println("\n\tName: " + actor.getName());
        }

    }

    private void health() {
        Game game = BYUICIT260MormonTrailProject.getCurrentGame();
        int totalHealth = 0;
        for (Actor actor : game.getActors()) {
            totalHealth += actor.getHealth();

            System.out.println("\n\tName: " + actor.getName()
                    + "\n\tHealth: " + actor.getHealth());
        }
        double averageHealth = totalHealth / game.getActors().size();
        System.out.println("\n\tAverage Team Health = " + averageHealth);
    }

    private void stamina() {
        Game game = BYUICIT260MormonTrailProject.getCurrentGame();
        int totalStamina = 0;
        for (Actor actor : game.getActors()) {
            totalStamina += actor.getStamina();
            System.out.println("\n\tName: " + actor.getName()
                    + "\n\tStamina: " + actor.getStamina());
        }
        double averageStamina = totalStamina / game.getActors().size();
        System.out.println("\n\tAverage Team Stamina = " + averageStamina);
    }

    private void ability() {
        Game game = BYUICIT260MormonTrailProject.getCurrentGame();
        for (Actor actor : game.getActors()) {
            System.out.println("\n\tName: " + actor.getName()
                    + "\n\tAbility: " + actor.getAbility());
        }
    }

    private void quitGame() {
        System.exit(0);
    }
}
