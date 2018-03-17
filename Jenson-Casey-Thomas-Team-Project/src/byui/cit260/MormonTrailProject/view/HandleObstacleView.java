/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.Random;

/**
 *
 * @author tcasey
 */
public class HandleObstacleView extends View {

    public HandleObstacleView() {
        super("\n"
                + "\n************************************************"
                + "\n  Handle an obstacle Menu                      *"
                + "\n************************************************"
                + "\nH - Get some help."
                + "\nG - Seek some spiritual guidance."
                + "\nS - Just sleep on it."
                + "\nP - Pray about it."
                + "\nN - Stare and do nothing."
                + "\nQ - Quit"
                + "\n************************************************"
                + "\nPlease choose an option: ");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {

            case "H":
                this.seekHelp();
                break;
            case "G":
                this.seekSpiritualGuidance();
                break;
            case "S":
                this.sleep();
                break;
            case "P":
                this.prayAboutIt();
                break;
            case "D":
                this.doNothing();
                break;
            default:
                System.out.println("\n *** Invalid selection *** Try again.");
                break;
        }

        Random rand = new Random();
        int randomValue = rand.nextInt(10);
        if (randomValue < 4) {
            System.out.println("\n*** Success!! It worked! *** ");
            return true;
        } else {
            System.out.println("\n*** It didn't work. Repent and try again.***");
        }

        return false;
    }

    private void seekHelp() {
        System.out.println("\nAsked fellow pioneer for help");
    }

    private void seekSpiritualGuidance() {
        System.out.println("\nI went to my Bishop, he told me I should go to my Home Teacher.");
    }

    private void sleep() {
        System.out.println("\nNeed to sleep on this. Maybe I will have a better idea in the morning?");
    }

    private void prayAboutIt() {
        System.out.println("\nTime to drop to my knees and talk this out with Heavenly Father.");
    }

    private void doNothing() {
        System.out.println("\nThat's it!!! I've had it!!! I ain't doin' nothin'.");
    }

    void displayHandleObstacleView() {

    }
}
