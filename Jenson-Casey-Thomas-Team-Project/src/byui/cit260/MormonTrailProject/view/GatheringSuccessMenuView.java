package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.exceptions.GetFruitsException;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.InputMismatchException;


/* @author Isabel Jenson


 */
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

                }
                break;
            }

            case "E":
                this.getEdiblePlants();
                break;

            case "Q":

                System.exit(0);

            default:
                ErrorView.display(this.getClass().getName(), "Please, choose an option from the menu...");
                break;

        }

        return false;

    }

    private void getFruits() throws GetFruitsException {
        String poundsGathered = null;
        try {
            poundsGathered = this.keyboard.readLine();
        } catch (Exception e) {

        }
        boolean success = false;
        while (!success) {
            try {

                this.console.print("Enter the pounds of fruit you gathered: ");
                int youCanCarry = Integer.parseInt(poundsGathered);

                if (youCanCarry < 1) {

                    this.console.println("That's not good. Better luck next time!");
                    success = true;
                }

                if (youCanCarry >= 1 && youCanCarry < 100) {
                    this.console.println("Excellent job, you gather some fruit for your team!");
                    success = true;
                } else if (youCanCarry > 100) {

                    this.console.println("You are only able to carry 100 pounds...");
                    success = true;
                }

            } catch (NumberFormatException | InputMismatchException e) {

                ErrorView.display(this.getClass().getName(), "Wrong input. Try a whole number...");

            }

        }
    }

    private void getEdiblePlants() {
        this.console.println("getEdiblePlants() was called");
    }

    private void getVegetables() {
        this.console.println("getVegetables() called");

    }

    private void quitGame() {
        System.exit(0);
    }

}
