/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.PlayControl;
import byui.cit260.MormonTrailProject.view.GetVegetablesView;
import byui.cit260.MormonTrailProject.exceptions.PlayControlException;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isabel Jenson
 */
public class GatheringSuccessMenuView extends View {

    public GatheringSuccessMenuView() {

        super(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* You are about to go gather some stuff to eat,       *"
                + "\n*                  good luck!                         *"
                + "\n*******************************************************"
                + "\n"
                + "\n**********************************************"
                + "\n*                 Gather:                    *"
                + "\n**********************************************"
                + "\nV - Vegetables                               *"
                + "\nF - Fruits                                   *"
                + "\nE - Edible plants                            *"
                + "\nQ - Go back to previous menu                 *"
                + "\n**********************************************");
    }

    @Override
    public boolean doAction(String value)  {
        try {
            PlayControl.calcGatheringSuccess(0, 0, 0);
            

        } catch (PlayControlException e) {
              System.out.println(e.getMessage());
            return false;
        }
        value = value.toUpperCase();
        switch (value) {

            case "V":
                this.getVegetables();
                
                break;

            case "F":
                this.getFruits();
                break;

            case "E":
                this.getEdiblePlants();
                break;

            case "Q":
                this.quitGame();

            default:
                System.out.println("Please, choose an option from the menu...");
               

        }

        return false;

    }

    private void getFruits() {
        GetVegetablesView view = new GetVegetablesView();
        view.display();
    }

    private void getEdiblePlants() {
        GetVegetablesView view = new GetVegetablesView();
        view.display();
    }

    private void getVegetables() {
        GetVegetablesView view = new GetVegetablesView();
        view.display();
    }

    private void quitGame() {
        System.exit(0);
    }

}
