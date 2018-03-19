/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.view.ViewInterface.View;

/**
 *
 * @author tcasey
 */
public class DistanceRemainingView extends View{
    
    public DistanceRemainingView() {

        super(
                "\n****************************************************"
                + "\n*                                                 *"
                + "\n* Do you want to know how far you have left until *"
                + "\n* you reach the Salt Lake Valley?                 *"
                + "\n*                                                 *"
                + "\n***************************************************"
                + "\n"
                + "\n**********************************************"
                + "\n*          | Distance Remaining |            *"
                + "\n**********************************************"
                + "\nD - Check the distance remaining.            *"
                + "\nQ - Return to previous menu                  *"
                + "\n**********************************************"
        );
    }
    @Override

    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

            case "D":
                this.calcRemainingDistance();
                break;

            case "Q":
                this.quitGame();
                
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    public long calcRemainingDistance(int[] distance) {
        long total = 0;

        for (int i = 0; i < distance.length; i++) {
            total += -distance[i];
        }
        return total;

  
    }
    private void quitGame() {
        System.exit(0);
    }

    private void calcRemainingDistance() {
        
    }
    
}
