/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.view.ViewInterface.View;

/**
 *
 * @author Isabel Jenson
 */
public class GeneralStoreMenuView extends View {

    public GeneralStoreMenuView() {

        super(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n*                     Welcome!                        *"
                + "\n*                                                     *"
                + "\n*******************************************************"
                + "\n"
                + "\n**********************************************"
                + "\n*                 General Store              *"
                + "\n**********************************************"
                + "\nC - View current supplies                    *"
                + "\nB - Buy                                      *"
                + "\nS - Sell                                     *"
                + "\nP - Print Inventory                          *"
                + "\nQ - Leave General Store                      *"
                + "\n**********************************************");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

            case "C":
                this.viewCurrentSupplies();
                break;

            case "B":
                this.buy();
                break;

            case "S":
                this.sell();
                break;
                
            case "P":
                this.print();
                break;

            case "Q":
                this.quitGame();

            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    private void viewCurrentSupplies() {
        CurrentSuppliesView view = new CurrentSuppliesView();
        view.display();
    }

    private void buy() {
        BuyMenuView view = new BuyMenuView();
        view.display();
    }

    private void sell() {

        this.console.println("\n sell() was called.");
    }
    
    private void print() {
        PrintInventoryView printInventoryView = new PrintInventoryView();
        printInventoryView.display();
    }

    private void quitGame() {
        System.exit(0);
    }

}
