/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.MapControl;
import byui.cit260.MormonTrailProject.model.Distance;
import byui.cit260.MormonTrailProject.model.Scene;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;

/**
 *
 * @author tcasey
 */
public class DistanceRemainingView extends View {

    public DistanceRemainingView() {

        super(
                "\n**************************************************"
                + "\n"
                + "\n Do you want to know how far you have left until"
                + "\n you reach the Salt Lake Valley?"
                + "\n"
                + "\n************************************************"
                + "\n"
                + "\n**********************************************"
                + "\n     | Type the number of your location |"
                + "\n**********************************************"

        );
        
       Scene[] scenes = MapControl.createScenes();
       String str = null;
       int n = Integer.parseInt(str);
        for (int i = 0 ; i < scenes.length; i ++){
            if (scenes[i] == null){
                continue;
            }
            displayMessage += "\n" + (i + 1) + " " + scenes[i].getName();
            
        }
    }

    @Override

    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

            case "N":
                this.calcRemainingDistance(0);
                break;

            case "G":
                this.calcRemainingDistance(1);
                break;

            case "P":
                this.calcRemainingDistance(2);
                break;

            case "K":
                this.calcRemainingDistance(3);
                break;

            case "W":
                this.calcRemainingDistance(4);
                break;

            case "C":
                this.calcRemainingDistance(5);
                break;

            case "L":
                this.calcRemainingDistance(6);
                break;

            case "M":
                this.calcRemainingDistance(7);
                break;

            case "F":
                this.calcRemainingDistance(8);
                break;

            case "I":
                this.calcRemainingDistance(9);
                break;

            case "B":
                this.calcRemainingDistance(10);
                break;
                
            case "Q":
                this.quitGame();

            default:
                int n = Integer.parseInt(Scene.name);
                System.out.println("\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    private void quitGame() {
        System.exit(0);
    }


    private void calcRemainingDistance(int i) {
        Distance distance = new Distance();
        distance.display();
    }

}
