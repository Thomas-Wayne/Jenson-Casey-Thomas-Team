/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.model;

/**
 *
 * @author Thom Casey
 */
public enum InventoryItemType {
    //These are constant values for each item, with
    //the max weight and max strength of the available items.
    ox(0,"Full"),
    wagon(700,"Medium"),
    food(20,"half"),
    water(100,"Full"),
    spareWheel(100,"Full"),
    ammunition(75,"Full");
    
    //This is the maximum weight each item is
    //physically or can carry.
    private int maxWeight;
    
    InventoryItemType(int wgt,String strength){
        maxWeight=wgt;
       maxStrength=strength;
    }
    int getmaxWeight(){
        return maxWeight;
    }
    
    private String maxStrength;
    
    private InventoryItemType() {
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getMaxStrength() {
        return maxStrength;
    }

    public void setMaxStrength(String maxStrength) {
        this.maxStrength = maxStrength;
    }

    @Override
    public String toString() {
        return super.toString() + "{ maxWeight=" + maxWeight + ", maxStrength=" + maxStrength + "}";
    }
   
     

}
