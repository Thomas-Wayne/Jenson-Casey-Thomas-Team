/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

/**
 *
 * @author Wayne Thomas
 */
public class FortSceneMenuView extends ViewInterface.View {

    public FortSceneMenuView() {
        super("\nPlease choose an option: "
                + "\n********************************************"
                + "\n| Fort Scene |"
                + "\n********************************************"
                + "\nG - Visit the General Store"
                + "\nQ - Return to the Trail"
                + "\n********************************************");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

            case "G":
                this.generalStore();
                break;

            case "Q":
                this.quitGame();
                break;

            default:
                System.out.println("\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    private void generalStore() {
        GeneralStoreMenuView view = new GeneralStoreMenuView();
        view.display();
    }

    private void quitGame() {

    }
}
