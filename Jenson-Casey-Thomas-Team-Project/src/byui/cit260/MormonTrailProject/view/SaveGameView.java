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
import java.io.IOException;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author Jenson, Casey, Thomas
 */
public class SaveGameView extends View {

    public SaveGameView() {

        super("\n Would you like to save your game? (Y / N)");
    }

    public SaveGameView(String message) {
        super(message);
    }

    public boolean doAction(String inputs) {
        String filePath = GameControl.saveGamePath;
        Game game = BYUICIT260MormonTrailProject.getCurrentGame();
        this.console.println("we made it this far try statement before saveGame");
        if (inputs != null) {
            
           try {
                        
                GameControl.saveGame(game, filePath);
                this.console.println("The file was saved successfully to " + filePath);
                return true;

            } catch (GameControlException e) {

                ErrorView.display(this.getClass().getName(), e.getMessage());
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

                if (inputs.length < 1 || inputs.length > 1 ) {

                    ErrorView.display(this.getClass().getName(), "\nInvalid value: Please enter Y or N");
                    continue;
                }

                break;

            }
        } catch (IOException e) {

            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }

        this.console.println("\n" + promptMessage);
        return input;

        

    }

}
