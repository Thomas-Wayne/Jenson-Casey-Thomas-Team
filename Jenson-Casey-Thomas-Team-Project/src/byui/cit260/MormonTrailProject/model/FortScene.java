/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Wayne Thomas
 */
public class FortScene extends Scene implements Serializable {

    private String generalStoreScene;

    public FortScene() {
    }

    public String getGeneralStoreScene() {
        return generalStoreScene;
    }

    public void setGeneralStoreScene(String generalStoreScene) {
        this.generalStoreScene = generalStoreScene;
    }

    @Override
    public String toString() {
        return "FortScene{" + "generalStoreScene=" + generalStoreScene + '}';
    }

}
