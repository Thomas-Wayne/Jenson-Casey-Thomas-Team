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
    ox, wagon, food, spareWheel, ammunition;
    
     private int maxWeight;
     private int maxStrength;
     

    private InventoryItemType() {
        
    }

    
  
    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxStrength() {
        return maxStrength;
    }

    public void setMaxStrength(int maxStrength) {
        this.maxStrength = maxStrength;
    }

    @Override
    public String toString() {
        return "InventoryItemType{" + "maxWeight=" + maxWeight + ", maxStrength=" + maxStrength + '}';
    }
   
     

}
