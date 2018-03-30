/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.view.ViewInterface.View;

/**
 *
 * @author Thomas'
 */
public class SaveGameView extends View{

    public SaveGameView() {
    }
  

    public SaveGameView(String message) {
        super(message);
    }

    @Override
    public boolean doAction(String value) {
        return false;
    }
    
     @Override
        public String getInput() {
        return null;
     
     }
     
    
}
