package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.exceptions.GetFruitsException;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GatheringSuccessMenuView extends View {

    public GatheringSuccessMenuView() {

        super("\n"
                + "\n*************************************************"
                + "\n| You are about to gather some stuff, good luck!|"
                + "\n*************************************************"
                + "\nF - Get Fruits"
                + "\nV - Get vegetables"
                + "\nE - Get edible plants"
                + "\nQ - Go back to previous menu"
                + "\n*************************************************"
        );

    }

    @Override
    public boolean doAction(String value) {

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
                break;
            }

            case "E":
                this.getEdiblePlants();
                break;

            default:
                System.out.println("Please, choose an option from the menu...");
                break;
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

                if (youCanCarry >= 1 && youCanCarry < 100) {
                    System.out.println("Excellent job, you gather some fruit for your team!");
                    success = true;
                } else if (youCanCarry > 100) {

                    System.out.println("You are only able to carry 100 punds...");
                    success = true;
                }

            } catch (NumberFormatException | InputMismatchException ex) {
                poundsGathered.next();
                System.out.println("Wrong input. Try a whole number...");

            }

        }
    }

    private void getEdiblePlants() {
        System.out.println("getEdiblePlants() was called");
    }

    private void getVegetables() {
        System.out.println("getVegetables() called");

    }

    private void quitGame() {
        System.exit(0);
    }

}
