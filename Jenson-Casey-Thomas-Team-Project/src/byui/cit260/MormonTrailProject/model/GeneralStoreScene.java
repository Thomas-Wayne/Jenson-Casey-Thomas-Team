/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.model;

import java.io.Serializable;

/**
 *
 * @author Wayne Thomas
 */
public class GeneralStoreScene extends Scene implements Serializable {

    private String inventory;

    public GeneralStoreScene() {
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "GeneralStoreScene{" + "inventory=" + inventory + '}';
    }

    public void setGeneralStoreScene(String inventory) {
        
    }

}
