/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.model;

/** 
 *
 * @author Jenson, Casey, Thomas Team
 */
public enum Pace {

    
   slowSpeed(2), averageSpeed(10),fastSpeed(16);
    
    private int paceValue;
    
    private Pace(int paceValue) {
        this.paceValue = paceValue;
    }
    public int getPaceValue(){
        return this.paceValue;
    }

    public void setPaceValue(int paceValue) {
        this.paceValue = paceValue;
    }
    
}
