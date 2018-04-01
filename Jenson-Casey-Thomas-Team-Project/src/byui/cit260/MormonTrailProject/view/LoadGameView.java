/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.GameControl;
import byui.cit260.MormonTrailProject.exceptions.GameControlException;
import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author Thomas'
 */
public class LoadGameView extends View {

    public LoadGameView() {
    super("\n Would you like to load a saved game? Press Y to Load or Q to return to the previous menu.");   
    }    

    @Override
    public boolean doAction(String inputs) {
        String filePath = GameControl.saveGamePath;
        Game game = BYUICIT260MormonTrailProject.getCurrentGame();
        if (inputs != null) {
           if(inputs.toUpperCase().equals("Y")){
            try {
                GameControl.loadGame(filePath);
               

            } catch (GameControlException e) {
                ErrorView.display(this.getClass().getName(), e.getMessage());
                return false;
            } finally {
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
                return true;
            }
        }
        }
        return false;

    }

    private String[] getInputs(String promptMessage) {
        String input = "";
        String[] inputs = new String[]{input};

        try {
            boolean valid = false;

            while (!valid) {

                input = this.keyboard.readLine();

                if (inputs.length < 1) {

                    ErrorView.display(this.getClass().getName(), "\nInvalid value: Value cannot be blank");
                    continue;
                }

                break;

            }
        } catch (Exception e) {

            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }

        this.console.println("\n" + promptMessage);

        return inputs;

    }
}
