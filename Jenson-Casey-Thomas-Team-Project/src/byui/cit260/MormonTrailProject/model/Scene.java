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
public class Scene implements Serializable {

    private String discription;
    private String riverCrossingScene;
    private String fortScene;
    private String townScene;
    private String hotelScene;
    private String generalStoreScene;
    private String trailStopScene;

    public Scene() {
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.discription);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "discription=" + discription + ", riverCrossingScene=" + riverCrossingScene + ", fortScene=" + fortScene + ", townScene=" + townScene + ", hotelScene=" + hotelScene + ", generalStoreScene=" + generalStoreScene + ", trailStopScene=" + trailStopScene + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.discription, other.discription)) {
            return false;
        }
        return true;
    }

    public String getRiverCrossingScene() {
        return riverCrossingScene;
    }

    public void setRiverCrossingScene(String riverCrossingScene) {
        this.riverCrossingScene = riverCrossingScene;
    }

    public String getTrailStopScene() {
        return trailStopScene;
    }

    public void setTrailStopScene(String trailStopScene) {
        this.trailStopScene = trailStopScene;
    }

    public String getFortScene() {
        return fortScene;
    }

    public void setFortScene(String fortScene) {
        this.fortScene = fortScene;
    }

    public String getTownScene() {
        return townScene;
    }

    public void setTownScene(String townScene) {
        this.townScene = townScene;
    }

    public String getHotelScene() {
        return hotelScene;
    }

    public void setHotelScene(String hotelScene) {
        this.hotelScene = hotelScene;
    }

    public String getGeneralStoreScene() {
        return generalStoreScene;
    }

    public void setGeneralStoreScene(String generalStoreScene) {
        this.generalStoreScene = generalStoreScene;
    }
}
