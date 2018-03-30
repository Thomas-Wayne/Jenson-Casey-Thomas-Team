/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.view.ViewInterface.View;

/**
 *
 * @author Wayne Thomas
 */
public class GoHuntingSceneMenuView extends View {

    public GoHuntingSceneMenuView() {

        super(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* You are about to go gather some stuff to eat,       *"
                + "\n*                  good luck!                         *"
                + "\n*******************************************************"
                + "\n"
                + "\n**********************************************"
                + "\n*                 Hunt menu:                 *"
                + "\n**********************************************"
                + "\nB - Big Game(buffalo,mountain lion, ram, etc)*"
                + "\nS - Small Game (varmints, rabbit, etc)       *"
                + "\nF - Fish                                     *"
                + "\nQ - Go back to previous menu                 *"
                + "\n**********************************************");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

            case "B":
                this.getBigGame();
                break;

            case "S":
                this.getSmallGame();
                break;

            case "F":
                this.getFish();
                break;

            case "Q":
                this.quitGame();

            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    private void getBigGame() {
        GoHuntingView view = new GoHuntingView();
        view.display();
    }

    private void getSmallGame() {
        GoHuntingView view = new GoHuntingView();
        view.display();
    }

    private void getFish() {
        GoHuntingView view = new GoHuntingView();
        view.display();
    }

    private void quitGame() {
        System.exit(0);
    }

}
