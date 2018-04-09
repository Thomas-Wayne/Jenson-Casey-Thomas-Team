/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;
import byui.cit260.MormonTrailProject.control.GameControl;
import byui.cit260.MormonTrailProject.model.Inventory;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.io.IOException;

/**
 *
 * @author Jenson
 */
public class PrintInventoryView extends View {

    public PrintInventoryView() {

        super("To generate a report, please provide a file name below. "
                + "\n *** PLEASE NOTE *** \n The report must be formatted as "
                + "a .dat file. Example: file.dat \n  ");
    }

    public PrintInventoryView(String message) {
        super(message);
    }

    @Override
    public boolean doAction(String inputs) {
        String printPath = inputs;
        Inventory[] inventory = new Inventory[9];
        if (inputs != null) {

            try {
                GameControl.printInventory(inventory, printPath);
                this.console.println("The report was generated and saved successfully to " + printPath);
                return true;
            } catch (Exception e) {
                InventoryPrintError.display(this.getClass().getName(), e.getMessage());
                return false;
            }
        }
        return false;

    }

    private String getInputs(String promptMessage) {
        String input = "";
        String[] inputs = new String[]{input};

        try {
            boolean valid = false;

            while (!valid) {

                input = this.keyboard.readLine();

                if (inputs.length < 1) {

                    InventoryPrintError.display(this.getClass().getName(), "\nInvalid value: Please enter a file name or path");
                    continue;
                }

                break;

            }
        } catch (IOException e) {

            InventoryPrintError.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }

        this.console.println("\n" + promptMessage);
        return input;

    }

}
