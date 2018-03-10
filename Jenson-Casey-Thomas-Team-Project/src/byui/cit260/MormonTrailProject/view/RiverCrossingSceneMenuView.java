/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author tcasey
 */
public class RiverCrossingSceneMenuView extends View {

    public RiverCrossingSceneMenuView() {

        super(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* You are at a rivers edge.  Your team needs to cross *"
                + "\n* this river in order to continue your journey.       *"
                + "\n*                                                     *"
                + "\n*******************************************************"
                + "\n"
                + "\n**********************************************"
                + "\n*          | River Crossing Menu |           *"
                + "\n**********************************************"
                + "\nA - Look around for bridges or ferry boats.  *"
                + "\nC - Look around for a place to camp          *"
                + "\nP - Prepare to cross the river               *"
                + "\nR - Rest at rivers edge                      *"
                + "\nQ - Return to previous menu                  *"
                + "\n**********************************************"
        );
    }

    @Override

    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

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
        RiverCrossingView view = new RiverCrossingView();
        view.display();
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

}
